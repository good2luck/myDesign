package com.pattern2._3state.master;

import com.pattern2._3state.base.State;

/**
 * @description 环境类
 * @author xudj
 * @date 2016年9月27日 下午7:19:38
 * @version 1.0
 */
public class Context {
	
	//状态
	private State state;

	public Context() {
		this.state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
