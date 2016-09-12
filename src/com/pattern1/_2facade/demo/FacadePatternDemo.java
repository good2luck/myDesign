package com.pattern1._2facade.demo;

import com.pattern1._2facade.master.ShapeMarker;

/**
 * @description 外观类画出各种类型的形状
 * @author xudj
 * @date 2016年9月10日 下午2:13:42
 * @version 1.0
 */

public class FacadePatternDemo {

	public static void main(String[] args) {
		
		ShapeMarker shapeMarker = new ShapeMarker();
		
		shapeMarker.drawCircle();
		
		shapeMarker.drawRectangle();
		
		shapeMarker.drawSquare();
		
		
	}
}
