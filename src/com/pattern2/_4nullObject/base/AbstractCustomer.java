package com.pattern2._4nullObject.base;

/**
 * 抽象客户类
 * @author newuser
 */
public abstract class AbstractCustomer {

	protected String name;
	
	public abstract String getName();
	
	/*public abstract boolean isNull();*/
	public boolean isNull(){//修改v2.0
		return false;
	}
	
}
