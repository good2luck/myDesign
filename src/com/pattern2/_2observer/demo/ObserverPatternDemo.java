package com.pattern2._2observer.demo;

import com.pattern2._2observer.base.BinaryObserver;
import com.pattern2._2observer.base.HexaObserver;
import com.pattern2._2observer.base.OctalObserver;
import com.pattern2._2observer.master.Subject;

/**
 * @description 使用 Subject 和实体观察者对象演示观察者模式
 * @author xudj
 * @date 2016年9月25日 上午7:11:36
 * @version 1.0
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		//构造函数中自动绑定了观察者到subject对象上
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println();
		System.out.println("First state change: 10");
		subject.setState(10);
	}
	
}
