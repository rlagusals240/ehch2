package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("3�ܰ�");
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
		System.out.println("5�ܰ�");
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
		System.out.println("�Ƕ�̵� 6�ܰ�");
		for (int x = 5; x >= 1; x--) {
			System.out.println();
			for (int a = 1; a <= x; a++) {
				System.out.print(x);
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		//���� 2������ ���� �� 4500��¥�� �󶼸� �� �� �� �� �ִ°�?
		
		int total = 20000;
		System.out.println(total);
		int c = 4500;
		System.out.println(total/c);
		
		int atotal = 7264;
		System.out.println(atotal + " ó����");
		
		int x = 5000;
		System.out.println("5000��¥��:" + atotal/x);
		
		 int atotal2 = atotal - x *(atotal/x);
		 System.out.println("5000������ ������" + atotal2);
		 
		int s = 1000;
		System.out.println("1000��¥��:" + atotal2/s);
		
		int a1 = atotal2 - s* (atotal2/s);
		System.out.println("1000���� ������" + a1);
	 System.out.println();
	 
	 int w = 100;
	 System.out.println("100¥��" + a1/w);
	 
	 int t = a1 - w *(a1/w);
	 System.out.println("100������ ������" + t);
	 
	 int g = 10;
	 System.out.println("10��¥��" + t/g);
	 
	 //10������ ������
	 int y = t-g * (t/g);
	 System.out.println("10������ ������" + y);
	 
	 int u = 1; 
	 System.out.println("1��¥��" + y/u);
	 
	 int f = u - y* (y/u);
		System.out.println("1��¥�� ���� ������" + u/f);
		
		
		
	 //����2 7264���� 5000��, 1000, 100, 50, 10, 1
		//���� �� ���� ��� �ұ�?
		
	
		int k = 3;
		
		if(k >0) {
			System.out.println("���");
		}else if(k < 0) {
			System.out.println("����");
		}else {
			System.out.println("0");
		}
		
	}
}