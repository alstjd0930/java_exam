package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String sub;
	private int score;
	
	public Student() {};
	public Student(String name, String sub , int score) {
		this.name=name;
		this.score=score;
		this.sub=sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String inform() {
		String result = "이름"+name+sub+score;
		return result;
	}
	
}
