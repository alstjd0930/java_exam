package com.kh.practice.snack.model.vo;

import java.io.Serializable;

public class Snack implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4300605652978480655L;
	private String kind;
	private String name;
	private String flavor;
	private int numof;
	private int price;
	private String hh;
	
	
	public Snack() {}
	public Snack(String kind, String name, String flavor,int numof ,int price,String hh) {
		
		this.kind=kind;
		this.name=name;
		this.hh=hh;
		
		}
	
	
	public String information() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numof=" + numof + ", price=" + price
				+ "]";
		//TODO
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumof() {
		return numof;
	}
	
	public String getHh() {
		return hh;
	}
	public void setHh(String hh) {
		this.hh = hh;
	}
	public void setNumof(int numof) {
		this.numof = numof;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
