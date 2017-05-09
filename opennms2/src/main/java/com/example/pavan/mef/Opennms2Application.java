package com.example.pavan.mef;

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
@SpringBootApplication
@EnableBinding(OpenNMSIn.class)
public class Opennms2Application {
 
	private static Logger logger = LoggerFactory.getLogger(Opennms2Application.class);
 
	public static void main(String[] args) {
		SpringApplication.run(Opennms2Application.class, args);
	}
 
	@StreamListener(OpenNMSIn.SAMPLE)
	public void loggerSink(RecievingBean bean) {
		logger.info("Received: " + bean.toString());
	}
	
}
