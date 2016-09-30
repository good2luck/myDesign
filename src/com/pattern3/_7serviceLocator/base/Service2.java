package com.pattern3._7serviceLocator.base;

/**
 * 服务2
 * @author newuser
 */
public class Service2 implements Service {

	@Override
	public void execute() {
		System.out.println("Executing Service2.");
	}

	@Override
	public String getName() {
		return "Service2";
	}

}
