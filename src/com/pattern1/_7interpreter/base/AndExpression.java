package com.pattern1._7interpreter.base;

/**
 * @description And
 * @author xudj
 * @date 2016年9月19日 下午9:25:40
 * @version 1.0
 */
public class AndExpression implements Expression{

	private Expression expre1 = null;
	private Expression expre2 = null;
	
	public AndExpression(Expression expre1, Expression expre2) {
		this.expre1 = expre1;
		this.expre2 = expre2;
	}
	
	@Override
	public boolean interpret(String context) {
		return expre1.interpret(context) && expre2.interpret(context);
	}

}
