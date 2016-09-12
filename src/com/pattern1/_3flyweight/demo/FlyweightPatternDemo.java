package com.pattern1._3flyweight.demo;

import com.pattern1._3flyweight.base.Circle;
import com.pattern1._3flyweight.master.ShapeFactory;

/**
 * @description 使用Shape工厂，通过传递颜色信息来获取实体类的对象。
 * @author xudj
 * @date 2016年9月10日 下午3:19:36
 * @version 1.0
 */

public class FlyweightPatternDemo {

	private static final String colors[] = {
			"Red", "Green", "Blue", "White", "Black"
		};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++){
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.draw();
		}
		
	}

	/** 随机获取颜色 */
	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
