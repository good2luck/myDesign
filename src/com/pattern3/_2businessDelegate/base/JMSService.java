package com.pattern3._2businessDelegate.base;

/**
 * JMS业务服务
 * @author newuser
 */
public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
