package com.pattern3._4dataAccessObject.base;

/**
 * 学生实体
 * @author newuser
 */
public class Student {

	private int rollNo;		//序号（模拟数据的索引）
	private String name;	//姓名
	
	public Student(int rollNo, String name) {
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
