/**
 * 
 */
package com.example.pavan.barista;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author pk015603
 *
 */
public interface Barista {

	String SAMPLE = "barista";

	@Input("inboundOrders")
	SubscribableChannel orders();

	@Output(SAMPLE)
	MessageChannel hotDrinks();

	@Output(SAMPLE)
	MessageChannel coldDrinks();

}
