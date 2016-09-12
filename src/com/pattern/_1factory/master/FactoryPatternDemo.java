package com.pattern._1factory.master;

import com.pattern._1factory.base.Shape;

/**
 * @description 工厂模式Demo
 * @author xudj
 * @date 2016年7月31日 上午11:26:38
 * @version 1.0
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//画圆形
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
		//画矩形
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
	}

}
