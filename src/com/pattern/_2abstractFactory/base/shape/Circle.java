package com.pattern._2abstractFactory.base.shape;

/**
 * @description 圆形
 * @author xudj
 * @date 2016年7月31日 上午11:16:37
 * @version 1.0
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle::draw() method.");
	}

}
