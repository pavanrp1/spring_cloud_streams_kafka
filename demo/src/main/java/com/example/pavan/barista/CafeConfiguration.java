/**
 * 
 */
package com.example.pavan.barista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author pk015603
 *
 */
@SpringBootApplication
@EnableBinding(Barista.class)
public class CafeConfiguration {
	
	public static void main(String[] args) {
		SpringApplication.run(CafeConfiguration.class, args);
	}
 
	@Bean
	@InboundChannelAdapter(value = Barista.SAMPLE, poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1"))
	public MessageSource<SendingBean> timerMessageSource() {
		return () -> MessageBuilder.withPayload(new SendingBean("pavan")).build();
	}

}
