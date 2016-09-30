package com.pattern3._8transferObject.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务对象，填充传输对象
 * 类似于服务器
 * @author newuser
 */
public class StudentBO {
	//列表是当作一个数据库
	private List<StudentVO> students;

	//初始化数据
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO(0, "Robert");
		StudentVO student2 = new StudentVO(1, "John");
		students.add(student1);
		students.add(student2);
	}

	//删除学生
	public void deleteStudent(StudentVO student){
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " 
				+ student.getRollNo() +", deleted from database");
	}

	//从数据库
	public List<StudentVO> getAllStudents(){
		return students;
	}

	//根据索引获取学生
	public StudentVO getStudent(int rollNo){
		return students.get(rollNo);
	}

	//更新学生
	public void updateStudent(StudentVO studentVO){
		students.get(studentVO.getRollNo()).setName(studentVO.getName());
		System.out.println("Student: Roll No " 
				+ studentVO.getRollNo() +", updated in the database");
	}
}
