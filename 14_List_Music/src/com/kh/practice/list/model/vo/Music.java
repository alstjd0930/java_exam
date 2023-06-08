package com.kh.practice.list.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Comparable<Object>,Serializable{	//직렬화 후 Music 오류 제너레이터
	private static final long serialVersionUID = 3540667243697005826L;
	
	private String title;
	private String singer;
	
	public Music() {};
	public Music(String title, String singer) {
		this.singer=singer;
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(Object o) {
		int result=this.singer.compareTo(((Music)o).getSinger());	//형변환
		System.out.println("compareTo 정렬확인 :"+result+"-"+((Music)o).getSinger());
		return result*-1;
	}
	
}
