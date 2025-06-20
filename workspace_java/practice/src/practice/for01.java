package practice;

public class for01 {

	public static void main(String[] args) {

		{
			System.out.println("피라미드 0단계");
			for (int x = 1; x <= 5; x++)
				System.out.println("+");
		}
		///////////////////////////////////////////
		{
			System.out.println("피라미드 1단계");
			for (int x = 1; x <= 5; x++)
				System.out.print("+");
		}
		////////////////////////////////////////////
		{
			System.out.println();
			System.out.println("피라미드 2단계");
			for (int x = 1; x <= 5; x++)
				System.out.print("+" + ".");
		}
		////////////////////////////////////////////
		{
			System.out.println();
			System.out.println("피라미드 3단계");
			for (int x = 1; x <= 3; x++) {
				System.out.println();
				for (int a = 1; a <= 5; a++) {
					System.out.print("+");
				}
			}
		}
		///////////////////////////////////////
		{
			System.out.println();
			System.out.println("피라미드 4단계");
			for (int x = 1; x <= 5; x++) {
				System.out.println();
				for (int a = 1; a <= 5; a++) {
					System.out.print(x);
				}
			}
		}
		//////////////////////////////////////
		{
			System.out.println();
			System.out.println("피라미드 5단계");
			for (int x = 1; x <= 5; x++) {
				System.out.println();
				for (int a = 1; a <= x; a++) {
					System.out.print(x);
				}
			}
		}
		/////////////////////////////////////////
		{
			System.out.println();
			System.out.println("피라미드 6단계");
			for (int x = 1; x <= 5; x++) {
				System.out.println();
				for (int a = 1; a <= x; a++) {
					System.out.print("+");
				}
			}
		}
		//////////////////////////////////////
		{
			for (int x = 5; x >= 1; x--) {
				System.out.println();
				for (int a = 1; a <= 5; a++) {
					System.out.println();
				}
			}
		}
		int[][] aa = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		System.out.println(aa[0][1]);

		System.out.println();

		int[] sc = new int[10];
		System.out.println(sc[0]);
		for (int x = 0; x <= 9; x++) {
			sc[x] = x + 1;
			System.out.println(sc[x]);

		}
		System.out.println();
		int[] c = new int[10];
		System.out.println(c[0]);
		for (int x = 0; x <= 9; x++) {
			c[x] = x + 1;
			System.out.println(c[x]);
		}
		int[] d1 = { 1, 2, 3, 4, 5 };
		int[] d2 = d1;
		int[] d3 = { 1, 2, 3, 4, 5 };
		System.out.println("d1 == d2 : " + (d1 == d2));
		System.out.println("d1 == d3 : " + (d1 == d3));

		d2[1] = 10;
		System.out.println("d1[1] : " + d1[1]); // d1의 10이
	}

	{
		System.out.println();
		System.out.println("하");
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];

		for (int x = 4; x > 0; x--) {
			a[x] = x - 1;
			System.out.println(x);
		}

	}

	////////////////////////////////////////
	{
			System.out.println("문제 배열");
			
			int[] s = new int [10];
			for(int c = 0; c < s.length; c++) {
				s[c] += c;
				if(s[c] %2 == 0) {
					System.out.println(c);
				}
			}
		}

}
