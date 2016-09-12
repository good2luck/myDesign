package com.pattern._2abstractFactory.base.shape;

/**
 * @description 正方形
 * @author xudj
 * @date 2016年7月31日 上午11:15:42
 * @version 1.0
 */
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square::draw() method.");
	}

}
