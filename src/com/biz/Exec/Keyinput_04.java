package com.biz.Exec;

import java.util.Scanner;

public class Keyinput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("국가명(영문으로) >>");
			String strNation = scan.nextLine();
			if (strNation.equalsIgnoreCase("Korea")) {
				System.out.print("대한민국 사람이군요");
			} else if (strNation.equalsIgnoreCase("USA")) {
				System.out.print("미국 사람이군요");
			} else if (strNation.equalsIgnoreCase("China")) {
				System.out.print("중국 사람이군요");
			} else if (strNation.equals("--END")) {
				System.out.print("안녕");
			} else {
				System.out.print("모르겠는데요");
			}
		}

	}

}
