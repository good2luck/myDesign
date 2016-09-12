package com.pattern._4builder.base.coldDrink;

/**
 * @description 百事可乐
 * @author xudj
 * @date 2016年8月5日 下午3:34:48
 * @version 1.0
 */
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
