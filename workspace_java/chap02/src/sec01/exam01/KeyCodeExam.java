package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		System.out.print(3);
		System.out.print(4);

		System.out.println(5);
		System.out.println(6);

		System.out.printf("이름: %s", "감자바");//
		System.out.println();
		System.out.printf("이름: %s, 나이: %s", "감자바", "김");
		System.out.println();

		System.out.printf("이름: %6s, 나이: %04d", "감자바", 25);
		System.out.println();

		///////////////////////////////
		// 입력코드
		int keycode;

		
		//try와
////		/*
//		try {
//			keycode = System.in.read();                                                   
//			System.out.println("keycode: "+ keycode);
//			
//			keycode = System.in.read();
//			System.out.println("keycode: "+ keycode);
//			
//			keycode = System.in.read();
//			System.out.println("keycode: "+ keycode);
//			
//			keycode = System.in.read();                                                   
//			System.out.println("keycode: "+ keycode);
//			
//			keycode = System.in.read();
//			System.out.println("keycode: "+ keycode);
//			
//			keycode = System.in.read();
//			System.out.println("keycode: "+ keycode);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		
       Scanner scan = new Scanner(System.in);
      
       String inputData = scan.nextLine();
       System.out.println("inputData :"+ inputData);
       
       // 엔터쳤을 때 띄어쓰기까지의 모든 글씨
       String inputData2 = scan.nextLine();
       System.out.println("inputData :"+ inputData2);
      
       //엔터쳤을 때의 숫자
       int input = scan.nextInt(10);
       System.out.println("input :"+ input);
       
       //nextint는 숫자로 입력해야함
       System.out.println("x값을 입력하시오 :");
        int input2 = scan.nextInt();
       System.out.println("입력한 x값:" + input2);
<<<<<<< HEAD
       ////////////////////////////////
       
       
			for (int j = 1; j <= 5; j++) {
				for (int i = 1; i <= j; i++) {
				System.out.print("*");
					
		
       
	}
       
=======
       
	}
>>>>>>> origin/main

}


<<<<<<< HEAD
	}
	
}
=======

>>>>>>> origin/main
