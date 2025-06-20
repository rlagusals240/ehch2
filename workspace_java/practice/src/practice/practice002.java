package practice;

public class practice002 {

	public static void main(String[] args) {

		{
			{
				System.out.println("문제 0번");
				int[] a = { 1, 2, 3 };
				int[] b = { 1, 2, 3 };
				System.out.println(a == b);
				System.out.println();
			}
		}
		//////////////////////////////////
		{
			System.out.println("문제 1번");
			int[] a = { 1, 2, 3 };

			for (int x = 3; x > 0; x--) {
				System.out.print(x + " ");
			}
		}
		/////////////////////////////////////
		{
			System.out.println();
			System.out.println();
			System.out.println("문제 2번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] % 2 == 1) {
					count++;
				}
			}
			System.out.println("홀수개수:" + count);
			System.out.println();
		}
		/////////////////////////////////////
		{
			System.out.println("문제 3번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int count = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] > 4) {
					count++;
				}
			}
			System.out.println("4보다 큰수" + count);
		}
		///////////////////////////////
		{
			System.out.println();
			System.out.println("문제 4번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int max = 0;

			for (int x = 0; x < a.length; x++) {
				if (a[x] > max) {
					max = a[x];
				}
			}
			System.out.println("최대값" + max);
			System.out.println();
//			max = Integer.MIN_VALUE;
			//
			// else if(a<b) {
			// System.out.println("둘 중에 큰 수는 "+ b);
			// }else{
			// System.out.println("둘 다 같음" +b);

			// 일단 처음 값을 최대값으로 저장
			// 다음부터 최대값 이었던 것과 비교해서 큰 값을 최대값으로 갱신
			// 반복하다 보면 가장 큰 값이 최대값 변수에 남아있겠다
		}
		///////////////////////////////////////////////
		{
			// 두 번째 큰 수 라는건 첫번째를 제외하고 가장 큰 수
			System.out.println("문제 5번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int max = 0;
			int sc = 0;

			for (int x = 0; x < 7; x++) {
				if (a[x] > max) {
					max = a[x];
				}
			}
			for (int s = 0; s < 7; s++) {
				if (a[s] < max && a[s] > sc) {
					sc = a[s];
				}
			}
			System.out.println("두번째 큰 수" + sc);
			System.out.println();
		}
		////////////////////////////////////
		{
			System.out.println("문제 6번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int[] b = new int[8];

			b[0] = 0;
			for (int x = 1; x < 8; x++) {
				b[x] = a[x - 1];
			}
			for (int s = 0; s < 8; s++) {
				System.out.print(b[s] + " ");
			}
		}
		////////////////////////////////
		{
			// 같은 크기의 배열을 일단 만들고
			// 원본의 맨 마지막 값을 사본의 맨 처음에 넣기
			// 나머지는 사본의 두번째 부터 복사
			System.out.println();
			System.out.println();
			System.out.println("문제 7번");
			int[] a = { 3, 4, 7, 5, 1, 9, 4 };
			int sa = a[6];

			for (int x = 6; x > 0; x--) {
				a[x] = a[x - 1];
			}
			a[0] = sa;
			for (int s = 0; s < 7; s++) {
				System.out.print(a[s] + " ");

			}
		}
		////////////////////////////////
		{
			System.out.println();
			System.out.println("문제 8번");
			String pw = "";

			for (int x = 0; x < 8; x++) {
				int a = (int) (Math.random() * 8);
				pw = pw + x;
				System.out.println("비밀번호" + pw);
				System.out.println();
			}
		}
		/////////////////////////////////////
		{
			
			
			int[] arr8 = new int[8];
			for (int i = 0; i < arr8.length; i++) {
				// 한 자리 숫자 random
				arr8[i] = (int) (Math.random() * 10);
			}
			System.out.println();
			for (int i = 0; i < arr8.length; i++) {
				System.out.print(arr8[i] + " ");
			}
		}
		/////////////////////////
	}
}
