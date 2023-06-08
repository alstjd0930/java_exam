package com.kh.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubleSort {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		// SWAP
		// a방에 b 값으로 바꾸고 , b방에 a값으로 바꾸기
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

		String[] nameArr = new String[] { "손범규", "천영준", "유청하", "김민성" };
		System.out.print("[");
		for (String ar : nameArr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < nameArr.length - 1; i++) {
			for (int j = 0; j < nameArr.length - 1 - i; j++) {
				if (nameArr[j].compareTo(nameArr[j + 1]) > 0) { // 오름차순
//				if(arr[j] < arr[j+1]) {	내림차순
					String tmp = nameArr[j];
					nameArr[j] = nameArr[j + 1];
					nameArr[j + 1] = tmp;
				}
			}
		}
		System.out.print("[");
		for (String ar : nameArr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		System.out.println("===========");
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String names = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(names, ",");
		List<String> nameList = new ArrayList<String>();
		while (strToken.hasMoreTokens()) {
			nameList.add(strToken.nextToken());
		}
		System.out.print("[");
		for (String ar : nameList) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.println("]");
		for (int i = 0; i < nameList.size() - 1; i++) {
			for (int j = 0; j < nameArr.length - 1 - i; j++) {
				if (nameList.get(j).compareTo(nameList.get(j + 1)) > 0) { // 오름차순
//				if(arr[j] < arr[j+1]) {	내림차순
					String tmp = nameList.get(j);
					nameList.set(j, nameList.get(j + 1));
					nameList.set(j + 1, tmp);
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i));
			if (i < nameList.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}
}
