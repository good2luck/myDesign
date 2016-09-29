package com.pattern2._5strategy.master;

import com.pattern2._5strategy.base.Strategy;

/**
 * 策略支配类
 * @author newuser
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 执行策略
	 * @return
	 */
	public int excuteStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
	
}
