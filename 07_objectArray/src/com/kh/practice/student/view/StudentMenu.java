package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	public StudentMenu() {
		System.out.println("====학생정보출력====");
		for(int i = 0 ; i<ssm.printStudents().length; i++) {
			System.out.println(ssm.printStudents()[i].inform());
		}
		System.out.println("====학생성적출력=====");
		System.out.println(ssm.sumScore());
		System.out.println(ssm.avgScore()[1]);
		System.out.println("====성적====");
		for(int i =0 ; i<ssm.printStudents().length ; i++) {
			if(ssm.printStudents()[i].getScore()<ssm.CUT_LINE) {
				System.out.println(ssm.printStudents()[i].getName()+"불합");
			}
			else
			{
				System.out.println(ssm.printStudents()[i].getName()+"합격");
			}
		}
		
	}
}
