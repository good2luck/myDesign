package com.pattern3._6interceptingFilter.demo;

import com.pattern3._6interceptingFilter.base.AuthenticationFilter;
import com.pattern3._6interceptingFilter.base.DebugFilter;
import com.pattern3._6interceptingFilter.master.Client;
import com.pattern3._6interceptingFilter.master.FilterManager;
import com.pattern3._6interceptingFilter.master.Target;

/**
 * 拦截过滤器模式
 * @author newuser
 */
public class InterceptingFilterDemo  {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.addFilter(new AuthenticationFilter());
		filterManager.addFilter(new DebugFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
