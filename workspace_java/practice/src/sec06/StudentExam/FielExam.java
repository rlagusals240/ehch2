package sec06.StudentExam;

public class FielExam {

	public static void main(String[] args) {
		

		Fiel f = new Fiel();
		f.powerOn();
		System.out.println(f.name);
		
		int result1 = f.plus(5, 10);
		System.out.println(result1);
	}
}
