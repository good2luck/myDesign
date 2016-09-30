package com.pattern3._4dataAccessObject.master.Impl;

import java.util.ArrayList;
import java.util.List;

import com.pattern3._4dataAccessObject.base.Student;
import com.pattern3._4dataAccessObject.master.StudentDao;

/**
 * 数据库访问实现类
 * 
 * @author newuser
 */
public class StudentDaoImpl implements StudentDao {

	private List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student(0, "Robert");
		Student student2 = new Student(1, "John");
		students.add(student1);
		students.add(student2);
	}

	//删除
	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() 
		         +", deleted from database");
	}

	//学生集合
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	//根据rollNo获取学生信息
	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() 
		         +", updated in the database");
	}

}
