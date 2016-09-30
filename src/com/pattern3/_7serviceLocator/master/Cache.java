package com.pattern3._7serviceLocator.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern3._7serviceLocator.base.Service;

/**
 * 创建缓存
 * @author newuser
 */
public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}
	
	//获取Service
	public Service getService(String serviceName){
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(serviceName)){
				System.out.println("Returning cached "+serviceName+" object");
				return service;
			}
		}
		return null;
	}
	
	//添加服务
	public void addService(Service newService){
		boolean exist = false;
		for(Service service : services){
			if(service.getName().equalsIgnoreCase(newService.getName())){
				exist = true;
			}
		}
		if(!exist){
			services.add(newService);
		}
	}
	
}
