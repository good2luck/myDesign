package com.pattern._4builder.base.burger;

/**
 * @description 素食汉堡
 * @author xudj
 * @date 2016年8月5日 下午3:27:50
 * @version 1.0
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
