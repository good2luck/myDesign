package com.pattern1._9mediator.demo;

import com.pattern1._9mediator.base.User;

/**
 * 使用 User 对象来显示他们之间的通信
 * @author newuser
 */
public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		User robert = new User("robert");
		User join = new User("join");
		
		robert.sendMessage("Hi Join!");
		join.sendMessage("Hello Robert!");
	}
}
