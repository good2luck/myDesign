package com.pattern._5prototype.base;

/**
 * @description 矩形
 * @author xudj
 * @date 2016年8月9日 下午7:55:28
 * @version 1.0
 */
public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Rectangle:draw() method.");
	}

}
