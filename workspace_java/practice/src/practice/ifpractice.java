package practice;

public class ifpractice {

	public static void main(String[] args) {

		{
			int x = 12;
			if (x >= 10) {
				System.out.println("ū ���Դϴ�");
			}

		}
//////////////////////////////////////////////////////////////		
		{
			int x = 52;
			if (x >= 50 && x % 2 == 0) {
				System.out.println("¦���̸� 50 �̻��Դϴ�");
			}
		}
		//////////////////////////////////////////////////////
		{
			int x = 99;
			if (x <= 100 && x % 2 == 1) {
				System.out.println("100 ������ Ȧ���Դϴ�");
			}

		}
//////////////////////////////////////////////////
		{
			int x = 36;
			if (x >= 30 && x <= 50 && x % 2 == 0) {
				System.out.println("30���� ũ�� 50���� ������ ¦���Դϴ�");
			}
		}
////////////////////////////////////////////////////
		{
			int x = 101;
			if (x < 0 || x >= 100) {
				System.out.println("�����̰ų� 100�̻��� ���Դϴ�");// �����̰ų���� ������ 0���� ���� ���� �����ϸ� �ȴ�
			}
		}
////////////////////////////////////////////////////

		{
			int x = 6;
			if (x % 3 == 0 && x % 5 != 0) {
				System.out.println("3�� ����̰ų� 5�� ����� �ƴմϴ�");
			}
		}
		/////////////////////////////////////
		{
			int x = 2;
			if (x != 0 && x % 2 == 0) {
				System.out.println("0�� �ƴϸ鼭 ¦���Դϴ�");// �������ڸ� ���ְ� ����϶�� �ϸ� �̷��� �ϸ�ȴ�
			}
		}
		////////////////////////////////////////////////////////////
		{
			int x = 1;
			if (!(x < 0) || x % 2 == 1) {
				System.out.println("������ �ƴϰų� Ȧ���Դϴ�");
			}
		}
		////////////////////////////////////////////////
		{
			int x = 1;
			if (x > 0 || x % 2 != 1) {
				System.out.println("x�� �����̰ų�, Ȧ���� �ƴ��� �����մϴ�");
			}
		}
		//////////////////////////////////////////////
		{
			int x = 1;
			if (x >= 0 || x % 2 == 0) {
				System.out.println("������ �����մϴ�");
			}

		}
		///////////////////////////////////////////////////////
		{
			int x = 11;
			if (x >= 1 && (x > 10 || x % 2 == 1)) {
				System.out.println("���� ���");
			}
		}

		///////////////////////////////////////////
		{

		}
		System.out.println();
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;

		int[] bs2 = new int[3]; // ù��° []�̰Ŵ� int�� �̷���� �迭�̰�
		bs2[0] = b0 + 1; // �ι�° [] �迭�� �ѹ��� ���� ������ ����
		bs2[1] = b1 + 1; // ����° [] �迭�� ������� ���� �߿��� ���°�ΰ�? index�� 0���� �����Ѵ�
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
		///////////////////////////////////////// //���� for��
		// �̷��� �r ��°���� �� ���� �ְ�����
		// �̷����� �������� for�� ���ϴ�
		for (int data : f) {
			System.out.println("data :" + data);

		}
		////////////////////////////////////////////////
		{
			System.out.println("����0");
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
		System.out.println("��");
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];

		for (int x = 4; x > 0; x--) {
			a[x] = x;
			System.out.println(a[x]);
		}

		//////////////////////////////////////
		{
			System.out.println("���� �迭");
			for (int x = 0; x < 10; x++) {
				if (x % 2 == 0) {
					System.out.println(x);
				}
			}
		}

	}
}
