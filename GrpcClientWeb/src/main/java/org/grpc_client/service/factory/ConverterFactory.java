package org.grpc_client.service.factory;

import org.grpc_client.service.converter.EntitiesConverter;

/**
 * @author Sergey Kastalski
 */
public interface ConverterFactory<F, T> {

	EntitiesConverter<F, T> createConverterForward();

	EntitiesConverter<T, F> createConverterBackward();

}
