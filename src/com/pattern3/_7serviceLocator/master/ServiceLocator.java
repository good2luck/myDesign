package com.pattern3._7serviceLocator.master;

import com.pattern3._7serviceLocator.base.Service;

/**
 * 服务定位器
 * @author newuser
 */
public class ServiceLocator {

	private static Cache cache;		//缓存
	static{//静态代码块
		cache = new Cache();
	}
	
	//获取服务
	public static Service getService(String serviceName){
		Service service = cache.getService(serviceName);
		if(service != null){
			return service;
		}
		
		//从jndi中查找
		InitialContext context = new InitialContext();
		service = (Service)context.lookUp(serviceName);
		//放入缓存
		if(service == null){
			System.out.println("Service Look Fail.");
			return null;
		}
		cache.addService(service);
		return service;
	}
}
