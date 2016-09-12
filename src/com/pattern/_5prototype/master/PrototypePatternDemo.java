package com.pattern._5prototype.master;

import com.pattern._5prototype.base.Shape;

/**
 * @description 原型Demo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆
 * 对于类中的其它对象，不管是基本类型还是引用类型都是跟随类进行clone的，而非其本身clone，可参见API
 * @author xudj
 * @date 2016年8月9日 下午8:17:52
 * @version 1.0
 */
public class PrototypePatternDemo {

	static{
		ShapeCache.loadShape();//初始化
	}
	public static void main(String[] args) {
		
		Shape cloneCircle = ShapeCache.getShape("1");
		cloneCircle.draw();
		System.out.println("Circle:" + cloneCircle.getType() + "\n");

		
		Shape cloneCircle2 = ShapeCache.getShape("1"); 
		System.out.println(cloneCircle == cloneCircle2);
		System.out.println(cloneCircle.getClass() == cloneCircle2.getClass());
		
		//矩形
		Shape cloneRectangle = ShapeCache.getShape("2");
		System.out.println("\n" + cloneRectangle.getType());
		
		
	}
}
