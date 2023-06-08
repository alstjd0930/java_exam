package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	private Scanner sc = new Scanner(System.in);

	public void recursive() {

	}

	public void practice4() {
		while (true) {
			boolean exit = false;

			System.out.print("문자열");
			String str = sc.nextLine();
			System.out.print("문자:");
			char c = sc.nextLine().charAt(0);

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					count++;
				}
			}
			System.out.println("포함된 갯수:" + count);
			while (true) {
				System.out.println("더 하시겠습니까 y/n");
				String strCountinue = sc.nextLine().toLowerCase();
				if (strCountinue.equals("y")) {
					break;
				} else if (strCountinue.equals("n")) {
					exit = true;
					break;
				} else {
					System.out.println("잘못입력");
				}
			}
			if (exit) {
				break;
			}
		}
	}

	public void practice4_1() {
		String strCountinue = "";
		do {

			System.out.print("문자열");
			String str = sc.nextLine();
			System.out.print("문자:");
			char c = sc.nextLine().charAt(0);

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					count++;
				}
			}
			System.out.println("포함된 갯수:" + count);
			while (true) {
				System.out.println("더 하시겠습니까 y/n");
				strCountinue = sc.nextLine().toLowerCase();
				if (strCountinue.equals("y")) {
					break;
				} else if (strCountinue.equals("n")) {
					break;
				} else {
					System.out.println("잘못입력");
				}

			}
		} while (strCountinue.equals("y"));
		System.out.println("========");
	}
}
