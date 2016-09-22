package com.pattern1._9mediator.base;

import java.util.Date;

/**
 * 中介类
 * @author newuser
 */
public class ChatRoom {
	
	public static void showMessage(User user, String message){
		System.out.println(new Date().toString() + 
				" [" + user.getName() + "] : " + message);
	}
	
}
