package practice;

public class sdfjsdf {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		boolean flag = false;
		for (int i = 0; i < lotto.length; i++) {
			do {
				flag = false;
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						System.out.println("중복:" + lotto[i]);
						flag = true;
					}
				}
			} while (flag);
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + ", ");
		}
		System.out.println();
		///////////////////////////////////
		
		{
			System.out.println("문제 1번");
			int a = 10;
			int b = 20;
			System.out.println( a+b );
		}
		
		double d = 7.8;
		int c = (int)d;
		System.out.println(c);
		
		/////////////////////////////////////
		{
			System.out.println("문제 2번");
			double total = 4.3;
			int count = 4;
			int pay = (int) total / count;
			System.out.println("1인당 낼 금액" + pay*10000);
			}
		//////////////////////////////////////////
		{
			System.out.println("문제");
			double total = 58750;
			int count = 6;
			int pay = (int)total / count *1000/1000;
					System.out.println("1인당 금액" + pay);
			int parp = pay * count;
			System.out.println("부담금액" + parp);
			int ttotal = (int) total - parp;
			System.out.println("남은돈"+ttotal);
			int tto = ttotal / count;
			System.out.println("1명당 더 내야 할 금액" + tto);
		}
	}
}