package sec05.exam02;

import java.util.ArrayList;

public class CalcExam {
	 static int a = 10;

	public static void main(String[] args) {
		
		System.out.println("Calc.pi :" + Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "블랙";
		c1.pi = 3.14592;
		System.out.println("c1.pi :" + c1.pi);
		
		

		System.out.println(a);
		Calc c2 = new Calc();
		c2.color = "빨강";
		System.out.println("c2.pi :" + c2.pi);
		System.out.println("c2.pi :" + c2.pi);
		System.out.println(Math.PI);
		
		// 2. test 메소드 사용하기

//		test(); //static이 아니라서 사용 못함
//		CalcExam ce = new CalcExam();
//		ce.test
		
		test();
	}

	
	
	// 1.메소드명 test 만들기
	// 전달인자/리턴타입 없음
	// 그냥 아무 말이나 출력
	
	static void test() {
		System.out.println("아무말");
		
		
	}
	
//	java.util.ArrayList = new ArrayList();
	ArrayList List = new ArrayList();
	HashMap map = new HashMap();
}
