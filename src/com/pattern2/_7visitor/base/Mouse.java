package com.pattern2._7visitor.base;

import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * 鼠标
 * @author newuser
 */
public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
