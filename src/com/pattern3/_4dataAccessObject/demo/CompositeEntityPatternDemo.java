package com.pattern3._4dataAccessObject.demo;

import java.util.List;

import com.pattern3._4dataAccessObject.base.Student;
import com.pattern3._4dataAccessObject.master.StudentDao;
import com.pattern3._4dataAccessObject.master.Impl.StudentDaoImpl;

/**
 * 数据访问对象模型Demo
 * @author newuser
 */
public class CompositeEntityPatternDemo {

	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDaoImpl();
		
		List<Student> students = studentDao.getAllStudents();
		for (Student student : students) {
			System.out.println("Student:[ RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
		}
		
		//更新学生
		Student student =studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
	}
}
