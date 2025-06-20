package sec01.exam01;

public class test {

	public static void main(String[] args) {

		{
			int a = 10;
			int b = 20;
			int c = a + b;
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
		}

		{
			int a = 10;
			int b = 10;
			int d = a + b;
			System.out.println("d: " + d);
			int e = 10;
			System.out.println("e: " + e);
		}

		{
			int f = 10;
			System.out.println("f: " + f);
			int g = 10;
			System.out.println("g: " + g);

			int a = 10;
			System.out.println("a: " + a);
		}

		// int x1 = 26845; int x3 = x1; int x1 = x2;
		// int x2 = 684684; int x2 = x3
		/*
		*
		*/
		// System.out.println("x1 : " + x1); // 684684
		// System.out.println("x2 : " + x2); // 26845
		{
			System.out.println("값이 몰라");
			double total = 4.3;
			int count = 4;
			double result1 = total / count;
			System.out.println("1번 result1: " + (result1 * 10000));
		}

		int age = 17;

		if (age >= 20) {
			System.out.println("성인");
		} else if (age >= 13 & age <= 19) {
			System.out.println("청소년");
		}

		int i = 90;

		if (i >= 80)
			System.out.println("이프가 더 작다");

		int num = 7;

		if (num % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}

		int x = 5;
		int y = --x + ++x;
		System.out.println("y : " + y);

		x = 3;
		y = x++ + x++;
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		x = 5;
		y = x-- + ++x + --x + x++;
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		double v1 = 1000.0;
		double v2 = 794.0;
		double v3 = v1 / v2;
		System.out.println(v3);
		System.out.println(v3);
		// 1259
		v3 = (int) (v3 * 1000) / 1000.0;
		System.out.println(v3);

		double v4 = v1 / v2 * 1000;
		int v5 = (int) v4;
		double v6 = (double) v5 / 1000;

		double a = 10.987654;
		double a2 = (int) (a * 100) / 100.0;
		System.out.println(a2);

		int score = 96;
		if (score == 96) {
			System.out.println("97점 이상");
			System.out.println("95점 이상");
		} else if (score >= 90) {
			System.out.println("90점 이상");
		} else
			System.out.println("85점 미만");

		int x5 = -5;

		if (x5 > 0) {
			System.out.println("양수");
		} else if (x5 < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

		int a1 = 10;
		int b = 20;

		if (a > b) {
			System.out.println("더 큰 값: " + a);
		} else {
			System.out.println("더 큰 값:" + b);
		}
		{
			int hour = 10;
			int minute = 50;
			minute += 35;
			if (minute >= 60)
				hour += (minute / 60);
			minute = minute % 60;
			System.out.println("35분 후 시간:" + hour + "시" + minute + "분");
		}
		int la = 20;

		if (la >= 15 && la <= 20) {
			System.out.println("la는 15이상 20 이하입니다");
		} else if (la >= 14)
			System.out.println("la는 15보다 작습니다");
		else {
			System.out.println("la는 15이상입니다");
		}

		int f = 10;
		int h = 20;

		if (f > h) {
			System.out.println("더 큰 값 " + f);
		} else {
			System.out.println("더 큰 값" + h);
		}

		int t = 10000;
		int with = 10000;

		if (with > t) {
			System.out.println("잔액이 부족합니다");
		} else if (with > 9999 && with <= t) {
			System.out.println("얼마출금했고 얼마 남았습니다");
		} else {
			System.out.println("정확히 입력 해주세요");
		}


		for (int j = 1; j <= 5; j++) { //앞에 있는게 줄을 만들고 
			for (int w = 1; w <= j; w++) { // 뒤에있는 것이 별을 만든다
			System.out.print("*");
				
	
   
}
   System.out.println();

}
	
		
		
		
		
   }
}
