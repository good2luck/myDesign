package com.pattern2._5strategy.demo;

import com.pattern2._5strategy.base.OperationAdd;
import com.pattern2._5strategy.base.OperationMultiply;
import com.pattern2._5strategy.base.OperationSubstract;
import com.pattern2._5strategy.master.Context;

/**
 * 策略模式Demo
 * @author newuser
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		//加
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.excuteStrategy(10, 5));
		
		//减
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.excuteStrategy(10, 5));
		
		//乘
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.excuteStrategy(10, 5));
	}
}
