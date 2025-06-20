package chap04;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	{
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);

		int sum2 = 10;
		for (int i = 1; i <= 10; i = i + 1) {
			sum2 = sum2 + 1;
		}
		System.out.println("sum2 : " + sum2);

		int limit = 10;
		{
			for (int i = 1; i <= 10; i = i + 1)
				sum1 = limit + 1;
			System.out.println("sum1 : " + sum1);
		}

		// 1~5까지의 합을 구하는 것
		//
//		int i = 1;
//		sum = 0;
//		
//		sum = sum + i;
//		i++;
//		
//		sum = sum + i;
//		i++;
//		
//		sum = sum + i;
//		i++;

		// 구구단 2단을 출력하시오
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1.반복 되는 것 찾기 ctrl + c, v 했을 때 바뀌지 않는것 찾기 2.반복 되지 않는 것에서 규칙(패턴을)을 찾기 변수를 활용해서
		 * 더 이상 바뀌지 않게 만들기 3. 시작 조건 파악 4. 종료 조건 파악 for : 반복 횟수를 아는 경우 while : 반복 횟수를 모르는
		 * 경우
		 * 
		 */

		int i2 = 2;
		System.out.println("i2 : " + i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		for (int i3 = 1; i3 <= 4; i3 = i3 + 1) {
			System.out.println(i3);

			// 2 ~ 10까지 짝수만 출력
			System.out.println(2);
			System.out.println(4);
			System.out.println(6);
			System.out.println(8);
			System.out.println(10);

			// 다시 쓰면
			System.out.println(2);
			System.out.println(4);
			System.out.println("3: " + 6);
			// 이번엔 변수활용
			int i6 = 2;

			System.out.println(i6);
			i3 += 1;
			System.out.println(i6);
			i3 += 2;
			System.out.println(i6);

			///////////////////////////////////////////////////

			// 0단계
			/*
			 * + + + + +
			 */
//	 System.out.println("+");
//	 System.out.println("+");
//	 System.out.println("+");
//	 System.out.println("+");

		}
		for (int j = 1; j <= 5; j++)
			System.out.println("+");

		String mark = "+";
		System.out.println();
		String space = ".";
		for (int j = 1; j <= 5; j++)
			System.out.println(mark + space);

		System.out.println();

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(mark);
				System.out.println();
			}
		}

	}
}
