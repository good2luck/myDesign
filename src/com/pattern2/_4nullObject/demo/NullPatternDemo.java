package com.pattern2._4nullObject.demo;

import com.pattern2._4nullObject.base.AbstractCustomer;
import com.pattern2._4nullObject.master.CustomerFactory;

/**
 * 使用 CustomerFactory，基于客户传递的名字，来获取 RealCustomer 或 NullCustomer 对象
 * 
 * @author newuser
 * 
 */
public class NullPatternDemo {

	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers:");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
		
		
		//可获取customer.isNull()是否创建某客户成功来进行其它操作...
		System.out.println(customer1.isNull());
		System.out.println(customer2.isNull());
	}

}
