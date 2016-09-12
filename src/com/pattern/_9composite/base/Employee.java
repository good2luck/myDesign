package com.pattern._9composite.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @description Employee类
 * @author xudj
 * @date 2016年9月7日 下午8:24:33
 * @version 1.0
 */
public class Employee {

	private String name;		//姓名
	private String dept;		//部门
	private int salary;			//工资
	private List<Employee> subordinates;	//下级
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void add(Employee e){
		subordinates.add(e);
	}
	
	public void remove(Employee e){
		subordinates.remove(e);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
}
