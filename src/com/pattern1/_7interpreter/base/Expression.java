package com.pattern1._7interpreter.base;

/**
 * @description 表达式接口
 * @author xudj
 * @date 2016年9月19日 下午7:43:12
 * @version 1.0
 */
public interface Expression {

	boolean interpret(String context);
}
