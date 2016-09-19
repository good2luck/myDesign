package com.pattern1._7interpreter.base;

/**
 * @description 终结符解释器
 * @author xudj
 * @date 2016年9月19日 下午9:07:36
 * @version 1.0
 */
public class TerminalExpression implements Expression{

	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)){
			return true;
		}
		return false;
	}

}
