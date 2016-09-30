package com.pattern3._1mvc.demo;

import com.pattern3._1mvc.base.Student;
import com.pattern3._1mvc.base.StudentController;
import com.pattern3._1mvc.base.StudentView;

/**
 * 使用StudentController 方法来演示 MVC 设计模式的用法。
 * 
 * @author newuser
 */
public class MVCPatternDemo {

	public static void main(String[] args) {
		// 从数据可获取学生记录
		Student model = retriveStudentFromDatabase();
		
		//创建一个视图：把学生详细信息输出到控制台
		StudentView view = new StudentView();
		
		StudentController studentController = new StudentController(model, view);
		studentController.updateView();
		
		System.out.println("=============");
		//更新姓名
		studentController.setStudentName("John");
		studentController.updateView();
	}

	/**
	 *  从数据库中查询数据(模拟)
	 */
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
