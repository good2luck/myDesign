package com.pattern1._3flyweight.master;

import java.util.HashMap;

import com.pattern1._3flyweight.base.Circle;
import com.pattern1._3flyweight.base.Shape;

/**
 * @description 形状工厂
 * @author xudj
 * @date 2016年9月10日 下午2:58:36
 * @version 1.0
 */

public class ShapeFactory {

	//类常量
	private static final HashMap<String, Shape> circles = new HashMap<String, Shape>();
	
	/**
	 * @description 获取圆对象
	 * @param color
	 * @return
	 */
	public static Shape getCircle(String color){
		Circle circle = (Circle) circles.get(color);
		
		if(circle == null){
			circle = new Circle(color);
			circles.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		
		return circle;
	}
	
}
