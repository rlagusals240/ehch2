package sec05.exam02;

import java.util.ArrayList;

public class CalcExam {
	 static int a = 10;

	public static void main(String[] args) {
		
		System.out.println("Calc.pi :" + Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "��";
		c1.pi = 3.14592;
		System.out.println("c1.pi :" + c1.pi);
		
		

		System.out.println(a);
		Calc c2 = new Calc();
		c2.color = "����";
		System.out.println("c2.pi :" + c2.pi);
		System.out.println("c2.pi :" + c2.pi);
		System.out.println(Math.PI);
		
		// 2. test �޼ҵ� ����ϱ�

//		test(); //static�� �ƴ϶� ��� ����
//		CalcExam ce = new CalcExam();
//		ce.test
		
		test();
	}

	
	
	// 1.�޼ҵ�� test �����
	// ��������/����Ÿ�� ����
	// �׳� �ƹ� ���̳� ���
	
	static void test() {
		System.out.println("�ƹ���");
		
		
	}
	
//	java.util.ArrayList = new ArrayList();
	ArrayList List = new ArrayList();
	HashMap map = new HashMap();
}
