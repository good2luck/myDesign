package com.pattern3._1mvc.base;

/**
 * 学生控制器
 * @author newuser
 */
public class StudentController {
	
	private Student student;			//模型
	private StudentView studentView;	//视图
	
	public StudentController(Student student, StudentView studentView) {
		this.student = student;
		this.studentView = studentView;
	}
	
	//更新 学生姓名
	public void setStudentName(String name){
		student.setName(name);
	}

	//获取 学生姓名
	public String getStudentName(){
		return student.getName();
	}
	
	//更新 学生学号
	public void setStudentRollNo(String rollNo){
		student.setRollNo(rollNo);
	}
	
	//获取 学生学号
	public String getStudentRollNo(){
		return student.getRollNo();
	}
	
	/**
	 * 更新视图
	 */
	public void updateView(){
		studentView.printStudentDetails(student.getName(), student.getRollNo());
	}
	
}
