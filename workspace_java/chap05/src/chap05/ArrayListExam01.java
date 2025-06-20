package chap05;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		

		//휴먼카페 1호점
		String[] menu = new String[2];
		menu[0] = "자바칩프라푸치노";
		menu[1] = "말차라떼";
		
		//휴먼카페 2호점
		//얕은 복사
		String[] menu2 = menu;
		
		//2호점에서 딸기라떼를 추가
		//깊은 복사
		menu2 = new String[3];
		menu[0] = menu[0];
		menu[1] = menu[1];
		menu[2] = "딸기라떼";
		
		//ArrayList 사용법
		ArrayList list = new ArrayList();
		
		// 추가
		list.add(1);//배열
		list.add(false);
		list.add("문자");
		
		// 사용
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		System.out.println( list.size() );
		
		System.out.println(list);
		
		for(int i = 0; i< list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("첫 번째");
		list2.add("두번째");
		for(String data : list2) {
			System.out.println(data);
		}
	}
	
	//배열을 쉽게 사용하기
	//Arrays.sort(List)

}
