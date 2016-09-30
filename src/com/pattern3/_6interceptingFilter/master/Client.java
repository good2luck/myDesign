package com.pattern3._6interceptingFilter.master;

/**
 * 客户端
 * @author newuser
 */
public class Client {

	private FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
	}
	
	//发送请求
	public void sendRequest(String request){
		filterManager.filterRequest(request);
	}
}
