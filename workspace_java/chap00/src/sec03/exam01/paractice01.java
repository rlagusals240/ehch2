package sec03.exam01;

public class paractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				//0단계
		System.out.println("0단계");
		for(int a = 1; a <= 5; a++) {
			System.out.println("+");
		}
		/////////////////////////////////////////
		
			//1단계
		System.out.println("1단계");
			for(int b = 1; b <= 5; b++) {
				System.out.print("+");
				System.out.println();
			
		}	
			///////////////////////////////////
			      //2단계
			System.out.println("2단계");
			for(int a = 1; a <= 5; a++) {
			   System.out.print("+"+".");
			   System.out.println();
			
			}
			//////////////////////////////////
			       //3단계
			System.out.println("3단계");
			for(int a = 1; a <= 5; a = a + 1) {
				System.out.print("+");
			}
			System.out.println();
			for(int a = 1; a <= 5; a = a + 1) {
				System.out.print("+");
			}
			System.out.println();
			for(int a = 1; a <= 5; a = a + 1) {
				System.out.print("+");
			}System.out.println();
			
			          // 3.5단계
			System.out.println("3.5단계");
			for (int x = 1; x <= 5; x++) {
				for(int a = 1; a <= 5; a = a + 1) {
					System.out.print(x);
				}System.out.println();
			}
			         //3.7단계
			System.out.println("3.7단계");
			for (int x = 1; x <= 3; x++) {
				for(int a = 1; a <= 5; a = a + 1) {// for문을 하나씩 썻지만
					System.out.print("1");         //
				}System.out.println();
			}
			for (int x = 1; x <= 1; x++) {
				for(int a = 1; a <= 6; a = a + 1) {//
					System.out.print(a);
				}System.out.println();
			}
		/////////////////////////////////////////////////////////////////////////////
	
	
	
	
	}

}
