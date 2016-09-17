package com.pattern1._6command.base;

import com.pattern1._6command.master.Stock;

/**
 * @description 出售请求，实现命令接口
 * @author xudj
 * @date 2016年9月17日 上午11:03:09
 * @version 1.0
 */
public class SellStock implements Order {

	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	

	@Override
	public void execute() {
		abcStock.sell();
	}

}
