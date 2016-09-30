package com.pattern2._7visitor.base;

import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * ComputerPart接口
 * @author newuser
 *
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
