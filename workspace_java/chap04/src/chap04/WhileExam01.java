package chap04;

import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("�޴��� ���ÿ�");
		System.out.println("1Ŀ��,2:��,0:����");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		if (menu == 1) {
			System.out.println("Ŀ�� �帱����");
		} else if (menu == 2) {
			System.out.println("�� �帱����");
		} else if (menu == 0) {
			System.out.println("�ֹ��� �����մϴ�. ������ �ƿ�");
		} else {
			System.out.println("�ֹ��� Ȯ���ϼ���");
		}

	
	
	}
}
	