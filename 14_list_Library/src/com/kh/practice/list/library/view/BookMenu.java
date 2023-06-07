package com.kh.practice.list.library.view;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	public void mainMenu() {
		
	while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 >>");
		int a =sc.nextInt();
		switch(a) {
			case 1 : insertBook();
			break;
			case 2 : selectList();
			break;
			case 3 : searchBook();
			break;
			case 4 : deleteBook();
			break;
			case 5 : ascBook();
			break;
			case 9 : System.out.println("프로그램을 종료합니다");
			return;	// 반복문 종료
			default : 
				System.out.println("잘못입력하셨습니다 다시 입력해주세요.");
			}
		}
	}
	
	public void insertBook() {
		
		System.out.print("도서명 :");
		String title=sc.next();
		
		System.out.print("저자명 :");
		String author=sc.next();
		
		System.out.print("장르(1.인문/2.과학/3.외국어/4.기타");
		int category=sc.nextInt();
		String cate = null;
		if(category==1) {
			cate = "인문";
		}else if(category==2){
			cate = "과학";
		}else if(category ==3) {
			 cate ="외국어";
		}else {
			 cate ="기타";
		}
		System.out.print("가격 :");
		int price =sc.nextInt();
		Book a = new Book(title, author, cate, price);
		bc.inserBook(a);
		System.out.println(a);
	}
	public void selectList() {
		List<Book> volist = bc.selectList();
		for(Book vo : volist) {
			System.out.println(vo);
		}
	}
	public void searchBook() {
	
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
}
