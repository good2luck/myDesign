package com.pattern1._5chainOfResponsibility.base;

/**
 * @description 抽象日志类AbstractLogger
 * @author xudj
 * @date 2016年9月13日 下午8:39:21
 * @version 1.0
 */
public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextLogger;		//下一个链日志
	
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}
	
	//日志信息
	public void logMessage(int level, String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}
	
	abstract protected void write(String message);
}
