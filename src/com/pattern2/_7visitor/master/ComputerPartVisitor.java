package com.pattern2._7visitor.master;

import com.pattern2._7visitor.base.Computer;
import com.pattern2._7visitor.base.Keyboard;
import com.pattern2._7visitor.base.Monitor;
import com.pattern2._7visitor.base.Mouse;

/**
 * 一个表示访问者的接口
 * @author newuser
 */
public interface ComputerPartVisitor {

	public void visit(Computer computer);
	
	public void visit(Mouse mouse);
	
	public void visit(Keyboard keyboard);
	
	public void visit(Monitor monitor);
	
}
