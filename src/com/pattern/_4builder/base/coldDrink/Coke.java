package com.pattern._4builder.base.coldDrink;

/**
 * @description 可口可乐
 * @author xudj
 * @date 2016年8月5日 下午3:33:49
 * @version 1.0
 */
public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
