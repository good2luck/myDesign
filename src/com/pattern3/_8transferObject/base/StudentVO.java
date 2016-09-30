package com.pattern3._8transferObject.base;

/**
 * 传输对象，即简单的POJO
 * @author newuser
 */
public class StudentVO {

	private int rollNo;
	private String name;
	
	public StudentVO(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
