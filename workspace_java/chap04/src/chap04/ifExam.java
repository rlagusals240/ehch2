package chap04;

public class ifExam {

	public static void main(String[] args) {

		int score = 75;

		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
		}

	    if (score < 90) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		if (!(score >= 90)) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}

		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
		} else {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		// else가 있다는 건 무조건 하나의 실행 블럭이 실행 된다

		if (score >= 90) {
			System.out.println("A 등급");
//          else if( score < 90 && score >= 80 ) 
		} else if (score >= 80) {
			System.out.println("B 등급");
		} else if (score >= 70) {
			System.out.println("C 등급");
		} else {
			System.out.println("D 등급");
		}

		score = 97;
		if (score >= 95) {
			System.out.println("90점 이상");
			System.out.println("95점 이상");
		} else if (score >= 90) {
			System.out.println("90점 이상");
		}

		if (score >= 90) {
			System.out.println("90점 이상");
		}
//            if(score >= 90 && score >= 95) 
		if (score >= 95) {
			System.out.println("95점 이상");
		}

		if (score >= 90) {
			System.out.println("90점 이상");
		}
//        위의 if와 관계 없이 무조건 판단한다
		if (score >= 95) {
			System.out.println("95점 이상");
		}

		int x = 3;
		if (x % 2 == 0) {
			System.out.println("짝수");
//        } else if( x%2 != 0 ) {
//        } else if( x%2 == 1 ) {
		} else {
			System.out.println("홀수");
		}

		{
			///////////////////////////
			// random
			double random1 = Math.random();
			System.out.println(random1);
		}
		// Math.random()
		// 0 <= Math.random() < 1
		// 주사위 : 1~6
		// 대충 나머지로 구하는 법
		double random2 = Math.random() * 10000;
		// 1234.56789
		// (int)1234.56789 >>>>1234
		// 1234 % 6 : 0 ~ 5
		// 0 ~ 5 + 1 >>>> 1 ~ 6
		int dice = ((int) random2) % 6 + 1;
		System.out.println("주사위 : " + dice);

		// 0 <= Math.random() < 1
		// 3 + 2 = 5
		// 3 + 2 = 5
		int dice0 = (int) (Math.random() * 6);
		dice = dice0 + 1;
		System.out.println("주사위 : " + dice0);

		int lotto = (int) (Math.random() * 45);
		lotto = lotto + 1;// +1을 쓴 이유는 0이 안나오게할려고!
		System.out.println(lotto);

		int num = (int) (Math.random() * 2) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		}

		int num1 = 1;
		if (num1 == 1) {
			System.out.println("num1은 1입니다");
		} else if (num == 2) {
			System.out.println("num1은 2입니다");
		} else {
			System.out.println("num1은 1과 2가 아닙니다");
		}
		// switch는 case가 :이걸로 사용한다
		switch (num) {
		case 1:
			System.out.println(" switch num은 1입니다");
//        	break;
		case 2:
			System.out.println(" switch num은 2입니다");
			break;
		default:
			System.out.println(" switch num 1과 2가 아닙니다");
			break;
		}

		int name = 1;
		   

		if (name == 1) {
			System.out.println("month spring");
		}

		switch (name = 4 ) {
		case 1:
		case 2:
		case 3:
			System.out.println("아무이름");
			case 4:
			System.out.println(" 현민 ");
			default:
				System.out.println("아무이름");
		case 7:
		case 8:
		case 9:
			System.out.println("민");
			break;
		}
         
		

	}
}