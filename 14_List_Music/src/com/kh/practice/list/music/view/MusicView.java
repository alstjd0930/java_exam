package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Music;
import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	private Scanner sc =new Scanner(System.in);
	private MusicController mc = new MusicController();
	public void mainMenu() {
//		//System.out.println("확인");
//		******* 메인 메뉴 *******
//		1. 마지막 위치에 곡 추가 // addList() 실행
//		2. 첫 위치에 곡 추가 // addAtZero()
//		3. 전체 곡 목록 출력 // printAll()
//		4. 특정 곡 검색 // searchMusic()
//		5. 특정 곡 삭제 // removeMusic()
//		6. 특정 곡 정보 수정 // setMusic()
//		7. 곡명 오름차순 정렬 // ascTitle()
//		8. 가수명 내림차순 정렬 // descSinger()
//		9. 종료 // “종료” 출력 후 main()으로 리턴
//		메뉴 번호 선택 : >> 입력 받음
//		// 메뉴 화면 반복 실행 처리
		int menu = -1;	//메뉴 0번이 추가되서 -1
		while(menu !=9) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.println("0. 파일에 저장");
		System.out.println("11.로드파일");
		System.out.print("메뉴 번호 선택 >>");
		String menuStr = sc.nextLine();		//입력값을 str으로받아서 int로
		menu = -1;
		//비정상적 입력 경우
		try {
				menu=Integer.parseInt(menuStr);
			}catch(NumberFormatException e) {
				System.out.println("문자는 입력할수 없습니다");
			}
			switch(menu) {
			//정상 입력 경우
			case 10:			loadfile();	break;
			case 0:				saveFile();					break;
			case 1:				addList();					break;
			case 2:				addAtZero();				break;
			case 3:				printAll();					break;
			case 4:				searchMusic();;				break;
			case 5:				removeMusic();				break;
			case 6:				setMusic();					break;
			case 7:				ascTitle();					break;
			case 8:				desSinger();				break;
			case 9:				System.out.println("종료");	break;
//				return;		//종료 경우 메소드 종료
			default:
				//비정상 입력경우
				System.out.println("메뉴에 해당하는 1~9 숫자만 작성해주세요");
				continue;	//continue를 사용해야 비정상 입력을 했을때 "정상일때만" 출력문구가 표시되지 않음
			}
			System.out.println("정상일때만");
		}
	}
	public void addList() {
		//****** 마지막 위치에 곡 추가 ******
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡명을 입력해주세요");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요");
		String singer = sc.nextLine();
		//Music vo = new Music(title, singer);
		int result = mc.addList(new Music(title, singer));//()자료형이 Music 일때
		if(result > 0) {
			System.out.println("추가성공");
		}else {
			System.out.println("추가실패");
		}
	}
	public void addAtZero() {
		//****** 첫 위치에 곡 추가 ******
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡명을 입력해주세요");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요");
		String singer = sc.nextLine();
		//Music vo = new Music(title, singer);
		int result = mc.addAtZero(new Music(title, singer));//()자료형이 Music 일때
		if(result > 0) {
			System.out.println("추가성공");
		}else {
			System.out.println("추가실패");
		}
	}
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> volist =mc.printAll();
		for(Music vo : volist) {
			System.out.println(vo);
		}
	}
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("****** 검색할 곡명 입력 ******");
		String title = sc.nextLine();
		Music result =mc.searchMusic(title);
		if(result == null) {
			System.out.println("검색한 곡이 없음");
		}else {
			System.out.printf("검색한 곡은 000(%s, %s)\n",result.getTitle(),result.getSinger());
		}
		System.out.println("결과");
	}
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("****** 삭제할 곡명 입력 ******");
		String title = sc.nextLine();
		Music result =mc.removeMusic(title);
		if(result == null) {
			System.out.println("삭제할 곡이 없음");
		}else {
			System.out.printf("삭제한 곡은 000(%s, %s)\n",result.getTitle(),result.getSinger());
		}
	}
	public void setMusic() {
		System.out.println("****** 특정 곡 정보수정 ******");
		System.out.println("****** 수정할 곡명 입력 ******");
		String title = sc.nextLine();
		System.out.println("****** 변경할 곡명 입력 ******");
		String newtitle = sc.nextLine();
		System.out.println("****** 변경할 가수명 입력 ******");
		String newsinger = sc.nextLine();
		Music result =mc.setMusic(title, new Music(newtitle, newsinger));	//setMusic 눌러보니 Music으로 반환값을 받고있음
		if(result == null) {
			System.out.println("수정 할 곡이 없습니다.");
		}else {
			System.out.printf(" 000(%s, %s)\n" , result.getTitle(), result.getSinger());
			
		}
	}
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 ******");
		int result = mc.ascTitle();
		if(result>0) {
			System.out.println("정렬성공");
		}else {
			System.out.println("정렬실패");
		}
		
	}
	public void desSinger() {
		System.out.println("****** 가수 명 내림차순 ******");
		int result = mc.desSinger();
		if(result>0) {
			System.out.println("정렬성공");
		}else {
			System.out.println("정렬실패");
		}
	}
	public void saveFile() {
		System.out.println("====곡정보를 파일에 저장====");
		System.out.println("저장할 파일경로 작성");
		String fileName=sc.nextLine();
		
		int result = mc.saveFile(fileName);
		if(result >0) {
			
		}
	}
	public void loadfile() {
		System.out.println("====곡정보를 파일에 저장====");
		System.out.println("저장할 파일경로 작성");
		String fileName=sc.nextLine();
		int result = mc.loadFile(fileName);
		if(result >0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
}
