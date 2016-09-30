package com.pattern3._7serviceLocator.demo;

import com.pattern3._7serviceLocator.base.Service;
import com.pattern3._7serviceLocator.master.ServiceLocator;

/**
 * 服务定位器模式Demo
 * @author newuser
 */
public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		
		System.out.println("==================");
		service = ServiceLocator.getService("Service2");
		service.execute();
		
		System.out.println("==================");
		service = ServiceLocator.getService("Service1");
		service.execute();
		
		System.out.println("==================");
		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
