package practice3;

import java.util.Scanner;

public class Practice32 {

	public static void main(String[] args) {

		{
			System.out.println("���� �迭");
			int[] a = new int[10];

			for (int x = 0; x < 10; x++) {
				a[x] = x + 1;
				if (a[x] % 2 == 0) {
					System.out.println(a[x]);
				}
			}
		}
		///////////////////////////////////////
		{

			for (int x = 1; x <= 10; x++) {
				if (x % 2 == 0) {
					System.out.print(x + " ");
					System.out.println();

				}
			}
		}
////////////////////////////////////////////////////
//		System.out.println("����");
//		int[] a = new int [10];
//		for(int x = 10; x >0; x--) {
//			a[x] = x -1;
//				System.out.println(a[x-1]);
//			
//		}

		// �ݺ����� �迭�� �ϳ��� �����ϰ� �Ϸ���
		//
		int q = 10;

//		int[] a = new int [7];
//		for(int s = a.length-1; s > 0; s--) {
//			for(int i=0; i < a.length; i++) {
//				a[i] = s; 
//				System.out.println(a[i]);
//			}
//		}
//		int[] s = {1,2,3,4,5};

//		s[0] = 1;
//		s[1] = 2;
//		s[2] = 3;
//		s[3] = 4;
//		s[4] = 5;
//		for(int f = 0; f < 5 ; f++) {
//			   s[f] = s[f] + 1;
//			System.out.println(s[f]);
//		}
//		for(int f = 0; f < 5 ; f++) {
//			s[f] = s[f] + 1;
//			System.out.println(s[f]);
//		}

		int[] s = new int[10];
		// 10~5���� ���
		System.out.println();
		for (int x = 0; x <= s.length - 1; x++) {
			s[x] = x;
			System.out.println(s[x]);
		}
		/////////////////////////////////////////
		{
			System.out.println("���� 1��");

			int[] a;
			a = new int[] { 20, 30, 50 };
			int sum = 0;

			for (int x = 0; x < 3; x++) {
				sum += a[x];
			}
			System.out.println(sum);
		}

		/////////////////////////////////////////
//		{
//			System.out.println("문제 1번");
//
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			if(num > 0) {
//				int a = num;
//				for (int x = 1; x <= 9; x++) {
//					System.out.println(a + " X " + x + " = " + (a*x));
//				}
//		}
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//
//			}
//		}

		//////////////////////////////////
		{
			int a = 1;
			int b = 1;
			if (a > 0 && b < 10) {
				System.out.println(a + b);
			}

		}
		////////////////////////////////////////////
		{
			System.out.println("문제");
		}
		int a = 0;
		for (int x = 3; x > 0; x--) {
			a = a + x;
			System.out.println(a);
		}
		////////////////////////////
		{
			System.out.println("문제");

			for (int x = 5; x > 0; x--) {
				for (int f = 5; f >= x; f--) {
					System.out.print("+");
				}
				System.out.println();
			}
		}

		////////////////////////////////////
		{
			System.out.println("문제");
			for (int x = 0; x < 5; x++) {
				for (int  = 0;  < 5; a++) {

				}
			}
		}
	}
}
