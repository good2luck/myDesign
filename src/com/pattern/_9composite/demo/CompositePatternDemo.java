package com.pattern._9composite.demo;

import com.pattern._9composite.base.Employee;

/**
 * @description 组合模式Demo
 * @author xudj
 * @date 2016年9月7日 下午8:29:32
 * @version 1.0
 */

public class CompositePatternDemo {

	public static void main(String[] args) {
		
		Employee CEO = new Employee("John", "CEO", 30000);
		
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		//打印该组织的所有员工
		System.out.println(CEO);
		for (Employee headEmploee : CEO.getSubordinates()) {
			System.out.println(headEmploee);
			for(Employee e : headEmploee.getSubordinates()){
				System.out.println(e);
			}
		}
		
	}
}
