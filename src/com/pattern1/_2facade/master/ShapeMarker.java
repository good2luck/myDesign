package com.pattern1._2facade.master;

import com.pattern1._2facade.base.Circle;
import com.pattern1._2facade.base.Rectangle;
import com.pattern1._2facade.base.Shape;
import com.pattern1._2facade.base.Square;

/**
 * @description ShapeMarker 外观类
 * @author xudj
 * @date 2016年9月10日 下午2:07:06
 * @version 1.0
 */

public class ShapeMarker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMarker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}
	
	/** 画圆 */
	public void drawCircle(){
		circle.draw();
	}
	
	/** 画矩形 */
	public void drawRectangle(){
		rectangle.draw();
	}
	
	/** 画长方形 */
	public void drawSquare(){
		square.draw();
	}
	
}