package com.pattern1._5chainOfResponsibility.base;

/**
 * @description 错误日志ErrorLogger
 * @author xudj
 * @date 2016年9月13日 下午9:30:09
 * @version 1.0
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level){
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("ErrorLogger :" + message);
	}

}
