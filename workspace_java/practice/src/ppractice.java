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
			System.out.println("�ִ밪" + max);
		}
		///////////////////////////////////
		{
			System.out.println("���� 3");
			int[] a = { 5, 8, 2 };
			int count = 0;
			for (int x = 0; x < a.length; x++) {
				if (a[x] % 2 == 0) {
					count++;
				}
			}
			System.out.print("¦���� ����:" + count);
		}
		/////////////////////////////////////
		{
			System.out.println("���� 4��");
			int[] a = { 5, 8, 2 };
			{
				for (int x = a.length - 1; x >= 0; x--) {
					System.out.println(a[x]);
				}
			}
		}
		///////////////////////////////////////
		{
			System.out.println("���� 5��");
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
				System.out.println("�ִ밪" + max);
				System.out.println("�ּҰ�" + min);
				System.out.println("����" + (max - min));
			}
		}
		//////////////////////////////////
		{
			System.out.println("���� 6��");
			double[] a = { 5, 8, 2 };
			{
				int sum = 0;
				for (int x = 0; x < a.length; x++) {
					sum += a[x];
				}
				double avg = sum / (double) a.length;
				System.out.println("��" + sum);
				System.out.println("���" + avg);
			}
		}
		//////////////////////////////////
		{
			System.out.println("���� 7��");
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
				System.out.println("���" + avg);
				System.out.println("��պ��� ū �� ����" + count);
			}
		}
		//////////////////////////////////
		{
			System.out.println("���� 8��");
			int[] a = { 5, 8, 2 };
			{
				for (int x = a.length - 1; x >= 0; x--) {
					System.out.println(a[x]);
				}
			}
		}
		/////////////////////////////////////
		{
			System.out.println("���� 9��");
			int[] a = { 5, 8, 2 };
			{
				int product = 1;
				for (int x = 0; x < a.length; x++) {
				}
				product *= a[0];
				product *= a[1];
				product *= a[2];
				System.out.println("��� ����� ��" + product);
			}
		}
		/////////////////////////////////
		{
			System.out.println("���� 10��");
			int hour = 10; // 10��
			int minute = 50; // 50��

			minute += 35; // 35�� ���ϱ�

			if (minute >= 60) {// ���� 60�� ������

				hour = hour + minute / 60; // �ð��� 60���� �߰� or �״�� �α�
				minute = minute % 60; // ������ �и� ���� �Ѵ�
			}
			System.out.println(hour + "��" + minute + "��");
		}

		System.out.println("����");
		int month = 5;
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("��");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("����");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("����");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("�ܿ�");
		}
		////////////////////////////////////
		{
			System.out.println("����������");
			int hour = 10;
			int minute = 50;

			minute += 35;

			// 60���� ������
			if (minute >= 60) {

				// hour�� �Űִܳ´�
				hour += minute / 60;
				minute = minute % 60;
				System.out.println(hour + "��" + minute + "��");

			}
		}

//		
//		int hour = 10;
//		int minute = 50;
//		
//		minute += 35;
//		
//		if(minute >= 60) {//60���� ������
//			
//			hour = hour + minute / 60; // �ð����� �Ű��ְ�
//			minute = minute %60; // ���� ���� �п��� �Ű��ְ�
//			System.out.println( hour + "�ð�" + minute + "��" );
//		}

		double total = 4.3; // ȸ�ĺ�
		int count = 4; // �����
		// �տ� int�� ���� �� ��ȯ�� �ؼ� ��ȸ�ĺ�� 4�� ������� 4���̴� ���� �����ְ�
		// 4/4�� 1�̴� 10000�� �����ָ� 1�δ� �� �ݾ��� ã�� �� �ִ�
		int pay = (int) ((total / count)) * 10000;
		System.out.println(pay);
		// ��ȸ�ĺ�� ������� ���°������� ���� ������� 4���� 3���� �����
		// 10000���� *�����ָ� ���� ���´�
		double ppay = (total - (count - 1)) * pay;
		System.out.println(ppay);

		//////////////////////////////////////
		{
//			�ֻ��� 2���� ������ ���� �� �ִ� ��� ������ ����Ѵ�
//			[1,1] [1,2]
			System.out.println("���� 1��");

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
			System.out.println("���� 2��");

			for (int x = 1; x < 6; x++) {
				for (int a = 1; a < 6; a++) {
					System.out.println("��" + (a + x) + "[" + x + "," + a + "]");

				}

			}
		}
		///////////////////////////////////////////////////
		{
			System.out.println("���� 3��");
			Scanner sc = new Scanner(System.in);
			{

			}

		}
	}
}
