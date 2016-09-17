package com.pattern1._6command.base;

import com.pattern1._6command.master.Stock;

/**
 * @description 购买请求，实现命令
 * @author xudj
 * @date 2016年9月17日 上午11:01:23
 * @version 1.0
 */
public class BuyStock implements Order {

	private Stock abcStock;
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
