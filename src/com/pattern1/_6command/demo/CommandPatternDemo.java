package com.pattern1._6command.demo;

import com.pattern1._6command.base.BuyStock;
import com.pattern1._6command.base.SellStock;
import com.pattern1._6command.master.Broker;
import com.pattern1._6command.master.Stock;

/**
 * @description 命令模式
 * @author xudj
 * @date 2016年9月17日 上午11:14:51
 * @version 1.0
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
		//请求类
		Stock abcStock = new Stock();		
		
		//定义包括请求的不同命令类
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		//包装命令
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		//执行命令
		broker.placeOrders();
	}

}
