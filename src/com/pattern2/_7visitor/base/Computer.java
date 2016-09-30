package com.pattern2._7visitor.base;

import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * 计算机
 * @author newuser
 */
public class Computer implements ComputerPart {

	ComputerPart parts[];

	public Computer() {
		parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}


	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i=0; i<parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
	
}
