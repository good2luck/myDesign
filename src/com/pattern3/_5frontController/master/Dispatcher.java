package com.pattern3._5frontController.master;

import com.pattern3._5frontController.base.HomeView;
import com.pattern3._5frontController.base.StudentView;

/**
 * 调度器
 * @author newuser
 */
public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;
	
	public Dispatcher() {
		this.studentView = new StudentView();
		this.homeView = new HomeView();
	}
	
	//调度请求
	public void dispatch(String request){
		if(request == null){
			System.out.println("Request Error.");
			return;
		}
		if(request.equalsIgnoreCase("STUDENT")){
			studentView.show();
		} else {
			homeView.show();
		}
	}
	
}
