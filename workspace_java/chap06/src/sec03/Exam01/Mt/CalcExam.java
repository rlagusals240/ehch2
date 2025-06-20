package sec03.Exam01.Mt;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();

		calc.powerOn();

		int sum = calc.plus(5, 7);
		System.out.println("sum: " + sum);

		int s = 5;
		sum = calc.plus(s, 7);
		System.out.println("sum: " + sum);

		double result = calc.divide(10,3);
				System.out.println(result);
	}
}
