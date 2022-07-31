package org.grpc_client.config;

import io.grpc.Channel;
import org.grpc_client.service.factory.ChannelsFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

/**
 * @author Sergey Kastalski
 */
@Configuration
public class GrpcClientConfiguration {

	private final ChannelsFactory channelsFactory;

	public GrpcClientConfiguration(final ChannelsFactory channelsFactory) {
		this.channelsFactory = channelsFactory;
	}

	@PreDestroy
	public void destroyResources() {
		channelsFactory.destroyChannels();
	}

	@Bean
	public Channel getGrpcChannel(@Value("${grpc.server.employee.host}") final String host, @Value("${grpc.server.employee.port}") final int port) {
		return channelsFactory.createChannel(host, port);
	}

}
