package practice;

import java.util.Scanner;

public class Practice005 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		boolean c = a > b;// boolean은 참 거짓 다 출력하는 놈

		System.out.println(a > b);
		if (c) { // if는 둘 중에 하나만 출력하는 놈 정답이 나올때 까지 추격하는놈
			System.out.println("두수 중 큰값" + a);
		} else if (a < b) {
			System.out.println("두 수중 큰값" + b);
		}

		int hour = 10; // 10시로 가정하고
		int minute = 50; // 분도 50분으로 가정하고
		int count = 0; // 얘는 왜 있는지 모르겠다

		minute += 35;
		count++;

		if (minute >= 60) {
			hour = hour + (minute / 60);// 분이 1시간 이상이면 시간으로 넘어가도록
			minute = minute % 60; // -를 써도 되지만 %나머지로 계산하는게 더 확실하다
			System.out.println("시간:" + hour + "시" + " " + minute + "분");

		}

		{
			int x = 10;
			if (15 == 20) {
				System.out.println("15와 20사이");
				System.out.println("인정");
			} else if (x > 10) {
				System.out.println("10이상 15포함이면");
				System.out.println("흠");
			} else {
				System.out.println("포기하자");
			}
		}

		int balance = 10000; // 통장 잔액
		Scanner sc = new Scanner(System.in);

		System.out.print("출금액을 입력하세요: ");
		int amount = sc.nextInt(); // 사용자로부터 출금액 입력

		if (amount <= 0) {
			// 0 이하를 입력했을 때
			System.out.println("정확히 입력 해주세요");

		} else if (amount > balance) {
			// 잔액보다 큰 금액을 요청했을 때
			System.out.println("잔액이 부족합니다");

		} else {
			// 정상 출금 처리
			balance -= amount;
			System.out.println(amount + "원 출금 했고 " + balance + "원 남았습니다");
		}

		sc.close();
		
		
	}

}
