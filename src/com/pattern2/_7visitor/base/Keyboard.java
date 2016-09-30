package com.pattern2._7visitor.base;

import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * 键盘
 * @author newuser
 */
public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
