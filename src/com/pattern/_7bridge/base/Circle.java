package com.pattern._7bridge.base;

import com.pattern._7bridge.master.DrawAPI;

/**
 * @description 圆
 * @author xudj
 * @date 2016年9月5日 下午9:36:52
 * @version 1.0
 */

public class Circle extends Shape {

	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drowCircle(radius, x, y);
	}

}
