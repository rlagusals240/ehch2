package sec04.Exam06.Overoding;

public class Calc {

	// Ŭ���� �ȿ��� int�� �����ϴ� ��� �޼ҵ忡�� ����
	// ���ϰ� ���� �޼ҵ忡�� ���� �����޴´�

	int plus(int a, int b) {
		System.out.println("int int ����");
		return a + b;
	}

//	//�������ڰ� int, int�� ���� ������ �����ε� ���� �ȵ�
//	int plus(int a, int b) {
//		return a + b; 
//}
	double plus(double a, double b) {
		System.out.println("���� ���� ����");
		return a + b;

	}

	double plus(int a, double b) {
		System.out.println("int ���� ����");
		return a + b;
	}

//	int plus(int a, int b) {
//		System.out.println("int ���� ����");
//		return a + b;
//	}
	int plus(int x) {
		return x + x;
	}
}