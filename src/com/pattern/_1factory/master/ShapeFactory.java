package com.pattern._1factory.master;

import com.pattern._1factory.base.Circle;
import com.pattern._1factory.base.Rectangle;
import com.pattern._1factory.base.Shape;
import com.pattern._1factory.base.Square;

/**
 * @description 创建一个工厂，生成基于给定信息的实体类的对象
 * @author xudj
 * @date 2016年7月31日 上午11:21:44
 * @version 1.0
 */
public class ShapeFactory {

	//使用getShape获取图形形状类型的对象
	public Shape getShape(String str){
		if(str == null || str.equals("")){
			return null;
		}
		if(str.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(str.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(str.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}
}
