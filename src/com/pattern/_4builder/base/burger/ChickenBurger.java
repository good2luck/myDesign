package com.pattern._4builder.base.burger;

/**
 * @description 鸡肉汉堡
 * @author xudj
 * @date 2016年8月5日 下午3:28:54
 * @version 1.0
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
