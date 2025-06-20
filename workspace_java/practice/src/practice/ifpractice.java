package practice;

public class ifpractice {

	public static void main(String[] args) {

		{
			int x = 12;
			if (x >= 10) {
				System.out.println("큰 수입니다");
			}

		}
//////////////////////////////////////////////////////////////		
		{
			int x = 52;
			if (x >= 50 && x % 2 == 0) {
				System.out.println("짝수이며 50 이상입니다");
			}
		}
		//////////////////////////////////////////////////////
		{
			int x = 99;
			if (x <= 100 && x % 2 == 1) {
				System.out.println("100 이하의 홀수입니다");
			}

		}
//////////////////////////////////////////////////
		{
			int x = 36;
			if (x >= 30 && x <= 50 && x % 2 == 0) {
				System.out.println("30보다 크고 50보다 작으며 짝수입니다");
			}
		}
////////////////////////////////////////////////////
		{
			int x = 101;
			if (x < 0 || x >= 100) {
				System.out.println("음수이거나 100이상의 수입니다");// 음수이거나라고 했을때 0보다 작은 수를 생각하면 된다
			}
		}
////////////////////////////////////////////////////

		{
			int x = 6;
			if (x % 3 == 0 && x % 5 != 0) {
				System.out.println("3의 배수이거나 5의 배수는 아닙니다");
			}
		}
		/////////////////////////////////////
		{
			int x = 2;
			if (x != 0 && x % 2 == 0) {
				System.out.println("0이 아니면서 짝수입니다");// 무슨숫자를 없애고 출력하라고 하면 이렇게 하면된다
			}
		}
		////////////////////////////////////////////////////////////
		{
			int x = 1;
			if (!(x < 0) || x % 2 == 1) {
				System.out.println("음수가 아니거나 홀수입니다");
			}
		}
		////////////////////////////////////////////////
		{
			int x = 1;
			if (x > 0 || x % 2 != 1) {
				System.out.println("x는 음수이거나, 홀수가 아님을 부정합니다");
			}
		}
		//////////////////////////////////////////////
		{
			int x = 1;
			if (x >= 0 || x % 2 == 0) {
				System.out.println("조건을 만족합니다");
			}

		}
		///////////////////////////////////////////////////////
		{
			int x = 11;
			if (x >= 1 && (x > 10 || x % 2 == 1)) {
				System.out.println("조건 통과");
			}
		}

		///////////////////////////////////////////
		{

		}
		System.out.println();
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;

		int[] bs2 = new int[3]; // 첫번째 []이거는 int를 이루어진 배열이고
		bs2[0] = b0 + 1; // 두번째 [] 배열은 한번에 만들 변수의 개수
		bs2[1] = b1 + 1; // 세번째 [] 배열은 만들어진 변수 중에서 몇번째인가? index는 0부터 시작한다
		bs2[2] = b2 + 1;

		int[] bs1 = new int[3];
		bs1[0] = b0;
		bs1[1] = b1;
		bs1[2] = b2;
		int[][] bs = new int[10][3];
		bs[0] = bs2;
		bs[1] = bs2;
		System.out.println("bs.length :" + bs.length);
		System.out.println("bs[0].length :" + bs.length);
		System.out.println();
///////////////////////////////////////////////////////////////
		int[] f = { 4, 5, 7, 2, 5 };
		int[] f2 = new int[f.length];

		System.out.println(f[0]);
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		f2[0] = 4;
		f2[1] = 5;
		f2[2] = 7;
		f2[3] = 2;
		f2[4] = 5;
		for (int a = 0; a < 5; a++) {
			System.out.println();
		}
		//////////////////////////////////////

		for (int i = 0; i < f.length; i++) {
			int data = f[i];
			System.out.println("data :" + data);
		}
		///////////////////////////////////////// //향상된 for문
		// 이렇게 몉 번째인지 알 수는 있겠으나
		// 이럴꺼면 전통적인 for이 편하다
		for (int data : f) {
			System.out.println("data :" + data);

		}
		////////////////////////////////////////////////
		{
			System.out.println("문제0");
			int[] a = { 1, 2, 3 };
			int[] b = { 1, 2, 3 };
			int[] c = { 1, 2, 3 };
			System.out.println(c == b);
			System.out.println(a == b);
			System.out.println(a == c);
		}
		////////////////////////////////////////////
		{
			int[] a = { 1, 2, 3 };
			int[] b = new int[4];
			for (int x = 0; x < 4; x++) {
				b[x] = x + 1;
				System.out.println(x);
			}

		}
		System.out.println("하");
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];

		for (int x = 4; x > 0; x--) {
			a[x] = x;
			System.out.println(a[x]);
		}

		//////////////////////////////////////
		{
			System.out.println("문제 배열");
			for (int x = 0; x < 10; x++) {
				if (x % 2 == 0) {
					System.out.println(x);
				}
			}
		}

	}
}
