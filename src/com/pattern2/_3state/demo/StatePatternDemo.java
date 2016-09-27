package com.pattern2._3state.demo;

import com.pattern2._3state.base.StartState;
import com.pattern2._3state.base.State;
import com.pattern2._3state.base.StopState;
import com.pattern2._3state.master.Context;

/**
 * @description 状态模式Demo
 * @author xudj
 * @date 2016年9月27日 下午7:25:36
 * @version 1.0
 */
public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		State startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		State stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
		
	}
	
}
