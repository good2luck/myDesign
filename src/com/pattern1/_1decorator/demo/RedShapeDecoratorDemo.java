package com.pattern1._1decorator.demo;

import com.pattern1._1decorator.base.Circle;
import com.pattern1._1decorator.base.Rectangle;
import com.pattern1._1decorator.base.Shape;
import com.pattern1._1decorator.master.RedShapeDecorator;

/**
 * @description 装饰者Demo
 * @author xudj
 * @date 2016年9月8日 下午10:25:03
 * @version 1.0
 */
public class RedShapeDecoratorDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		//红色的圆
		Shape redCircle = new RedShapeDecorator(new Circle());
		//红色的长方形
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
		
	}
}
