package com.pattern._4builder.base.coldDrink;

import com.pattern._4builder.base.Bottle;
import com.pattern._4builder.base.Item;
import com.pattern._4builder.base.Packing;

/**
 * @description 冷饮
 * @author xudj
 * @date 2016年8月5日 下午3:29:56
 * @version 1.0
 */
public abstract class ColdDrink implements Item{
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
}
