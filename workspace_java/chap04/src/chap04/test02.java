package chap04;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int x1 = 9, b2 = 1;

			for (int x = 1; x <= 10; x++) {
				int x2 = x * x1;
				System.out.print(x1 + "x" + x + "=" + x2 + " ");
			}
		}
		System.out.println();
		{
			int x1 = 4;

			for (int x = 1; x <= 10; x = x + 1) {
				int x2 = x * x1;
				System.out.print(x1 + "x" + x + "=" + x2 + " ");
			}
		}
	}
}