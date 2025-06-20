package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Student s2 = new Student();
		System.out.println(s1 == s2); //false
		
		Student s3 = null;
		s3 = s1;
		System.out.println(s1 == s3); //true
		
		s1 = null;
		s3 = null;
		System.out.println(s3 == null);
		System.out.println(s1 == s3);
		
		s2 = null;
		System.out.println(s2 == null);
		
		Student s4 = new Student();
		
		System.out.println();
	}

}
