/**
 * 
 */
package com.example.pavan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author pk015603
 *
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class EdmpSampleStreamSinkApplication {
 
	private static Logger logger = LoggerFactory.getLogger(EdmpSampleStreamSinkApplication.class);
 
	public static void main(String[] args) {
		SpringApplication.run(EdmpSampleStreamSinkApplication.class, args);
	}
 
	@StreamListener(Sink.INPUT)
	public void loggerSink(SinkTimeInfo sinkTimeInfo) {
		logger.info("Received: " + sinkTimeInfo.toString());
	}
	
}
