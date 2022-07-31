package org.grpc_client.service;

import org.grpc_client.model.dto.EmployeeDto;

import java.util.List;

/**
 * @author Sergey Kastalski
 */
public interface GrpcStreamService {

	List<EmployeeDto> runServerStream();

	void runClientStream();

	List<EmployeeDto> runBiStream();

}
