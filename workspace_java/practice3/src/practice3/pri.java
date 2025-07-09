package practice3;

public class pri {

	public static void main(String[] args) {

		{
			String mark = ".";
			System.out.println("문제 8번");
			for (int x = 0; x <= 5; x++) {

				for (int y = 0; y <= x; y++) {
					System.out.print("+");
				}
				for (int g = 5; g > x; g--) {
					System.out.print(mark);
				}

				System.out.println();
			}
		}

		///////////////////////////////////
		{
			System.out.println("문제 9번");
			String mark = ".";
			for (int x = 0; x <= 5; x++) {

				for (int g = 5; g > x; g--) {
					System.out.print(mark);
				}

				for (int y = 0; y <= x; y++) {
					System.out.print("+");
				}

				System.out.println();
			}
		}
		{
			// x1 = 10 y1 = 50 그리고
			// 반대편 모서리에 x2 = 90 y2 = 100이야
			// 이때 x3과 y3이 사가형안에 들어가는지

			int x1 = 10;
			int y1 = 50;
			int x2 = 90;
			int y2 = 100;
			int x3 = 20;
			int y3 = 60;
			//  if안에 중첩 if를 넣으면 if가 맞으면 중첩된 if도 작동을 한다
			if (x3 > x1 && x3 < x2) {
				
			if (y3 > y1 && y3 < y2) {
					System.out.println("참입니다");
				} else {
					System.out.println("하지말자");
				}
			}
		}
		///////////////////////////////////
		{
			System.out.println("문제 10번");
			for(int )
		}
	}
}
