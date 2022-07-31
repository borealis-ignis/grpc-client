package org.grpc_client.service.factory;

import org.grpc_client.model.dto.EmployeeDto;
import org.grpc_server.proto.EmployeeProfile;
import org.grpc_client.service.converter.EntitiesConverter;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Kastalski
 */
@Component
public class EmployeeConverterFactory implements ConverterFactory<EmployeeProfile, EmployeeDto> {

	@Override
	public EntitiesConverter<EmployeeProfile, EmployeeDto> createConverterForward() {
		return (grpc) -> new EmployeeDto(grpc.getEmployeeId(), grpc.getEmployeeName());
	}

	@Override
	public EntitiesConverter<EmployeeDto, EmployeeProfile> createConverterBackward() {
		return (dto) -> EmployeeProfile.newBuilder().setEmployeeId(dto.getEmployeeId()).setEmployeeName(dto.getEmployeeName()).build();
	}

}
