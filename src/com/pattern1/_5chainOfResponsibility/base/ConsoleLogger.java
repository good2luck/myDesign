package com.pattern1._5chainOfResponsibility.base;

/**
 * @description 控制台标准日志
 * @author xudj
 * @date 2016年9月13日 下午9:26:14
 * @version 1.0
 */
public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level){
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("ConsoleLogger :" + message);
	}

}
