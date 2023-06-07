package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;
import com.kh.practice.list.model.vo.Music;

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
			if(vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
		return null;
	}
	public Music setMusic(String title, Music music) {
		return null;
	}
	public int ascTitle() {
		return 0;
	}
	public int desSinger() {
		return 0;
	}
}
