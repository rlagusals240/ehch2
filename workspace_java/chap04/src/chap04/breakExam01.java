package chap04;

public class breakExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�ֻ��� ����

		System.out.println("����");
		int count = 0;
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("�ֻ��� : " + num);

			if (num == 6) {
				break;
			}
			count++;
		}
		System.out.println("���� ����: " + count);
		//////////////////////////////////////////////////////

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i >= 5) {
				break;
			}

		}
///////////////////////////////////////////////////////////////

		for (int i = 0; i < 5; i++) {
			System.out.println("i: " + i);

			for (int j = 0; j < 20; j++) {
				System.out.println("j: " + j);
				if (j >= 2) {
					System.out.println("break");
					break;

				}
			}
		}
		//////////////////////////////////////////////////
		System.out.println("���� ����");
		boolean isStop = false;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 3; j++) {

				int num = (int) (Math.random() * 6) + 1;
				System.out.println("�ֻ��� :" + num);

				if (num == 6) {
					isStop = true;
					break;
				}

			}
			if (isStop) {
				break;

			}
		}
/////////////////////////////////////////////////////////////
		System.out.println("���� �˾�");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;

			}
			System.out.println(i);
		}
		////////////////////////////////////////////////////////
			System.out.println("���� ����");
		for (int x = 1; x <= 10; x++) {
			if (x % 2 != 0) {
				continue;
			}
System.out.println(x);
		}
	}
}
