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
			System.out.println("���� ����");
			double total = 4.3;
			int count = 4;
			double result1 = total / count;
			System.out.println("1�� result1: " + (result1 * 10000));
		}

		int age = 17;

		if (age >= 20) {
			System.out.println("����");
		} else if (age >= 13 & age <= 19) {
			System.out.println("û�ҳ�");
		}

		int i = 90;

		if (i >= 80)
			System.out.println("������ �� �۴�");

		int num = 7;

		if (num % 2 == 0) {
			System.out.println("¦��");

		} else {
			System.out.println("Ȧ��");
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
			System.out.println("97�� �̻�");
			System.out.println("95�� �̻�");
		} else if (score >= 90) {
			System.out.println("90�� �̻�");
		} else
			System.out.println("85�� �̸�");

		int x5 = -5;

		if (x5 > 0) {
			System.out.println("���");
		} else if (x5 < 0) {
			System.out.println("����");
		} else {
			System.out.println("0");
		}

		int a1 = 10;
		int b = 20;

		if (a > b) {
			System.out.println("�� ū ��: " + a);
		} else {
			System.out.println("�� ū ��:" + b);
		}
		{
			int hour = 10;
			int minute = 50;
			minute += 35;
			if (minute >= 60)
				hour += (minute / 60);
			minute = minute % 60;
			System.out.println("35�� �� �ð�:" + hour + "��" + minute + "��");
		}
		int la = 20;

		if (la >= 15 && la <= 20) {
			System.out.println("la�� 15�̻� 20 �����Դϴ�");
		} else if (la >= 14)
			System.out.println("la�� 15���� �۽��ϴ�");
		else {
			System.out.println("la�� 15�̻��Դϴ�");
		}

		int f = 10;
		int h = 20;

		if (f > h) {
			System.out.println("�� ū �� " + f);
		} else {
			System.out.println("�� ū ��" + h);
		}

		int t = 10000;
		int with = 10000;

		if (with > t) {
			System.out.println("�ܾ��� �����մϴ�");
		} else if (with > 9999 && with <= t) {
			System.out.println("������߰� �� ���ҽ��ϴ�");
		} else {
			System.out.println("��Ȯ�� �Է� ���ּ���");
		}


		for (int j = 1; j <= 5; j++) { //�տ� �ִ°� ���� ����� 
			for (int w = 1; w <= j; w++) { // �ڿ��ִ� ���� ���� �����
			System.out.print("*");
				
	
   
}
   System.out.println();

}
	
		
		
		
		
   }
}
