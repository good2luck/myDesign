package com.pattern._7bridge.master;

/**
 * @description 实现桥接模式的红色圆
 * @author xudj
 * @date 2016年9月5日 下午9:31:10
 * @version 1.0
 */

public class RedCircle implements DrawAPI {

	@Override
	public void drowCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[color:red, radius:"
				+  radius + ", x:" + x + ", y:" + y +"]");
	}

}
