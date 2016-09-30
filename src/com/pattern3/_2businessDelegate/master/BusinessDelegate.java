package com.pattern3._2businessDelegate.master;

import com.pattern3._2businessDelegate.base.BusinessService;

/**
 * 业务代表
 * @author newuser
 */
public class BusinessDelegate {

	private BusinessLookUp businessLookUp = new BusinessLookUp();	//业务查询服务
	private BusinessService businessService;//业务服务
	private String serviceType;				//业务类型
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	//执行任务
	public void doTask(){
		//查询相应业务服务并执行
		businessService = businessLookUp.getBusinessService(serviceType); 
		if(businessService == null){
			System.out.println("未找到相应的业务服务");
			return;
		}
		businessService.doProcessing();
	}
	
}
