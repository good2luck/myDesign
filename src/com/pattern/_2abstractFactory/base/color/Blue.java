package com.pattern._2abstractFactory.base.color;

/**
 * @description 蓝色
 * @author xudj
 * @date 2016年8月1日 上午9:57:01
 * @version 1.0
 */

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Blue::fill() method.");
	}

}
