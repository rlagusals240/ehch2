package chap04;

public class �Ƕ�̵� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//���콺 �ø��� import ����
//		// ��Ʈ�� ����Ʈ + O �����
//		int a = 10;
//		Scanner scanner = new Scanner (system.in)
//				//�� �� �۾� �Է� �޾ƿ���
//				string a = new scanner(system.in)
//				//���� �۾� �Է� �޾ƿ���
//				string a = scanner = new scanner(system.in)
//				string a 
//				

		for (int a = 1; a <= 1; a++)
			System.out.println("*");
		for (int b = 1; b <= 2; b++)
			System.out.print("*");

		// ���� 1
		// �ֻ��� 2���� ������ ���� �� �ִ� ��� ������ ����϶�
		// [1,1]

		/*
		 * ����2 �ֻ��� 2���� �� ���� ���� �� �ִ� ����
		 * 
		 * ��2 : [1,1] ��3 : [1,2] [1,2] [2,1]
		 * 
		 * ���� 3 �պ� ������ �� ���
		 * 
		 * ���� 4 ������ ���� ���� �ߺ� ����
		 * 
		 * �Է¹��� ������ ���� ������ ���� ��� 3 00 01 02 10 11 12 20 21 22
		 * 
		 * 
		 * ���� 6 �Է¹��� ������ ���� ������ ���� ��� ���� 3�� ������ (���簢��) +++ +.+ +++ ���簢�� �׸���
		 * 
		 * 5 +++++ +...+ +...+ +++++
		 * 
		 */
		System.out.println();

		for (int x = 1; x <= 6; x++) {
			System.out.println("[1" + "+ x +" + "]");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.println("[" + i + "," + j + "]");
			}
		}
		for (int k = 2; k <= 12; k++) {
			System.out.println("���� " + k + ":");
			int cnt = 0;
			for (int d = 1; d <= 6; d++) {//�̰� ù��° �ֻ��� 
				for (int s = 1; s <= 6; s++) {//�ι�° �ֻ��� 
					if (d + s == k) {
						System.out.println("[" + d + ", " + s + "]");
						cnt++;
					}
				}
			}
			System.out.println(("�� ����: +" + cnt));
			System.out.println();
		}
	}
}