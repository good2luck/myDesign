package com.pattern._2abstractFactory.base.color;

/**
 * @description 绿色
 * @author xudj
 * @date 2016年8月1日 上午9:55:01
 * @version 1.0
 */
public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Green::fill() method.");
	}

}
