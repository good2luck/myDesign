package com.pattern._5prototype.base;

/**
 * @description 正方形
 * @author xudj
 * @date 2016年8月9日 下午7:57:52
 * @version 1.0
 */
public class Square extends Shape {

	public Square(){
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Square:draw() method.");
	}

}
