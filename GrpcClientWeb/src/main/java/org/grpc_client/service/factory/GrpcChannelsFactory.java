package org.grpc_client.service.factory;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Kastalski
 */
@Component
public class GrpcChannelsFactory implements ChannelsFactory {

	private volatile ManagedChannel channel;

	@Override
	public Channel createChannel(final String host, final int port) {
		if (channel == null) {
			channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		}
		return channel;
	}

	@Override
	public void destroyChannels() {
		if (!channel.isShutdown()) {
			channel.shutdownNow();
		}
	}

}
