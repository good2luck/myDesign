package com.pattern._2abstractFactory.master;

import com.pattern._2abstractFactory.base.color.Blue;
import com.pattern._2abstractFactory.base.color.Color;
import com.pattern._2abstractFactory.base.color.Green;
import com.pattern._2abstractFactory.base.color.Red;
import com.pattern._2abstractFactory.base.shape.Shape;

/**
 * @description 颜色工厂
 * @author xudj
 * @date 2016年8月1日 上午10:34:04
 * @version 1.0
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null || color.equals("")){
			return null;
		}
		if(color.equalsIgnoreCase("Blue")){
			return new Blue();
		}else if(color.equalsIgnoreCase("Green")){
			return new Green();
		}else if(color.equalsIgnoreCase("Red")){
			return new Red();
		}
		return null;
	}

}
