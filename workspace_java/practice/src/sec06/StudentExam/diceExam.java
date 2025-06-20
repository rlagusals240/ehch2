package sec06.StudentExam;

import java.util.Scanner;

public class diceExam {

	public static void main(String[] args) {

	// 랜덤 숫자를 생성해서 돌려주기
	int getNumber(int start, int end) {
		int result = Integer.MIN_VALUE;
		if (end > start) {
			result = (int) (Math.random() * (end - start + 1)) + start;

		}else {
			System.out.println("마지막 시작 숫자보다 크거나 같은");
		}
		return result;
	}

	// 메소드명 : start
	// 전달인자 : int start, int end // 정답의 범위
	// 리턴타입 : void
	void start(int start, int end) {
		
		System.out.println("1.게임시작 || 0. 종료");
		int menu = s.nextInt();
		switch(menu) {
		case 1:
		}
	}
		
		// 이번 판의 정답 
		int answer = getNumber(start, end);
		
		//정답여부
		boolean ok = false;
		
		
		while(!ok) {
//		while(ok != true) {
//		while(ok == false) {
		}
		Scanner s = new Scanner(System.in);
		System.out.println("찍어봐" + start, end);
		int nuber = s.nextInt();
		
		if(answer == number) {
			System.out.println("정답입니다");
			ok = true;
		}else if(answer < number) {
			System.out.println("up");
		}else {
			System.out.println("down");
		}
	}
	}

