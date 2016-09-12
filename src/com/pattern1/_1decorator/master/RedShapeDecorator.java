package com.pattern1._1decorator.master;

import com.pattern1._1decorator.base.Shape;

/**
 * @description 扩展了 ShapeDecorator 类的实体装饰类
 * @author xudj
 * @date 2016年9月8日 下午10:21:15
 * @version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw() {
		decoratorShape.draw();
		setReBorder(decoratorShape);
	}

	private void setReBorder(Shape decoratorShape) {
		System.out.println("Border Color: Red");
	}
	

}
