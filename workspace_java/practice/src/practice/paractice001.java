package practice;

public class paractice001 {

	public static void main(String[] args) {

		//////////////////////////////////////////////////////////
		System.out.println("1��");
		for (int x = 1; x <= 10; x++) {
			if (x % 2 == 0) {
				System.out.println(x);
				System.out.println();
			}
		}
//////////////////////////////////////////////////////////////////
		System.out.println("2��");
		for (int x = 10; x >= 1; x--) {
			System.out.print(x + " ");
		}
///////////////////////////////////////////////////////////////////////////	
		System.out.println("3��");
		for (int x = 1; x <= 10; x++) {
			if (x % 2 == 0) {
				System.out.println("¦��");
			} else {
				System.out.println("Ȧ��");
			}
		}
/////////////////////////////////////////////////////////////////////////

		for(int x = 1; x <=10; x++) {
			System.out.print(x);
			if(x %4 == 0) {
				System.out.println();
			}
		}

		
		
		int[] f = {4,5,7,2,5};
		int[] f2 = new int[f.length]; 
		
		System.out.println(f[0]);
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}
		
	
         
	}
}
