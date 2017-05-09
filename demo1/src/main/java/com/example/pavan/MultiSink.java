/**
 * 
 */
package com.example.pavan;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author pk015603
 *
 */
public interface MultiSink {
	String SAMPLE = "sample-sink";

	@Input(SAMPLE)
	SubscribableChannel input1();
}
