package sec06.StudentExam;

import java.util.Scanner;

public class diceExam {

	public static void main(String[] args) {

	// ���� ���ڸ� �����ؼ� �����ֱ�
	int getNumber(int start, int end) {
		int result = Integer.MIN_VALUE;
		if (end > start) {
			result = (int) (Math.random() * (end - start + 1)) + start;

		}else {
			System.out.println("������ ���� ���ں��� ũ�ų� ����");
		}
		return result;
	}

	// �޼ҵ�� : start
	// �������� : int start, int end // ������ ����
	// ����Ÿ�� : void
	void start(int start, int end) {
		
		System.out.println("1.���ӽ��� || 0. ����");
		int menu = s.nextInt();
		switch(menu) {
		case 1:
		}
	}
		
		// �̹� ���� ���� 
		int answer = getNumber(start, end);
		
		//���俩��
		boolean ok = false;
		
		
		while(!ok) {
//		while(ok != true) {
//		while(ok == false) {
		}
		Scanner s = new Scanner(System.in);
		System.out.println("����" + start, end);
		int nuber = s.nextInt();
		
		if(answer == number) {
			System.out.println("�����Դϴ�");
			ok = true;
		}else if(answer < number) {
			System.out.println("up");
		}else {
			System.out.println("down");
		}
	}
	}

