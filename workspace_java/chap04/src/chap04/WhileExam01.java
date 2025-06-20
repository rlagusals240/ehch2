package chap04;

import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("메뉴를 고르시오");
		System.out.println("1커피,2:차,0:종료");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		if (menu == 1) {
			System.out.println("커피 드릴께요");
		} else if (menu == 2) {
			System.out.println("차 드릴께요");
		} else if (menu == 0) {
			System.out.println("주문을 종료합니다. 다음에 뵈요");
		} else {
			System.out.println("주문을 확인하세요");
		}

	
	
	}
}
	