package com.pattern3._8transferObject.demo;

import java.util.List;

import com.pattern3._8transferObject.base.StudentBO;
import com.pattern3._8transferObject.base.StudentVO;

/**
 * 传输对象模式Demo
 * @author newuser
 */
public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBO studentBO = new StudentBO();
		//学生列表
		List<StudentVO> students = studentBO.getAllStudents();
		for (StudentVO studentVO : students) {
			System.out.println("Student: [RollNo : "
					+studentVO.getRollNo()+", Name : "+studentVO.getName()+" ]");
		}

		System.out.println("=======================");

		//获取学生
		StudentVO student = studentBO.getStudent(0);
		System.out.println("Student: [RollNo : "
				+student.getRollNo()+", Name : "+student.getName()+" ]");

	}
}
