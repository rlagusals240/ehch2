package practice;

import java.util.Scanner;

public class Practice005 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		boolean c = a > b;// boolean�� �� ���� �� ����ϴ� ��

		System.out.println(a > b);
		if (c) { // if�� �� �߿� �ϳ��� ����ϴ� �� ������ ���ö� ���� �߰��ϴ³�
			System.out.println("�μ� �� ū��" + a);
		} else if (a < b) {
			System.out.println("�� ���� ū��" + b);
		}

		int hour = 10; // 10�÷� �����ϰ�
		int minute = 50; // �е� 50������ �����ϰ�
		int count = 0; // ��� �� �ִ��� �𸣰ڴ�

		minute += 35;
		count++;

		if (minute >= 60) {
			hour = hour + (minute / 60);// ���� 1�ð� �̻��̸� �ð����� �Ѿ����
			minute = minute % 60; // -�� �ᵵ ������ %�������� ����ϴ°� �� Ȯ���ϴ�
			System.out.println("�ð�:" + hour + "��" + " " + minute + "��");

		}

		{
			int x = 10;
			if (15 == 20) {
				System.out.println("15�� 20����");
				System.out.println("����");
			} else if (x > 10) {
				System.out.println("10�̻� 15�����̸�");
				System.out.println("��");
			} else {
				System.out.println("��������");
			}
		}

		int balance = 10000; // ���� �ܾ�
		Scanner sc = new Scanner(System.in);

		System.out.print("��ݾ��� �Է��ϼ���: ");
		int amount = sc.nextInt(); // ����ڷκ��� ��ݾ� �Է�

		if (amount <= 0) {
			// 0 ���ϸ� �Է����� ��
			System.out.println("��Ȯ�� �Է� ���ּ���");

		} else if (amount > balance) {
			// �ܾ׺��� ū �ݾ��� ��û���� ��
			System.out.println("�ܾ��� �����մϴ�");

		} else {
			// ���� ��� ó��
			balance -= amount;
			System.out.println(amount + "�� ��� �߰� " + balance + "�� ���ҽ��ϴ�");
		}

		sc.close();
		
		
	}

}
