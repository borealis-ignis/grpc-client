package org.grpc_client.service;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.Channel;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.grpc_client.model.dto.EmployeeDto;
import org.grpc_server.proto.EmployeeProfile;
import org.grpc_server.proto.EmployeeServiceGrpc;
import org.grpc_client.service.factory.EmployeeConverterFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * @author Sergey Kastalski
 */
@Slf4j
@Service
public class GrpcEmployeeService extends AbstractGrpcService<EmployeeProfile, EmployeeDto> {

	private final EmployeeServiceGrpc.EmployeeServiceBlockingStub blockingStub;

	private final EmployeeServiceGrpc.EmployeeServiceStub nonBlockingStub;

	public GrpcEmployeeService(final Channel channel, final EmployeeConverterFactory converterFactory) {
		super(converterFactory);
		blockingStub = EmployeeServiceGrpc.newBlockingStub(channel);
		nonBlockingStub = EmployeeServiceGrpc.newStub(channel);
	}

	@Override
	public EmployeeDto getEntity(final long employeeId) {
		final Int64Value request = Int64Value.of(employeeId);
		final EmployeeProfile response = blockingStub.getEmployee(request);
		return convertForward(response);
	}

	@Override
	public EmployeeDto createEntity(final EmployeeDto employeeDto) {
		final EmployeeProfile request = convertBackward(employeeDto);
		final EmployeeProfile response = blockingStub.addEmployee(request);
		return convertForward(response);
	}

	@Override
	public boolean deleteEntity(final long employeeId) {
		final Int64Value request = Int64Value.of(employeeId);
		try {
			final BoolValue response = blockingStub.deleteEmployee(request);
			return response.getValue();
		} catch (final Exception e) {
			log.warn("Impossible to remove Employee by id=" + employeeId +", reason: " + e.getMessage());
		}
		return false;
	}

	@Override
	public void runClientStream() {
		final StreamObserver<Empty> responseObserver = getSimpleObserver("clientStream", (empty) -> "", () -> {});

		final StreamObserver<EmployeeProfile> requestObserver = nonBlockingStub.clientStream(responseObserver);
		try {
			for (int i = 1; i <= 5; i++) {
				requestObserver.onNext(EmployeeProfile.newBuilder().setEmployeeName("Employee-" + i).build());
			}
		} catch (final Exception e) {
			requestObserver.onError(e);
			throw e;
		}
		requestObserver.onCompleted();
	}

	@Override
	public List<EmployeeDto> runServerStream() {
		final List<EmployeeDto> employees = new ArrayList<>();
		try {
			final Iterator<EmployeeProfile> responsesIterator = blockingStub.serverStream(Empty.newBuilder().build());
			responsesIterator.forEachRemaining(employee -> employees.add(convertForward(employee)));
		} catch (final Exception e) {
			log.error("Smth went wrong", e);
			throw e;
		}
		log.info("Finished streaming");
		employees.forEach(empl -> log.info("Employee {id=" + empl.getEmployeeId() + ", name=" + empl.getEmployeeName() + "}"));
		return employees;
	}

	@Override
	public final List<EmployeeDto> runBiStream() {
		final long waitResultTimeout = 5000;
		final List<EmployeeDto> employees = new ArrayList<>();
		final Function<EmployeeProfile, String> addAndReturnEmployee = (empl) -> {
			employees.add(convertForward(empl));
			return empl.toString();
		};
		final Processor onCompletedAction = () -> {
			synchronized (employees) {
				employees.notify();
			}
		};

		synchronized (employees) {
			final StreamObserver<EmployeeProfile> responseObserver = getSimpleObserver("biStream", addAndReturnEmployee, onCompletedAction);
			final StreamObserver<EmployeeProfile> requestObserver = nonBlockingStub.biDirectionalStream(responseObserver);
			try {
				requestObserver.onNext(EmployeeProfile.newBuilder().setEmployeeName("Parent1").build());
				requestObserver.onNext(EmployeeProfile.newBuilder().setEmployeeName("Parent2").build());
			} catch (final Exception e) {
				requestObserver.onError(e);
				throw e;
			}
			requestObserver.onCompleted();
			try {
				employees.wait(waitResultTimeout);
			} catch (final InterruptedException e) {
				log.warn("Interrupted", e);
				return employees;
			}
		}
		return employees;
	}

	private <T> StreamObserver<T> getSimpleObserver(final String tag, final Function<T, String> returnMessage, final Processor onCompletedAction) {
		return new StreamObserver<>() {
			@Override
			public void onNext(final T o) {
				log.info("[" + tag + "] onNext(): " + returnMessage.apply(o));
			}

			@Override
			public void onError(final Throwable throwable) {
				log.error("[" + tag + "] Finished unsuccessfully", throwable);
			}

			@Override
			public void onCompleted() {
				log.info("[" + tag + "] Finished successfully");
				onCompletedAction.process();
			}
		};
	}

}

