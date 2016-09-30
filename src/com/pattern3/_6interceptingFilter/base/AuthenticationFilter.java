package com.pattern3._6interceptingFilter.base;

/**
 * 实体过滤器--身份
 * @author newuser
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Authentication request: " + request);
	}

}
