package com.kh.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Foodin {
	public void fileSave(String fileName) {		//String 타입 객체 filename생성
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			//파일 객체와 연결하는 파일 출력 스트림
			
			out.writeObject(new Food("사과", 20));	//객체에 정보 기록
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void fileSave2(String fileName) {
			
		try {
			FileOutputStream fo=new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fo);
			
			out.writeObject(new Food("사과", 20));	//객체에 정보 기록
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out !=null) { 
					
			}
		}
		
	}
}
