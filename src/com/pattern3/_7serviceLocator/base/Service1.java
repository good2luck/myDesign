package com.pattern3._7serviceLocator.base;

/**
 * 服务1
 * @author newuser
 */
public class Service1 implements Service {

	@Override
	public void execute() {
		System.out.println("Executing Service1.");
	}

	@Override
	public String getName() {
		return "Service1";
	}

}
