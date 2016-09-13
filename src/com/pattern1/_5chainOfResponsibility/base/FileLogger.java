package com.pattern1._5chainOfResponsibility.base;

/**
 * @description 文件日志FileLogger
 * @author xudj
 * @date 2016年9月13日 下午9:32:05
 * @version 1.0
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level){
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("FileLogger :" + message);
	}

}
