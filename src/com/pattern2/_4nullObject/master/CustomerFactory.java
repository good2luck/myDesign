package com.pattern2._4nullObject.master;

import com.pattern2._4nullObject.base.AbstractCustomer;
import com.pattern2._4nullObject.base.NullCustomer;
import com.pattern2._4nullObject.base.RealCustomer;

/**
 * 客户工厂
 * @author newuser
 */
public class CustomerFactory {

	public static final String[] names = {"Rob", "Joe", "Julie"};

	/**
	 * 获取模拟数据中存储的客户
	 * 没有则返回null对象
	 * @param name
	 * @return
	 */
	public static AbstractCustomer getCustomer(String name){
		for (String str : names) {
			if(str.equals(name)){
				return new RealCustomer(name);
			}		
		}
		return new NullCustomer();
	}

}
