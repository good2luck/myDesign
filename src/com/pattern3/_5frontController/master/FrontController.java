package com.pattern3._5frontController.master;

/**
 * 前端控制器 
 * @author newuser
 */
public class FrontController {
	
	//调度器
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}
	
	//身份认证
	private boolean isAuthenticUser(){
		System.out.println("User is authenticated successfully.");
		return true;
	}
	
	//记录请求
	private void trackReauest(String request){
		System.out.println("Page requested: " + request);
	}
	
	//调度请求
	public void dispacherRequest(String request){
		//记录请求
		trackReauest(request);
		
		//身份认证
		if(isAuthenticUser()){
			dispatcher.dispatch(request);
		}
	}
	
}