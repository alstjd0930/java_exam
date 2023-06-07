package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;
import com.kh.practice.list.library.model.vo.Book;


public class BookController {
	private	List<Book> list = new ArrayList<Book>();
	
	public BookController() {
		list.add(new Book(null, null, null, 0));
	}
	public void inserBook(Book bk) {
	}
	public ArrayList<Book> selectList(){
		return null;
	}
	public ArrayList<Book> searchBook(String keyword){
		return null;
	}
	public Book deleteBook(String title, String author) {
		return null;
	}
	public int ascBook() {
		return 0;
	}
	
}
