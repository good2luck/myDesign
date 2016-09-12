package com.pattern._2abstractFactory.master;

/**
 * @description 工厂生产器
 * @author xudj
 * @date 2016年8月1日 上午10:38:51
 * @version 1.0
 */
public class FactoryProducer {
	
	//获取工厂
	public static AbstractFactory getFactory(String factory){
		if(factory == null || factory.equals("")){
			return null;
		}
		if(factory.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}else if(factory.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		return null;
	}
	
}
