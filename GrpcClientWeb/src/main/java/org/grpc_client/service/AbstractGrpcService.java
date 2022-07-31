package org.grpc_client.service;

import org.grpc_client.service.converter.EntitiesConverter;
import org.grpc_client.service.factory.ConverterFactory;

/**
 * @author Sergey Kastalski
 */
public abstract class AbstractGrpcService<F, T> implements GrpcEntityService<T>, GrpcStreamService {

	private final EntitiesConverter<F, T> converterForward;

	private final EntitiesConverter<T, F> converterBackward;

	protected AbstractGrpcService(final ConverterFactory<F, T> converterFactory) {
		converterForward = converterFactory.createConverterForward();
		converterBackward = converterFactory.createConverterBackward();
	}

	protected T convertForward(final F from) {
		return converterForward.convert(from);
	}

	protected F convertBackward(final T from) {
		return converterBackward.convert(from);
	}

}
