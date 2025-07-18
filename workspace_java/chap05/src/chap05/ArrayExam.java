package chap05;

public class ArrayExam {

	public static void main(String[] args) {
		
           /*
            * 배열
            * 한번에 여러 변수를 만드는 방법
            * 같은 타입만 선언 할 수 있음
            * 생성할 때 전체 크기를 지정해줘야 함
            * 생성된 여러 변수들은 index로 관리한다 (index는 0부터 시작)
            */
		
		//선언
		int[] a1; //java 스타일
//	    int [] a;
		int a2[]; //c스타일
        
		// 배열 변수는 참조 변수라서 null 을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		
		/*첫번째 [] :int[]
		 *     int로 이루어진 배열 변수 타입이다
		 *두번째 [] : new int[3[
		 *     배열의 크기. 즉 한번에 만들 변수의 개수
		 * 세번째 [] : score[0] = 90;
		 *      만들어진 변수 중에서 몇번째인가?
		 *      index는 0부터 시작한다
		 */
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		System.out.println("score[1] :"+ score[1]);
		System.out.println("score[3] :"+ score[3]);
		
		
		
		String[] str = new String[3];
		System.out.println("str[0] :"+ str[0]);
		
		//배열 생성 후 기본값은 
		//0,false, null로 초기화 됨
//		 java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 3
//		길이가 3이라서 0~2까지만 사용 가능한데 100을 넣어서 예외 발생
//		System.out.println("str[100] :"+ str[100]);
		
		//배열을 선언하는 두번 째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		
		int[] i1 = new int[] {90, 80, 75};
		int[] i2 = null;
		i2 = new int[] {90,80,75};
		
		  //배열을 선언하는 세 번째 방법
		//선언과 동시에 초기화 하는 경우에만
//		new int[]를 생략할 수 잇다
		int[] i3 = {90,80,75};
		int[] i4 = null;
//		i4 = {90,80,75};
		
		 int[] scores = {83, 90, 87};
		 
		 System.out.println("score[0] :" + scores [0]);
		 System.out.println("score[1] :" + scores [1]);
		 System.out.println("score[2] :" + scores [2]);
		 
		 
		 
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;
		
		int[] bs2 = new int[3];
		bs2[0] = b0+1;
		bs2[1] = b1+1;
		bs2[2] = b2+1;
		
		int[] bs1 = new int[3];
		bs1[0] = b0;
		bs1[1] = b1;
		bs1[2] = b2;
	int[] [] bs = new int[10][3];
	bs[0] = bs2;
	bs[1] = bs2;
	System.out.println(bs[2][1]);
	
		

	}

}
