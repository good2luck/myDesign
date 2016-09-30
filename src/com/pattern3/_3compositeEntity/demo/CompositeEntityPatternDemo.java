package com.pattern3._3compositeEntity.demo;

import com.pattern3._3compositeEntity.master.Client;

/**
 * 使用Client 来演示组合实体设计模式
 * @author newuser
 */
public class CompositeEntityPatternDemo {

	public static void main(String[] args) {
		Client client = new Client();

		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
