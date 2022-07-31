package org.grpc_client.service.factory;

import io.grpc.Channel;

/**
 * @author Sergey Kastalski
 */
public interface ChannelsFactory {

	Channel createChannel(String host, int port);

	void destroyChannels();

}
