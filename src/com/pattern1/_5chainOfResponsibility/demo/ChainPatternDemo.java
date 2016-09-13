package com.pattern1._5chainOfResponsibility.demo;

import com.pattern1._5chainOfResponsibility.base.AbstractLogger;
import com.pattern1._5chainOfResponsibility.base.ConsoleLogger;
import com.pattern1._5chainOfResponsibility.base.ErrorLogger;
import com.pattern1._5chainOfResponsibility.base.FileLogger;

/**
 * @description 创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。
 * 每个记录器中的下一个记录器代表的是链的一部分。
 * @author xudj
 * @date 2016年9月13日 下午9:33:34
 * @version 1.0
 */
public class ChainPatternDemo {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();		//日志职责链loggerChain
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println("================");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
		System.out.println("================");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
		
	}
	
	//获取日志责任链
	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);	//error的下一链为file
		fileLogger.setNextLogger(consoleLogger);	//file的下一链为console
		
		return errorLogger;
	}
	
}