package practice;

public class for01 {

	public static void main(String[] args) {

		{
			System.out.println("피라미드 1단계");
			for (int a = 1; a <= 5; a++) {
				System.out.println("+");
			}
		}
		///////////////////////////////////
		{
			System.out.println("피라미드 2단계");
			for (int a = 0; a < 5; a++) {
				System.out.print("+");
				System.out.println();
			}
		}
		//////////////////////////////////
		System.out.println("피라미드 3단계");
		for (int a = 1; a <= 5; a++) {
			System.out.println();
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
		}
		System.out.println();
		////////////////////////////////
		{
			System.out.println("피라미드 4단계");
			
			for (int a = 1; a <= 5; a++) {
				for (int b = 1; b <= (5-a); b++) {
					System.out.print(" ");
					for(int c = 1; c <= a; c++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}

		/////////////////////////////////////////
		System.out.println("피라미드 5단계");
		int line = 5;
		for(int x=0; x<5; x++) {
			for(int y=1; y<(line-x); y++) {
				System.out.print(" ");
			}
			for(int c=0; c<(2*x)+1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}