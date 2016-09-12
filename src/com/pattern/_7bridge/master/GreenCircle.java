package com.pattern._7bridge.master;

/**
 * @description 实现桥接的绿色圆
 * @author xudj
 * @date 2016年9月5日 下午9:33:33
 * @version 1.0
 */
public class GreenCircle implements DrawAPI{

	@Override
	public void drowCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[color:green, radius:"
				+  radius + ", x:" + x + ", y:" + y +"]");
	}
	
}
