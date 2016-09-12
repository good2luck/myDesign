package com.pattern._4builder.base.burger;

import com.pattern._4builder.base.Item;
import com.pattern._4builder.base.Packing;
import com.pattern._4builder.base.Wrapper;

/**
 * @description 汉堡类
 * @author xudj
 * @date 2016年8月5日 下午3:25:39
 * @version 1.0
 */
public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
