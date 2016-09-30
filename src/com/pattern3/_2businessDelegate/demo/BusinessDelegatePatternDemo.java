package com.pattern3._2businessDelegate.demo;

import com.pattern3._2businessDelegate.master.BusinessDelegate;
import com.pattern3._2businessDelegate.master.Client;

/**
 * 使用BusinessDelegate和Client来演示业务代表模式
 * @author newuser
 */
public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
		
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
	
}
