package com.pattern._2abstractFactory.master;

import com.pattern._2abstractFactory.base.color.Color;
import com.pattern._2abstractFactory.base.shape.Circle;
import com.pattern._2abstractFactory.base.shape.Rectangle;
import com.pattern._2abstractFactory.base.shape.Shape;
import com.pattern._2abstractFactory.base.shape.Square;

/**
 * @description 
 * @author xudj
 * @date 2016年8月1日 上午10:06:40
 * @version 1.0
 */

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape == null || shape.equals("")){
			return null;
		}
		if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
