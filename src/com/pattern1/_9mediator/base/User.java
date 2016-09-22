package com.pattern1._9mediator.base;

/**
 * 用户类 
 * @author newuser
 */
public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/** 发送消息 */
	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
	
}
