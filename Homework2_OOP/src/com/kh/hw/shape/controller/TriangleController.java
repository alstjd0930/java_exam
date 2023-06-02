package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	private Shape s = new Shape(); //s라는 메소드는 입력받은 값을 set, get으로 보내주는 메소드
	
	public double calcArea(double height, double width) {
		s.setType(3);
		s.setHeight(height);
		s.setWidth(width);
		double result = width*height/2;
		return result;
		
	}
	public String paintColor(String color) {
		s.setColor(color);
		return s.getColor();
	}
	public String print() {
		return s.information();
		
	
	}
	
	
	
	
}
