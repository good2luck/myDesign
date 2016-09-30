package com.pattern3._6interceptingFilter.base;

/**
 * 实体过滤器--日志
 * @author newuser
 */
public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}

}
