package chap04;

public class ifExam {

	public static void main(String[] args) {

		int score = 75;

		if (score >= 90) {
			System.out.println("90 �̻��Դϴ�");
			System.out.println("A ���");
		}

	    if (score < 90) {
			System.out.println("90 �̸��Դϴ�");
			System.out.println("B ���");
		}
		if (!(score >= 90)) {
			System.out.println("90 �̸��Դϴ�");
			System.out.println("B ���");
		}

		if (score >= 90) {
			System.out.println("90 �̻��Դϴ�");
			System.out.println("A ���");
		} else {
			System.out.println("90 �̸��Դϴ�");
			System.out.println("B ���");
		}
		// else�� �ִٴ� �� ������ �ϳ��� ���� ���� ���� �ȴ�

		if (score >= 90) {
			System.out.println("A ���");
//          else if( score < 90 && score >= 80 ) 
		} else if (score >= 80) {
			System.out.println("B ���");
		} else if (score >= 70) {
			System.out.println("C ���");
		} else {
			System.out.println("D ���");
		}

		score = 97;
		if (score >= 95) {
			System.out.println("90�� �̻�");
			System.out.println("95�� �̻�");
		} else if (score >= 90) {
			System.out.println("90�� �̻�");
		}

		if (score >= 90) {
			System.out.println("90�� �̻�");
		}
//            if(score >= 90 && score >= 95) 
		if (score >= 95) {
			System.out.println("95�� �̻�");
		}

		if (score >= 90) {
			System.out.println("90�� �̻�");
		}
//        ���� if�� ���� ���� ������ �Ǵ��Ѵ�
		if (score >= 95) {
			System.out.println("95�� �̻�");
		}

		int x = 3;
		if (x % 2 == 0) {
			System.out.println("¦��");
//        } else if( x%2 != 0 ) {
//        } else if( x%2 == 1 ) {
		} else {
			System.out.println("Ȧ��");
		}

		{
			///////////////////////////
			// random
			double random1 = Math.random();
			System.out.println(random1);
		}
		// Math.random()
		// 0 <= Math.random() < 1
		// �ֻ��� : 1~6
		// ���� �������� ���ϴ� ��
		double random2 = Math.random() * 10000;
		// 1234.56789
		// (int)1234.56789 >>>>1234
		// 1234 % 6 : 0 ~ 5
		// 0 ~ 5 + 1 >>>> 1 ~ 6
		int dice = ((int) random2) % 6 + 1;
		System.out.println("�ֻ��� : " + dice);

		// 0 <= Math.random() < 1
		// 3 + 2 = 5
		// 3 + 2 = 5
		int dice0 = (int) (Math.random() * 6);
		dice = dice0 + 1;
		System.out.println("�ֻ��� : " + dice0);

		int lotto = (int) (Math.random() * 45);
		lotto = lotto + 1;// +1�� �� ������ 0�� �ȳ������ҷ���!
		System.out.println(lotto);

		int num = (int) (Math.random() * 2) + 1;

		if (num == 1) {
			System.out.println("1���� ���Խ��ϴ�");
		} else if (num == 2) {
			System.out.println("2���� ���Խ��ϴ�");
		}

		int num1 = 1;
		if (num1 == 1) {
			System.out.println("num1�� 1�Դϴ�");
		} else if (num == 2) {
			System.out.println("num1�� 2�Դϴ�");
		} else {
			System.out.println("num1�� 1�� 2�� �ƴմϴ�");
		}
		// switch�� case�� :�̰ɷ� ����Ѵ�
		switch (num) {
		case 1:
			System.out.println(" switch num�� 1�Դϴ�");
//        	break;
		case 2:
			System.out.println(" switch num�� 2�Դϴ�");
			break;
		default:
			System.out.println(" switch num 1�� 2�� �ƴմϴ�");
			break;
		}

		int name = 1;
		   

		if (name == 1) {
			System.out.println("month spring");
		}

		switch (name = 4 ) {
		case 1:
		case 2:
		case 3:
			System.out.println("�ƹ��̸�");
			case 4:
			System.out.println(" ���� ");
			default:
				System.out.println("�ƹ��̸�");
		case 7:
		case 8:
		case 9:
			System.out.println("��");
			break;
		}
         
		

	}
}