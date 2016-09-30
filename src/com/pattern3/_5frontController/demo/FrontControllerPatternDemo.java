package com.pattern3._5frontController.demo;

import com.pattern3._5frontController.master.FrontController;

/**
 * 前端控制器模式Demo
 * @author newuser
 */
public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		
		FrontController controller = new FrontController();
		controller.dispacherRequest("HOME");
		System.out.println("===============");
		controller.dispacherRequest("STUDENT");
		
	}
}
