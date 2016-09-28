package com.pattern2._4nullObject.base;

/**
 * 空客户
 * @author newuser
 */
public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
