package com.pattern1._6command.master;

/**
 * @description 请求类
 * @author xudj
 * @date 2016年9月17日 上午10:56:29
 * @version 1.0
 */
public class Stock {
	
	private String name = "ABC";
	private int quantity = 10;
	
	//买
	public void buy(){
		System.out.println("Stock [ Name: " + name +","
				+ "Quantity: " + quantity + " ] bought");
	}
	
	//卖
	public void sell(){
		System.out.println("Stock [ Name: " + name + ","
				+ "Quantity: " + quantity + " ] sold");
	}
	
}
