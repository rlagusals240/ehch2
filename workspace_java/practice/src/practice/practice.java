package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("3단계");
		for (int a = 1; a <= 3; a++) {
			System.out.println();
			for (int x = 1; x <= 5; x++) {
				System.out.print("+");
			}
		}

		System.out.println();
		for (int x = 1; x <= 5; x++) {
			System.out.println();
			for (int a = 1; a <= 5; a++) {
				System.out.print(x);

			}
		}
		System.out.println();
		System.out.println("5단계");
		for (int x = 1; x <= 5; x++) {
			System.out.println();
			for (int a = 1; a <= x; a++) {
				System.out.print(x);

			}
		}
		{
			System.out.println();
			for (int x = 1; x <= 10; x++) {
				if (x % 2 == 0)
					System.out.println(x);
			}
		}
		{
			for (int x = 1; x <= 5; x++) {
				System.out.println();
				for (int a = 1; a <= x; a++) {
					System.out.print(x);

				}
			}
		}
		System.out.println("피라미드 6단계");
		for (int x = 5; x >= 1; x--) {
			System.out.println();
			for (int a = 1; a <= x; a++) {
				System.out.print(x);
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		//돈이 2만원이 있을 때 4500원짜리 라떼를 몇 잔 살 수 있는가?
		
		int total = 20000;
		System.out.println(total);
		int c = 4500;
		System.out.println(total/c);
		
		int atotal = 7264;
		System.out.println(atotal + " 처음값");
		
		int x = 5000;
		System.out.println("5000원짜리:" + atotal/x);
		
		 int atotal2 = atotal - x *(atotal/x);
		 System.out.println("5000원빼고 남은돈" + atotal2);
		 
		int s = 1000;
		System.out.println("1000원짜리:" + atotal2/s);
		
		int a1 = atotal2 - s* (atotal2/s);
		System.out.println("1000빼고 남은돈" + a1);
	 System.out.println();
	 
	 int w = 100;
	 System.out.println("100짜리" + a1/w);
	 
	 int t = a1 - w *(a1/w);
	 System.out.println("100원빼고 남은돈" + t);
	 
	 int g = 10;
	 System.out.println("10원짜리" + t/g);
	 
	 //10원빼고 남은돈
	 int y = t-g * (t/g);
	 System.out.println("10원뺴고 남은돈" + y);
	 
	 int u = 1; 
	 System.out.println("1원짜리" + y/u);
	 
	 int f = u - y* (y/u);
		System.out.println("1원짜리 빼고 남은돈" + u/f);
		
		
		
	 //연산2 7264원을 5000원, 1000, 100, 50, 10, 1
		//각각 몇 개씩 줘야 할까?
		
	
		int k = 3;
		
		if(k >0) {
			System.out.println("양수");
		}else if(k < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
	}
}