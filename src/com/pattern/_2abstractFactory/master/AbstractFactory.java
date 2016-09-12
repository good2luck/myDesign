package com.pattern._2abstractFactory.master;

import com.pattern._2abstractFactory.base.color.Color;
import com.pattern._2abstractFactory.base.shape.Shape;

/**
 * @description 抽象工厂
 * @author xudj
 * @date 2016年8月1日 上午9:58:35
 * @version 1.0
 */
public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
