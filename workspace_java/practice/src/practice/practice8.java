package practice;

public class practice8 {

	public static void main(String[] args) {

		{
			System.out.println("문제 0번");
			int[] a = { 1, 2, 3 };
			for (int x = 0; x < a.length; x++) {
				System.out.print(a[x] + " ");

			}
		}

		{
			System.out.println();
			System.out.println("문제 1번");
			int[] a = { 1, 2, 3 };
			for (int x = a.length - 1; x >= 0; x--) {
				System.out.print(a[x] + " ");
			}

		}
		///////////////////////////////////////
		{
			System.out.println();
			System.out.println("문제 2번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] % 2 == 1) {
					count++;
				}
			}
			System.out.println("홀수개수" + count);
		}
		////////////////////////////////
		{
			System.out.println("문제 3번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] > 4) {
					count++;
				}
			}
			System.out.println("4보다 큰수" + count);
		}
		//////////////////////////////////////////
		{
			System.out.println("문제 4번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int min = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] < min) {
					min = a[x];
				}
			}
			System.out.println("최소값" + min);
		}
		///////////////////////////////////////
		{
			System.out.println("문제 5번");
			int[] a = {3,4,7,5,1,9,4};
			int max = 0;
			int min = 0;
			
			for(int x = 0; x < a.length; x++) {
				if(a[x] > max) {
					max = a[x];
				}
			}
			for(int s = 0; s < a.length; s++) {
				if(a[s] < max && a[s] > min) {
					min = a[s];
				}
			}
			System.out.println("두번째 값" + min);
		}
		//////////////////////////////////
		{
			int st = 2100000000;
			double sr = st;
			System.out.println(sr);
		}
		//////////////////////////////
		{
			for(int x = 0; x < 2; x++) {
				System.out.println(x);
			}
		}
		System.out.println();
		double st = 5.5;
		int sr = (int)st;
		System.out.println(3/1);
	
		int sw = 2100;
		long gt = sw;
		
	}
}
