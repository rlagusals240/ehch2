package practice;

public class practice002 {

	public static void main(String[] args) {

		{
			{
				System.out.println("���� 0��");
				int[] a = { 1, 2, 3 };
				int[] b = { 1, 2, 3 };
				System.out.println(a == b);
				System.out.println();
			}
		}
		//////////////////////////////////
		{
			System.out.println("���� 1��");
			int[] a = { 1, 2, 3 };

			for (int x = 3; x > 0; x--) {
				System.out.print(x + " ");
			}
		}
		/////////////////////////////////////
		{
			System.out.println();
			System.out.println();
			System.out.println("���� 2��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] % 2 == 1) {
					count++;
				}
			}
			System.out.println("Ȧ������:" + count);
			System.out.println();
		}
		/////////////////////////////////////
		{
			System.out.println("���� 3��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] > 4) {
					count++;
				}
			}
			System.out.println("4���� ū��" + count);
		}
		///////////////////////////////
		{
			System.out.println();
			System.out.println("���� 4��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int max = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] > max) {
					max = a[x];
				}
			}
			System.out.println("�ִ밪" + max);
			System.out.println();
//			max = Integer.MIN_VALUE;
			//
			// else if(a<b) {
			// System.out.println("�� �߿� ū ���� "+ b);
			// }else{
			// System.out.println("�� �� ����" +b);

			// �ϴ� ó�� ���� �ִ밪���� ����
			// �������� �ִ밪 �̾��� �Ͱ� ���ؼ� ū ���� �ִ밪���� ����
			// �ݺ��ϴ� ���� ���� ū ���� �ִ밪 ������ �����ְڴ�
		}
		///////////////////////////////////////////////
		{
			// �� ��° ū �� ��°� ù��°�� �����ϰ� ���� ū ��
			System.out.println("���� 5��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int max = 0;
			int sc = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] > max) {
					max = a[x];
				}
			}
			for (int s = 0; s < 7; s++) {
				if (a[s] < max && a[s] > sc) {
					sc = a[s];
				}
			}
			System.out.println("�ι�° ū ��" + sc);
			System.out.println();
		}
		////////////////////////////////////
		{
			System.out.println("���� 6��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int[] b = new int[8];

			b[0] = 0;
			for (int x = 1; x < 8; x++) {
				b[x] = a[x - 1];
			}
			for (int s = 0; s < 8; s++) {
				System.out.print(b[s] + " ");
			}
		}
		////////////////////////////////
		{
			// ���� ũ���� �迭�� �ϴ� �����
			// ������ �� ������ ���� �纻�� �� ó���� �ֱ�
			// �������� �纻�� �ι�° ���� ����
			System.out.println();
			System.out.println();
			System.out.println("���� 7��");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int sa = a[6];

			for (int x = 6; x > 0; x--) {
				a[x] = a[x - 1];
			}
			a[0] = sa;
			for (int s = 0; s < 7; s++) {
				System.out.print(a[s] + " ");

			}
		}
		////////////////////////////////
		{
			System.out.println();
			System.out.println("���� 8��");
			String pw = "";

			for (int x = 0; x < 8; x++) {
				int a = (int) (Math.random() * 8);
				pw = pw + x;
				System.out.println("��й�ȣ" + pw);
				System.out.println();
			}
		}
		/////////////////////////////////////
		{
			
			
			int[] arr8 = new int[8];
			for (int i = 0; i < arr8.length; i++) {
				// �� �ڸ� ���� random
				arr8[i] = (int) (Math.random() * 10);
			}
			System.out.println();
			for (int i = 0; i < arr8.length; i++) {
				System.out.print(arr8[i] + " ");
			}
		}
		/////////////////////////
	}
}
