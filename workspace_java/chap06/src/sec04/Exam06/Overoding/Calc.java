package sec04.Exam06.Overoding;

public class Calc {

	// 클래스 안에서 int를 선언하는 경우 메소드에서 값을
	// 정하고 값을 메소드에서 값을 돌려받는다

	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a + b;
	}

//	//전달인자가 int, int로 같기 때문에 오버로딩 적용 안됨
//	int plus(int a, int b) {
//		return a + b; 
//}
	double plus(double a, double b) {
		System.out.println("더블 더블 실행");
		return a + b;

	}

	double plus(int a, double b) {
		System.out.println("int 더블 실행");
		return a + b;
	}

//	int plus(int a, int b) {
//		System.out.println("int 더블 실행");
//		return a + b;
//	}
	int plus(int x) {
		return x + x;
	}
}