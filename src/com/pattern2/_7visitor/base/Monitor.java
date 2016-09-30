package com.pattern2._7visitor.base;

import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * 显示器
 * @author newuser
 */
public class Monitor implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
