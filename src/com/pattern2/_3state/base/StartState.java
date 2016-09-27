package com.pattern2._3state.base;

import com.pattern2._3state.master.Context;

/**
 * @description 开始状态
 * @author xudj
 * @date 2016年9月27日 下午7:21:17
 * @version 1.0
 */
public class StartState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state.");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
