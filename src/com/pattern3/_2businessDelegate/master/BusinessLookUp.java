package com.pattern3._2businessDelegate.master;

import com.pattern3._2businessDelegate.base.BusinessService;
import com.pattern3._2businessDelegate.base.EJBService;
import com.pattern3._2businessDelegate.base.JMSService;

/**
 * 业务查询服务
 * @author newuser
 */
public class BusinessLookUp {
	
	//获取业务类型
	public BusinessService getBusinessService(String serviceType){
		if(serviceType == null){
			return null;
		}
		if(serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		} else if(serviceType.equalsIgnoreCase("JMS")){
			return new JMSService();
		} else {
			return null;
		}
	}
	
}
