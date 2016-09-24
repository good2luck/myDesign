package com.pattern2._2observer.base;

import com.pattern2._2observer.master.Subject;

/**
 * @description Binary观察者
 * @author xudj
 * @date 2016年9月25日 上午7:03:31
 * @version 1.0
 */
public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String:"
				+ Integer.toBinaryString(subject.getState()));
	}

}
