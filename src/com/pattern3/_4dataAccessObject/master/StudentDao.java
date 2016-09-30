package com.pattern3._4dataAccessObject.master;

import java.util.List;

import com.pattern3._4dataAccessObject.base.Student;

/**
 * 数据访问对象接口
 * @author newuser
 */
public interface StudentDao {

	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	
}
