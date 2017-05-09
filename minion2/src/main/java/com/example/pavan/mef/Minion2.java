/**
 * 
 */
package com.example.pavan.mef;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author pk015603
 *
 */
public interface Minion2 {

	String SAMPLE = "minion2";

	@Output(Minion2.SAMPLE)
	MessageChannel minion2();

}
