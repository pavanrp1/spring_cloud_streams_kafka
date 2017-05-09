/**
 * 
 */
package com.example.pavan;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author pk015603
 *
 */
public interface MultiSource {
	String SAMPLE = "sample-source";

	@Output(SAMPLE)
	MessageChannel output1();
}
