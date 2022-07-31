package org.grpc_client.controller;

import io.grpc.Metadata;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.ProtoUtils;
import lombok.extern.slf4j.Slf4j;
import org.grpc_client.model.dto.EmployeeDto;
import org.grpc_client.service.GrpcEmployeeService;
import org.grpc_client.service.GrpcEntityService;
import org.grpc_server.proto.EmployeeError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Sergey Kastalski
 */
@Slf4j
@RestController
public class RestEmployeeController {

	private static final String DESCRIPTION_HEADER = "description";

	public static final Metadata.Key<String> HTTP_STATUS_KEY = Metadata.Key.of("httpStatus", Metadata.ASCII_STRING_MARSHALLER);

	private static final Metadata.Key<EmployeeError> EMPLOYEE_ERROR_KEY = ProtoUtils.keyForProto(EmployeeError.getDefaultInstance());

	private final GrpcEntityService<EmployeeDto> grpcEntityService;

	public RestEmployeeController(final GrpcEmployeeService grpcEntityService) {
		this.grpcEntityService = grpcEntityService;
	}

	@GetMapping(path = "employee/{id}")
	public EmployeeDto getEmployee(@PathVariable final long id) {
		return grpcEntityService.getEntity(id);
	}

	@PostMapping(path = "employee")
	public EmployeeDto createEmployee(@RequestBody final EmployeeDto employeeDto) {
		return grpcEntityService.createEntity(employeeDto);
	}

	@DeleteMapping(path = "employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable final long id) {
		if (grpcEntityService.deleteEntity(id)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@ExceptionHandler
	public ResponseEntity<?> handle(final Throwable e) {
		log.error("Operation with Employee is failed: " + e.getMessage());
		if (e instanceof StatusRuntimeException) {
			final Metadata metadata = ((StatusRuntimeException) e).getTrailers();
			final Optional<String> httpStatus = Optional.ofNullable((metadata != null)? metadata.get(HTTP_STATUS_KEY) : null);
			final Optional<EmployeeError> employeeError = Optional.ofNullable((metadata != null)? metadata.get(EMPLOYEE_ERROR_KEY) : null);

			final ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(Integer.parseInt(httpStatus.orElse("500")));
			employeeError.ifPresent(error -> bodyBuilder.header(DESCRIPTION_HEADER, error.getDescription()));
			return bodyBuilder.build();
		}
		return ResponseEntity.internalServerError().build();
	}

}
