package com.pattern2._1memento.master;

import com.pattern2._1memento.base.Memento;

/**
 * Originator 创建并在 Memento 对象中存储状态
 * 		相当于备忘录类
 * @author newuser
 */
public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/** 存储状态 */
	public Memento saveStateToMemento(){
		return new Memento(this.state);
	}
	
	/** 获取存储的状态 */
	public void getStateFromMemento(Memento memento){
		this.state = memento.getState();
	}
}
