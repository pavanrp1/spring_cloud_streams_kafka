/**
 * 
 */
package com.example.pavan.mef;

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
@EnableBinding(Minion1.class)
public class Minion1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Minion1Application.class, args);
	}
 
	@Bean
	@InboundChannelAdapter(value = Minion1.SAMPLE, poller = @Poller(fixedDelay = "10000", maxMessagesPerPoll = "1"))
	public MessageSource<SendingBean> timerMessageSource() {
		return () -> MessageBuilder.withPayload(new SendingBean("Message from Minion1")).build();
	}

}