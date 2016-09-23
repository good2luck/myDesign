package com.pattern2._1memento.base;

/**
 * Memento 包含了要被恢复的对象的状态
 * @author newuser
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
