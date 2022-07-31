package org.grpc_client.controller;

import lombok.extern.slf4j.Slf4j;
import org.grpc_client.model.dto.EmployeeDto;
import org.grpc_client.service.GrpcEmployeeService;
import org.grpc_client.service.GrpcStreamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sergey Kastalski
 */
@Slf4j
@RestController
public class RestEmployeeStreamController {

	private final GrpcStreamService grpcEntityService;

	public RestEmployeeStreamController(final GrpcEmployeeService grpcEntityService) {
		this.grpcEntityService = grpcEntityService;
	}

	@GetMapping(path = "employee/client-stream")
	public ResponseEntity<?> runClientStream() {
		grpcEntityService.runClientStream();
		return ResponseEntity.ok().build();
	}

	@GetMapping(path = "employee/server-stream")
	public ResponseEntity<List<EmployeeDto>> runServerStream() {
		return ResponseEntity.ok(grpcEntityService.runServerStream());
	}

	@GetMapping(path = "employee/bi-stream")
	public ResponseEntity<List<EmployeeDto>> runBiStream() {
		return ResponseEntity.ok(grpcEntityService.runBiStream());
	}

	@ExceptionHandler
	public ResponseEntity<?> handle(final Throwable e) {
		log.error("Operation with Employee is failed: " + e.getMessage());
		return ResponseEntity.internalServerError().build();
	}

}
