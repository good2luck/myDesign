package com.pattern2._2observer.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern2._2observer.base.Observer;

/**
 * @description 管理观察者
 * @author xudj
 * @date 2016年9月25日 上午6:56:06
 * @version 1.0
 */
public class Subject {
	//观察者集合
	private List<Observer> observers
		= new ArrayList<Observer>();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
	/** 绑定观察者 */
	public void attach(Observer observer){
		observers.add(observer);
	}

	/**
	 * @description 通知所有观察者
	 * @author xudj
	 * @date 2016年9月25日 上午6:59:11
	 */
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
