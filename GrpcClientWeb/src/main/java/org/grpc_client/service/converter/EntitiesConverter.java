package org.grpc_client.service.converter;

/**
 * @author Sergey Kastalski
 */
@FunctionalInterface
public interface EntitiesConverter<F, T> {

	T convert(F from);

}
