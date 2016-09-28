package com.pattern2._4nullObject.base;

/**
 * 真实客户类，实现抽象客户接口 
 * @author newuser
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name){
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	/*@Override
	public boolean isNull() {
 		return false;
	}*/

}
