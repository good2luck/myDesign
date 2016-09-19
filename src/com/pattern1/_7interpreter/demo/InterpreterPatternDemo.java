package com.pattern1._7interpreter.demo;

import com.pattern1._7interpreter.base.AndExpression;
import com.pattern1._7interpreter.base.Expression;
import com.pattern1._7interpreter.base.OrExpression;
import com.pattern1._7interpreter.base.TerminalExpression;

/**
 * @description 解释器模式Demo
 * @author xudj
 * @date 2016年9月19日 下午9:28:22
 * @version 1.0
 */
public class InterpreterPatternDemo {

	// 规则：Robert和John是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// 规则：Julie 是一个已婚的女性
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interpret("Married Julie"));

	}

}
