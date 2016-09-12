package com.pattern1._1decorator.master;

import com.pattern1._1decorator.base.Shape;

/**
 * @description Shape 接口的抽象装饰类
 * @author xudj
 * @date 2016年9月8日 下午10:19:35
 * @version 1.0
 */
public abstract class ShapeDecorator implements Shape{

	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}

	@Override
	public void draw() {
		decoratorShape.draw();
	}
	
}
