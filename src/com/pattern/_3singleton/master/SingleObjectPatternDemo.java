package com.pattern._3singleton.master;

/**
 * @description 单例测试
 * @author xudj
 * @date 2016年8月3日 下午7:40:19
 * @version 1.0
 */
public class SingleObjectPatternDemo {
	
	public static void main(String[] args) {
		
		SingleObject singleObject = SingleObject.getInstance();
		SingleObject singleObject2 = SingleObject.getInstance();
		//是否是同一个对象
		System.out.println(singleObject == singleObject2);
		//显示
		singleObject.showMessage();
		
	}
}
