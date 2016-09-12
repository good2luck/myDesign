package com.pattern._2abstractFactory.base.color;

/**
 * @description 红色
 * @author xudj
 * @date 2016年8月1日 上午9:54:14
 * @version 1.0
 */
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red::fill() method.");
	}

}
