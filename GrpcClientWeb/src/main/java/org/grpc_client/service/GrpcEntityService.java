package org.grpc_client.service;

/**
 * @author Sergey Kastalski
 */
public interface GrpcEntityService<E> {

	E getEntity(long entityId);

	E createEntity(E entity);

	boolean deleteEntity(long entityId);

}
