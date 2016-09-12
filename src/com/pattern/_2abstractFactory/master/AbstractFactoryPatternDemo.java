package com.pattern._2abstractFactory.master;

import com.pattern._2abstractFactory.base.color.Color;
import com.pattern._2abstractFactory.base.shape.Shape;

/**
 * @description 抽象工厂Demo
 * @author xudj
 * @date 2016年8月1日 上午10:43:03
 * @version 1.0
 */
public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		//获取shapeFactory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		//获取形状：园
		Shape circle = shapeFactory.getShape("Circle");
		//画
		circle.draw();
		
		//获取colorFactory
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		//获取颜色：红色
		Color red = colorFactory.getColor("red");
		//涂色
		red.fill();
		
	}
}
