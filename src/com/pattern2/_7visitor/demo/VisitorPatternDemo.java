package com.pattern2._7visitor.demo;

import com.pattern2._7visitor.base.Computer;
import com.pattern2._7visitor.base.ComputerPart;
import com.pattern2._7visitor.base.Mouse;
import com.pattern2._7visitor.master.ComputerPartDisplayVisitor;
import com.pattern2._7visitor.master.ComputerPartVisitor;

/**
 * 访问者模式Demo
 * @author newuser
 */
public class VisitorPatternDemo {

	public static void main(String[] args) {
		
		ComputerPart computerPart = new Computer();
		ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
		
		//访问Computer
		computerPart.accept(computerPartVisitor);
		
		System.out.println("=============");
		
		//访问鼠标Mouse
		computerPart = new Mouse();
		computerPart.accept(computerPartVisitor);
	}
	
}
