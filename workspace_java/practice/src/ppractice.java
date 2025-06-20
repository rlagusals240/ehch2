import java.util.Scanner;

public class ppractice {

	public static void main(String[] args) {

		{
			int[] a = { 5, 8, 2 };
			int sum = 0;
			for (int x = 0; x < a.length; x++) {
				sum += a[x];
			}
			System.out.println(sum);
		}
		////////////////////////////////
		{
			int[] x = { 5, 8, 2 };
			int max = 0;
			for (int c = 0; c < x.length; c++) {
				if (x[c] > max) {
					max = x[c];
				}
			}
			System.out.println("최대값" + max);
		}
		///////////////////////////////////
		{
			System.out.println("문제 3");
			int[] a = { 5, 8, 2 };
			int count = 0;
			for (int x = 0; x < a.length; x++) {
				if (a[x] % 2 == 0) {
					count++;
				}
			}
			System.out.print("짝수의 개수:" + count);
		}
		/////////////////////////////////////
		{
			System.out.println("문제 4번");
			int[] a = { 5, 8, 2 };
			{
				for (int x = a.length - 1; x >= 0; x--) {
					System.out.println(a[x]);
				}
			}
		}
		///////////////////////////////////////
		{
			System.out.println("문제 5번");
			int[] a = { 5, 8, 2, };
			{
				int max = a[0];
				int min = a[0];
				for (int x = 0; x < a.length; x++) {
					if (a[x] > max)
						max = a[x];
					{
						if (a[x] < min)
							min = a[x];
					}
				}
				System.out.println("최대값" + max);
				System.out.println("최소값" + min);
				System.out.println("차이" + (max - min));
			}
		}
		//////////////////////////////////
		{
			System.out.println("문제 6번");
			double[] a = { 5, 8, 2 };
			{
				int sum = 0;
				for (int x = 0; x < a.length; x++) {
					sum += a[x];
				}
				double avg = sum / (double) a.length;
				System.out.println("합" + sum);
				System.out.println("평균" + avg);
			}
		}
		//////////////////////////////////
		{
			System.out.println("문제 7번");
			int[] a = { 5, 8, 2 };
			{
				int count = 0;
				int sum = 0;
				int max = 0;
				int min = 0;
				for (int x = 0; x < a.length; x++) {
					sum += a[x];
				}
				double avg = sum / (double) a.length;

				for (int s = 0; s < a.length; s++) {
					if (a[s] > avg)
						count++;
				}
				System.out.println("평균" + avg);
				System.out.println("평균보다 큰 수 개수" + count);
			}
		}
		//////////////////////////////////
		{
			System.out.println("문제 8번");
			int[] a = { 5, 8, 2 };
			{
				for (int x = a.length - 1; x >= 0; x--) {
					System.out.println(a[x]);
				}
			}
		}
		/////////////////////////////////////
		{
			System.out.println("문제 9번");
			int[] a = { 5, 8, 2 };
			{
				int product = 1;
				for (int x = 0; x < a.length; x++) {
				}
				product *= a[0];
				product *= a[1];
				product *= a[2];
				System.out.println("모든 요소의 곱" + product);
			}
		}
		/////////////////////////////////
		{
			System.out.println("문제 10번");
			int hour = 10; // 10시
			int minute = 50; // 50분

			minute += 35; // 35분 더하기

			if (minute >= 60) {// 분이 60분 넘으면

				hour = hour + minute / 60; // 시간에 60분을 추가 or 그대로 두기
				minute = minute % 60; // 나머지 분만 저장 한다
			}
			System.out.println(hour + "시" + minute + "분");
		}

		System.out.println("문제");
		int month = 5;
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("봄");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("여름");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("가을");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("겨울");
		}
		////////////////////////////////////
		{
			System.out.println("문제ㅎㅇㅀ");
			int hour = 10;
			int minute = 50;

			minute += 35;

			// 60분이 넘으면
			if (minute >= 60) {

				// hour에 옮겨넣는다
				hour += minute / 60;
				minute = minute % 60;
				System.out.println(hour + "시" + minute + "분");

			}
		}

//		
//		int hour = 10;
//		int minute = 50;
//		
//		minute += 35;
//		
//		if(minute >= 60) {//60분이 넘으면
//			
//			hour = hour + minute / 60; // 시간에다 옮겨주고
//			minute = minute %60; // 남은 분은 분에다 옮겨주고
//			System.out.println( hour + "시간" + minute + "분" );
//		}

		double total = 4.3; // 회식비
		int count = 4; // 사람수
		// 앞에 int로 강제 형 변환을 해서 총회식비는 4고 사람수가 4명이니 둘이 나눠주고
		// 4/4는 1이니 10000을 곱해주면 1인당 낼 금액을 찾을 수 있다
		int pay = (int) ((total / count)) * 10000;
		System.out.println(pay);
		// 총회식비와 사람수를 빼는과정에서 먼저 사람수를 4에서 3으로 만들고
		// 10000원을 *곱해주면 답이 나온다
		double ppay = (total - (count - 1)) * pay;
		System.out.println(ppay);

		//////////////////////////////////////
		{
//			주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력한다
//			[1,1] [1,2]
			System.out.println("문제 1번");

			{

				for (int x = 1; x < 3; x++) {
					for (int a = 1; a < 3; a++) {
						System.out.println("[" + x + "," + a + "]");
					}
				}
			}
		}
		/////////////////////////////////////////////////////
		{
			System.out.println("문제 2번");

			for (int x = 1; x < 6; x++) {
				for (int a = 1; a < 6; a++) {
					System.out.println("합" + (a + x) + "[" + x + "," + a + "]");

				}

			}
		}
		///////////////////////////////////////////////////
		{
			System.out.println("문제 3번");
			Scanner sc = new Scanner(System.in);
			{

			}

		}
	}
}
