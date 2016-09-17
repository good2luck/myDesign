package com.pattern1._6command.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern1._6command.base.Order;

/**
 * @description 命令调用类
 * @author xudj
 * @date 2016年9月17日 上午11:07:25
 * @version 1.0
 */
public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order){
		orderList.add(order);
	}
	
	//执行命令
	public void placeOrders(){
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
	
}
