package sec02.Exam01.FD;

public class CarExam {

	public static void main(String[] args) {
		
		//객체(클래스) 생성
		Car myCar = new Car();
		
	    System.out.println(myCar.company);
	    myCar.company = "벤틀리";
	    System.out.println(myCar.color);
	    myCar.color = "흰색";
	    System.out.println(myCar.speed);
	     myCar.speed = 150;
	    System.out.println(myCar.speed);
	}

}
