package com.pattern2._3state.base;

import com.pattern2._3state.master.Context;

/**
 * @description 结束状态
 * @author xudj
 * @date 2016年9月27日 下午7:24:10
 * @version 1.0
 */
public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state.");
		context.setState(this);
	}
	
	public String toString(){
		return "Stop State";
	}

}
