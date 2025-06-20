package sec01.frutExam01;

public class frut {

//
//		배열로 시도할려고
//		주석함
//	String store="과일가게";
//		String frut = "멜론";
//		int price = 10000;
//		int Inventory = 500;

		String[] fr = { "수박", "사과", "멜론", "참외" };// 배열로[0]으로시작해서 번호를 나오게 하는것
		String[] pr = { "여름", "가을", "겨울", "봄" };

		String fr02pr(String word) {// word는 변수명이고 fr02pr 여기는막써도된다
			for(int x = 0; x < fr.length; x++) {
				if (pr[x].equals(word)) {
					System.out.println("같은 거 찾음" + x);
					return pr[x];
				}
			}
			return "없어";
		}
	}


