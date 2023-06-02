package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	
	private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidth(width);
		double result = width*2 + height*2;
		return result;
	}
	public double caleArea(double height, double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidth(width);
		double result =	width*height;
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
	
	
	
	


