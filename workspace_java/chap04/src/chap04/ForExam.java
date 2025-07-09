package chap04;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	{
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);

		int sum2 = 10;
		for (int i = 1; i <= 10; i = i + 1) {
			sum2 = sum2 + 1;
		}
		System.out.println("sum2 : " + sum2);

		int limit = 10;
		{
			for (int i = 1; i <= 10; i = i + 1)
				sum1 = limit + 1;
			System.out.println("sum1 : " + sum1);
		}

		// 1~5������ ���� ���ϴ� ��
		//
//		int i = 1;
//		sum = 0;
//		
//		sum = sum + i;
//		i++;
//		
//		sum = sum + i;
//		i++;
//		
//		sum = sum + i;
//		i++;

		// ������ 2���� ����Ͻÿ�
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		/*
		 * �ݺ��� ����� ����
		 * 
		 * 1.�ݺ� �Ǵ� �� ã�� ctrl + c, v ���� �� �ٲ��� �ʴ°� ã�� 2.�ݺ� ���� �ʴ� �Ϳ��� ��Ģ(������)�� ã�� ������ Ȱ���ؼ�
		 * �� �̻� �ٲ��� �ʰ� ����� 3. ���� ���� �ľ� 4. ���� ���� �ľ� for : �ݺ� Ƚ���� �ƴ� ��� while : �ݺ� Ƚ���� �𸣴�
		 * ���
		 * 
		 */

		int i2 = 2;
		System.out.println("i2 : " + i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		i2 = i2 + 1;
		System.out.println(i2);
		for (int i3 = 1; i3 <= 4; i3 = i3 + 1) {
			System.out.println(i3);

			// 2 ~ 10���� ¦���� ���
			System.out.println(2);
			System.out.println(4);
			System.out.println(6);
			System.out.println(8);
			System.out.println(10);

			// �ٽ� ����
			System.out.println(2);
			System.out.println(4);
			System.out.println("3: " + 6);
			// �̹��� ����Ȱ��
			int i6 = 2;

			System.out.println(i6);
			i3 += 1;
			System.out.println(i6);
			i3 += 2;
			System.out.println(i6);

			///////////////////////////////////////////////////

			// 0�ܰ�
			/*
			 * + + + + +
			 */
//	 System.out.println("+");
//	 System.out.println("+");
//	 System.out.println("+");
//	 System.out.println("+");

		}
		for (int j = 1; j <= 5; j++)
			System.out.println("+");

		String mark = "+";
		System.out.println();
		String space = ".";
		for (int j = 1; j <= 5; j++)
			System.out.println(mark + space);

		System.out.println();

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(mark);
				System.out.println();
			}
		}
		
		////////////////////////////
//		{
//			System.out.println("문제1번");
//			int row = 20;
//			String p = "+";
//			String  j = ".";
//			for(int x = 0; x <= row-1; x++) {
//				System.out.println(x);
//			}
//			
//		}

	}
}
