package chap05;

public class ArrayExam {

	public static void main(String[] args) {
		
           /*
            * �迭
            * �ѹ��� ���� ������ ����� ���
            * ���� Ÿ�Ը� ���� �� �� ����
            * ������ �� ��ü ũ�⸦ ��������� ��
            * ������ ���� �������� index�� �����Ѵ� (index�� 0���� ����)
            */
		
		//����
		int[] a1; //java ��Ÿ��
//	    int [] a;
		int a2[]; //c��Ÿ��
        
		// �迭 ������ ���� ������ null �� ���� �� �ִ�
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		
		/*ù��° [] :int[]
		 *     int�� �̷���� �迭 ���� Ÿ���̴�
		 *�ι�° [] : new int[3[
		 *     �迭�� ũ��. �� �ѹ��� ���� ������ ����
		 * ����° [] : score[0] = 90;
		 *      ������� ���� �߿��� ���°�ΰ�?
		 *      index�� 0���� �����Ѵ�
		 */
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		System.out.println("score[1] :"+ score[1]);
		System.out.println("score[3] :"+ score[3]);
		
		
		
		String[] str = new String[3];
		System.out.println("str[0] :"+ str[0]);
		
		//�迭 ���� �� �⺻���� 
		//0,false, null�� �ʱ�ȭ ��
//		 java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 3
//		���̰� 3�̶� 0~2������ ��� �����ѵ� 100�� �־ ���� �߻�
//		System.out.println("str[100] :"+ str[100]);
		
		//�迭�� �����ϴ� �ι� ° ���
		// ���� ���� ��� ��Ȯ�� �˰� �ִ� ���
		
		int[] i1 = new int[] {90, 80, 75};
		int[] i2 = null;
		i2 = new int[] {90,80,75};
		
		  //�迭�� �����ϴ� �� ��° ���
		//����� ���ÿ� �ʱ�ȭ �ϴ� ��쿡��
//		new int[]�� ������ �� �մ�
		int[] i3 = {90,80,75};
		int[] i4 = null;
//		i4 = {90,80,75};
		
		 int[] scores = {83, 90, 87};
		 
		 System.out.println("score[0] :" + scores [0]);
		 System.out.println("score[1] :" + scores [1]);
		 System.out.println("score[2] :" + scores [2]);
		 
		 
		 
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;
		
		int[] bs2 = new int[3];
		bs2[0] = b0+1;
		bs2[1] = b1+1;
		bs2[2] = b2+1;
		
		int[] bs1 = new int[3];
		bs1[0] = b0;
		bs1[1] = b1;
		bs1[2] = b2;
	int[] [] bs = new int[10][3];
	bs[0] = bs2;
	bs[1] = bs2;
	System.out.println(bs[2][1]);
	
		

	}

}
