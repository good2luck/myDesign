package com.pattern3._2businessDelegate.base;

/**
 * EJB实体服务类
 * @author newuser
 */
public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
