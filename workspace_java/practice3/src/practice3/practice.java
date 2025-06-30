package practice3;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		{
			System.out.println("문제 0번");
			for (int x = 1; x <= 10; x++) {
				if (x % 2 == 0) {
					System.out.println(x);
				}
			}
		}
		////////////////////////////////
		{
			System.out.println();
			System.out.println("문제 1번");
			for (int x = 20; x >= 1; x--) {
				if (x % 3 == 0 && x % 2 != 0) {
					System.out.println("3의 배수" + x);
				}
			}
		}
		//////////////////////////////////
		{
			System.out.println();
			System.out.println("문제 2번");
			for (int x = 20; x >= 1; x--) {
				if (x % 5 == 0 && x % 10 != 0) {
					System.out.println("5의배수" + x);
				}
			}
			System.out.println();
		}
		/////////////////////////////////
		{

			System.out.println("문제 3번");
			for (int x = 1; x <= 3; x++) {
				for (int a = 1; a <= 3; a++) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		////////////////////////////////
		{
			System.out.println("문제 4번");
//			for(int x = 3; x >=1; x--) { 이것도 백퍼맞지만 보기 좀 불편해서 
			// 쓰기를 꺼려한다
			for (int x = 1; x <= 3; x++) {
				for (int a = 3; a >= 1; a--) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		/////////////////////////////////////
		{
			System.out.println("문제 5번");
			for (int x = 1; x <= 3; x++) {
				for (int a = 1; a <= 6; a++) {
					if (a % 2 == 0) {
						System.out.print(a + " ");
					}
				}
				System.out.println();
			}
		}
		///////////////////////////////////
		{
			System.out.println("문제 6번");
			for (int num = 1; num <= 5; num++) {
				System.out.println(num + "번입니다");
			}
		}
		/////////////////////////////////////////
		{
			System.out.println("문제 7번");
			for (int x = 5; x >= 1; x--) {
				System.out.println(x);
			}
		}
		//////////////////////////////
		{
			System.out.println("문제 9번");
			for (int x = 1; x <= 5; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		////////////////////////////////////
		{
			System.out.println("문제 10번");
			for (int x = 5; x >= 1; x--) {
				System.out.print(x + " ");
			}
		}
		////////////////////////////
		{
			System.out.println("문제 11번");
			for (int x = 1; x <= 5; x++) {
				if (x % 2 == 0) {
					System.out.println(x + "짝");
				} else {
					System.out.println(x);
				}
			}
		}
		///////////////////////////
		{
			System.out.println("문제 11번");
			for (int x = 1; x < 10; x++) {
				if (x % 3 == 0) {
					System.out.println("삼!");
				}
				if (x % 3 != 0) {
					System.out.println(x);
				}
			}
		}
		//////////////////////////////////
		{
			System.out.println("문제 12번");
			for (int x = 1; x < 10; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println("삼!오!");
				} else if (x % 3 == 0) {
					System.out.println("삼!");
				} else if (x % 5 == 0) {
					System.out.println("오!");
				} else {
					System.out.println(x);
				}
			}

		}
		/////////////////////////////////
		{
			System.out.println("문제 13번");
			for (int x = 1; x <= 5; x++) {
				System.out.print(x);
			}
			System.out.println();
		}
		///////////////////////////
		{
			System.out.println("문제 14번");
			for (int x = 1; x <= 5; x++) {
				if (x % 2 != 0) {
					System.out.print("(" + x + ")");
				} else {
					System.out.print(x);
				}
			}
		}
		/////////////////////////////
		{
			System.out.println("문제 15번");
			for (int x = 5; x >= 1; x--) {
				if (x % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(x);
				}
			}
		}
		///////////////////////////////
		{
			System.out.println("문제 16번");
			for (int x = 1; x < 10; x++) {
				if (x % 3 == 0) {
					System.out.print("짝");
				} else {
					System.out.print(x);
				}
			}
			System.out.println();
		}
		//////////////////////////
		{
			System.out.println("불리언과 와일리문 문제 1번");
			boolean run = true;
			int r = 0;
			while (run) {
				System.out.println("반복 실행중");
				r++;
				if (r == 3) {
					run = false;
				}
			}
		}
		//////////////////////////
//		{
//			System.out.println("문제 2번");
//			Scanner sc = new Scanner(System.in);
//			String name = sc.nextLine();
//			System.out.println("안녕하세요" + name + "님");
//		}
//
//		//////////////////////////////////////
//		{
//			System.out.println("문제 3번");
//			Scanner sc = new Scanner(System.in);
//			int age = sc.nextInt();
//			System.out.println("내 나이는" + age + "인데 시발아");
//		}
//		/////////////////////////////////
//		{
//			System.out.println("문제 4번");
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int e = sc.nextInt();		
//			System.out.println(a+e + "니 보단 커 시발아");
//		}
		//////////////////////////////////
		{
			System.out.println("문제 5번");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = Math.abs(x - y);
			System.out.println(x-y + "그러지");
		}
			//////////////////////////////////
		}
	}

