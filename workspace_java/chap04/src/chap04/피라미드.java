package chap04;

public class 피라미드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//마우스 올리고 import 선택
//		// 컨트롤 쉬프트 + O 영어로
//		int a = 10;
//		Scanner scanner = new Scanner (system.in)
//				//한 줄 글씨 입력 받아오기
//				string a = new scanner(system.in)
//				//한줄 글씨 입력 받아오기
//				string a = scanner = new scanner(system.in)
//				string a 
//				

		for (int a = 1; a <= 1; a++)
			System.out.println("*");
		for (int b = 1; b <= 2; b++)
			System.out.print("*");

		// 문제 1
		// 주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력하라
		// [1,1]

		/*
		 * 문제2 주사위 2개의 합 별로 나올 수 있는 조합
		 * 
		 * 합2 : [1,1] 합3 : [1,2] [1,2] [2,1]
		 * 
		 * 문제 3 합별 조합의 수 출력
		 * 
		 * 문제 4 순서에 관계 없이 중복 제거
		 * 
		 * 입력받은 정수에 따라 다음과 같이 출력 3 00 01 02 10 11 12 20 21 22
		 * 
		 * 
		 * 문제 6 입력받은 정수에 따라 다음과 같이 출력 만약 3을 받으면 (정사각형) +++ +.+ +++ 정사각형 그리기
		 * 
		 * 5 +++++ +...+ +...+ +++++
		 * 
		 */
		System.out.println();

		for (int x = 1; x <= 6; x++) {
			System.out.println("[1" + "+ x +" + "]");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.println("[" + i + "," + j + "]");
			}
		}
		for (int k = 2; k <= 12; k++) {
			System.out.println("합이 " + k + ":");
			int cnt = 0;
			for (int d = 1; d <= 6; d++) {//이게 첫번째 주사위 
				for (int s = 1; s <= 6; s++) {//두번째 주사위 
					if (d + s == k) {
						System.out.println("[" + d + ", " + s + "]");
						cnt++;
					}
				}
			}
			System.out.println(("총 개수: +" + cnt));
			System.out.println();
		}
	}
}