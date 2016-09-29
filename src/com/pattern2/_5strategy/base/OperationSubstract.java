package com.pattern2._5strategy.base;

/**
 * 减操作
 * @author newuser
 */
public class OperationSubstract implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
