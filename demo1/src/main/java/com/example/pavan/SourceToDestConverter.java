///**
// * 
// */
//package com.example.pavan;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.converter.MessageConversionException;
//import org.springframework.stereotype.Component;
//import org.springframework.util.MimeType;
//
//import kafka.message.Message;
//
///**
// * @author pk015603
// *
// */
//@Component
//@Configuration
//public class SourceToDestConverter extends AbstractFromMessageConverter{
//	
//	public SourceToDestConverter() {
//		super(MimeType.valueOf("test/bar"));
//	}
//
//	@Override
//	protected Class<?>[] supportedPayloadTypes() {
//		// TODO Auto-generated method stub
//		return new Class<?>[] {Foo.class};
//	}
//
//	@Override
//	protected Class<?>[] supportedTargetTypes() {
//		// TODO Auto-generated method stub
//		return new Class[] {Bar.class};
//	}
//	
//	@Override
//	public Object convertFromInternal(Message<?> message, Class<?> targetClass, Object conversionHint){
//		
//		Object result = null;
//		try {
//			if (message.getPayload() instanceof TimeInfo) {
//				TimeInfo fooPayload = (TimeInfo) message.getPayload();
//				result = new SinkTimeInfo(fooPayload.getTime(),fooPayload.getLabel());
//			}
//		}
//		catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MessageConversionException(e.getMessage());
//		}
//		return result;
//	}
//
//}
