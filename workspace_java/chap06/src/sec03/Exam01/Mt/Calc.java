package sec03.Exam01.Mt;

public class Calc {
	
	// ���� �ѱ� �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	//�޼ҵ�� powerOff; powerOn �޼ҵ�� �����ϰ�
	void poweOff() {
		System.out.println("������ ���ϴ�");
	}
	
	
	/**
	 * JAVADOC �ּ�
	 * ���ϱ� ���
	 * �� ���� �Է� �޾Ƽ� ���� ����� �����ش�
	 * 
	 * �޼ҵ�� : plus
	 * �������� : int, int �ΰ��� �ްڴ�
	 * ����Ÿ�� : int x+y (�� ���� ��)
	 * 	 
	 * @param int x, int y
	 * return int 
	 * @author
	 * 
	 */
	int plus(int x, int y) {
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		int result = x + y;
		
		return result;
		
		
		
	}
	
	
	
	/**
	 * �� ������ �Է� �޾Ƽ�
	 * �������� ����� 
	 * double�� �����ش�
	 * ��! y�� 0�϶��� "�ȵȴ�"�� ����ϰ� 0�� ���� ��
	 * 
	 * �޼ҵ� �� : divide
	 * �������� : int x, int y
	 * ����Ÿ�� : double
	 */
	
	double divide (int x, int y) {
		if(y==0) {
			System.out.println("y�� 0�϶� ��������ʴ´�");
		}
		
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		double result =  x /  y;
		
		return result;
	}
	public void execute(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	
//	//int �迭�� ��� ���� ���ϴ� �޼ҵ�
//	int sum(int[] array) {
//		int sum = 0;
//		for(int x = 0; x < array.length; x++) {
//			sum += array[x];
//		}
//		return sum;
//		
//		//��������, ����������, spread op
//		int sum2(int ... values)
}
