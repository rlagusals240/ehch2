package sec03.Exam01.Mt;

public class Calc {
	
	// 전원 켜기 메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	//메소드명 powerOff; powerOn 메소드와 동일하게
	void poweOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	/**
	 * JAVADOC 주석
	 * 더하기 기능
	 * 두 수를 입력 받아서 더한 결과를 돌려준다
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int 두개를 받겠다
	 * 리턴타입 : int x+y (두 수의 합)
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
	 * 두 정수를 입력 받아서
	 * 나누기한 결과를 
	 * double로 돌려준다
	 * 단! y가 0일때는 "안된다"고 출력하고 0을 돌려 줌
	 * 
	 * 메소드 명 : divide
	 * 전달인자 : int x, int y
	 * 리턴타입 : double
	 */
	
	double divide (int x, int y) {
		if(y==0) {
			System.out.println("y가 0일땐 출력하지않는다");
		}
		
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		
		double result =  x /  y;
		
		return result;
	}
	public void execute(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	
//	//int 배열의 모든 값을 더하는 메소드
//	int sum(int[] array) {
//		int sum = 0;
//		for(int x = 0; x < array.length; x++) {
//			sum += array[x];
//		}
//		return sum;
//		
//		//가변인자, 전개연산자, spread op
//		int sum2(int ... values)
}
