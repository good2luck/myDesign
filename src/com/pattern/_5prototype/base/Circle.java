package com.pattern._5prototype.base;

/**
 * @description 圆形
 * @author xudj
 * @date 2016年8月9日 下午7:59:16
 * @version 1.0
 */
public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Circle:draw() method.");
	}

}
