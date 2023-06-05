package com.kh.practice.list.library.model.vo;

public class Book {
	private String title;
	private String auhor;
	private String category;
	private int price;
	
	public Book() {};
	public Book(String title, String auhor ,String category, int price) {
		this.title =title;
		this.auhor=auhor;
		this.category=category;
		this.price = price;
				
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuhor() {
		return auhor;
	}
	public void setAuhor(String auhor) {
		this.auhor = auhor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		String result = null;
		return result;
	}
	public int hashCode() {
		return 0;
	}
	public boolean equal() {
		return false;
	}
	public int compareTo() {
		return 0;
	}
}
