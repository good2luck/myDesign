package com.pattern._3singleton.master;

/**
 * @description 单例
 * @author xudj
 * @date 2016年8月3日 下午7:35:43
 * @version 1.0
 */
public class SingleObject {
	
	//创建一个对象
	private static SingleObject instance = new SingleObject();
	
	//私有构造函数
	private SingleObject(){}
	
	//获取对象的方法
	public static SingleObject getInstance(){
		return instance;
	}
	
	
	public void showMessage(){
		System.out.println("Hello World");
	}
}
