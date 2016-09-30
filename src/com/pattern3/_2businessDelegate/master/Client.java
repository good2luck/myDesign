package com.pattern3._2businessDelegate.master;

/**
 * 客户端
 * @author newuser
 */
public class Client {

	//业务代表
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	//执行任务
	public void doTask(){
		businessDelegate.doTask();
	}
	
}
