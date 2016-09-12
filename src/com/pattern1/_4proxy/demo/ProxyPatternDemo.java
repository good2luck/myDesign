package com.pattern1._4proxy.demo;

import com.pattern1._4proxy.base.Image;
import com.pattern1._4proxy.master.ProxyImage;

/**
 * @description 代理模式Demo
 * @author xudj
 * @date 2016年9月12日 下午7:47:55
 * @version 1.0
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.jpg");

		//图像将从磁盘加载
		image.display();
		
		System.out.println("");
		
		//图像将不从磁盘加载
		image.display();
	}
}
