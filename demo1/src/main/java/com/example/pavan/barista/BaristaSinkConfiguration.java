package com.example.pavan.barista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author pk015603
 *
 */
//@SpringBootApplication
//@EnableBinding(BaristaIn.class)
public class BaristaSinkConfiguration {
 
	private static Logger logger = LoggerFactory.getLogger(BaristaSinkConfiguration.class);
 
	public static void main(String[] args) {
		SpringApplication.run(BaristaSinkConfiguration.class, args);
	}
 
	@StreamListener(BaristaIn.SAMPLE)
	public void loggerSink(RecievingBean bean) {
		logger.info("Received: " + bean.toString());
	}
	
}