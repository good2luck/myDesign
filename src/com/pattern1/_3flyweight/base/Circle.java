package com.pattern1._3flyweight.base;

/**
 * @description 形状接口的实现类：圆形 
 * @author xudj
 * @date 2016年9月10日 下午2:55:17
 * @version 1.0
 */

public class Circle implements Shape {

	private String color;	//颜色
	private int x;
	private int y;
	private int radius;		//半径
	
	public Circle(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color 
				+", x : " + x +", y :" + y +", radius :" + radius);
	}

}
