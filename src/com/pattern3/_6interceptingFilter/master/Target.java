package com.pattern3._6interceptingFilter.master;

/**
 * 请求处理程序
 * @author newuser
 */
public class Target {

	public void execute(String request){
		System.out.println("Executing request: " + request);
	}
}
