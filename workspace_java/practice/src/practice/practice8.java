package practice;

public class practice8 {

	public static void main(String[] args) {

		{
			System.out.println("���� 0��");
			int[] a = { 1, 2, 3 };
			for (int x = 0; x < a.length; x++) {
				System.out.print(a[x] + " ");

			}
		}

		{
			System.out.println();
			System.out.println("���� 1��");
			int[] a = { 1, 2, 3 };
			for (int x = a.length - 1; x >= 0; x--) {
				System.out.print(a[x] + " ");
			}

		}
		///////////////////////////////////////
		{
			System.out.println();
			System.out.println("���� 2��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] % 2 == 1) {
					count++;
				}
			}
			System.out.println("Ȧ������" + count);
		}
		////////////////////////////////
		{
			System.out.println("���� 3��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] > 4) {
					count++;
				}
			}
			System.out.println("4���� ū��" + count);
		}
		//////////////////////////////////////////
		{
			System.out.println("���� 4��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int min = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] < min) {
					min = a[x];
				}
			}
			System.out.println("�ּҰ�" + min);
		}
		///////////////////////////////////////
		{
			System.out.println("���� 5��");
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
			System.out.println("�ι�° ��" + min);
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
