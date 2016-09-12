package com.pattern._7bridge.base;

import com.pattern._7bridge.master.DrawAPI;

/**
 * @description 使用 DrawAPI 接口创建抽象类 Shape
 * @author xudj
 * @date 2016年9月5日 下午9:34:51
 * @version 1.0
 */

public abstract class Shape {
	
	protected DrawAPI drawAPI;	//聚合
	
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
	
}
