package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.kh.practice.list.model.vo.Music;
import com.kh.practice.list.music.model.compare.AscTitle;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
		//list에 미리 곡 넣어두기
		list.add(new Music("aa","aaa"));
		list.add(new Music("bb","bbb"));
		list.add(new Music("cc","ccc"));
		list.add(new Music("dd","ddd"));
		list.add(new Music("ff","fff"));
		list.add(new Music("gg","ggg"));
		list.add(new Music("qq","qqq"));
	}
	
	public int addList(Music music) {
		int result =0;	//0 : 추가실패   1 : 추가성공
		if(list.add(music)) {
			result=1;	
		};
		return result;
	}
	public int addAtZero(Music music) {
		int result =0;
		int cnt =list.size();
		((ArrayList<Music>)list).add(0, music); 
		int cntAfter =list.size();
		if(cnt < cntAfter) {
			result =cntAfter-cnt;
		}
		return result;	
	}
	public List<Music> printAll(){
		return list;
	}
	public Music searchMusic(String title) {
		Music result =null;
		for(Music vo:list) {
			if(vo.getTitle().equals(title)) {	//title 같은것 찾기
				result = vo;		//찾은 Music 객체vo로 return
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
		Music result =null;
		for(Music vo : list) {			//vo지역변수
			if(vo.getTitle().equals(title)) {
				list.remove(vo);
				result = vo;
				break;
			}
		}
		return result;
	}
	public Music setMusic(String title, Music music) {
		Music result =null;
		for(int i=0 ; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)){
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for(Music vo : list) {			//vo지역변수
//			if(vo.getTitle().equals(title)) {
//				result = vo;
//				
//				int findidx = list.indexOf(vo);	//vo는 for문의 새로운 지역변수로 list 공간과는 빌개
//				list.set(findidx, music);
//				break;
//			}
//		}
		return result;
	}
	public int ascTitle() {
		int result =0;
		for(int i=0 ; i<list.size()-1 ; i++) {
			for(int j = 0 ; j<list.size()-1-i ; j++) {
				if(list.get(j).getTitle().compareTo(list.get(j+1).getTitle()) < 0) {	 //오름차순

					Music tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,tmp);
				}
			}
		}
		return result;
	}
	public int desSinger() {
		//list.get(0).getSinger();       list 에선 singer가 없음 list에 1개 객체에 singer가잇음		
		int result =0;
		try {
		for(int i=0 ; i<list.size()-1 ; i++) {
			for(int j = 0 ; j<list.size()-1-i ; j++) {
				if(list.get(j).getSinger().compareTo(list.get(j+1).getSinger()) > 0) {	 //오름차순
					//정렬기준은 list의 music 형태 객체중 singer값으로 비교함
					//list에 있는 music형태의 singer
					Music tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,tmp);
				}
			}
		}
		result=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int ascTitle2() {
		int result =0;
		try {
			Collections.sort(list,new AscTitle());
		}catch(Exception e) {
			e.printStackTrace();
			result=0;
		}
		return result;
				
	}
	public int dessinger2() {
		int result =0;
		Collections.sort(list);
		return result;
	}
}
