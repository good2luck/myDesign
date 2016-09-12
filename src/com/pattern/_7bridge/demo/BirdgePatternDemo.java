package com.pattern._7bridge.demo;

import com.pattern._7bridge.base.Circle;
import com.pattern._7bridge.base.Shape;
import com.pattern._7bridge.master.GreenCircle;
import com.pattern._7bridge.master.RedCircle;

/**
 * @description 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 * @author xudj
 * @date 2016年9月5日 下午9:42:11
 * @version 1.0
 */

public class BirdgePatternDemo {
	
	public static void main(String[] args) {
		//红圆
		Shape redCircle = new Circle(1,2,5,new RedCircle());
		redCircle.draw();
		
		//绿圆
		Shape greenCircle = new Circle(2, 1, 3, new GreenCircle());
		greenCircle.draw();
	}
	
}
