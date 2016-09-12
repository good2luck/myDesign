package com.pattern._2abstractFactory.base.shape;

/**
 * @description 矩形
 * @author xudj
 * @date 2016年7月31日 上午11:13:39
 * @version 1.0
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle::draw() method.");
	}
}
