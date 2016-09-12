package com.pattern._8filter.base;

/**
 * @description Person类
 * @author xudj
 * @date 2016年9月6日 下午9:11:41
 * @version 1.0
 */
public class Person {

	private String name;			//名字
	private String gender;			//性别
	private String maritalStatus;	//婚姻状态
	
	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
}
