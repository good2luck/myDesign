package com.pattern._5prototype.master;

import java.util.Hashtable;

import com.pattern._5prototype.base.Circle;
import com.pattern._5prototype.base.Rectangle;
import com.pattern._5prototype.base.Shape;
import com.pattern._5prototype.base.Square;

/**
 * @description 创建一个类，模拟从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 * @author xudj
 * @date 2016年8月9日 下午8:08:22
 * @version 1.0
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap
		= new Hashtable<String, Shape>();

	//获取克隆对象
	public static Shape getShape(String id){
		Shape cachedShape = shapeMap.get(id);
		return (Shape) cachedShape.clone();
	}


	// 对每种形状都运行数据库查询，并创建该形状
	// shapeMap.put(shapeKey, shape);
	// 例如，我们要添加三种形状
	public static void loadShape(){
		Circle circle = new Circle();	//圆
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();	//矩形
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();	//长方形
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}

}
