package sec02.exam01.driver;

import java.util.ArrayList;
import java.util.HashMap;

public class DriverExam {

	public static void main(String[] args) {
		
		Tico tico = new Tico();
		
		Driver driver = new Driver();
		
		driver.driveTico(tico);

		Porsche p = new Porsche();
		Car c1 = (Car) p;
		driver.drive(c1);
		
		BmwM4 b = new BmwM4();
		driver.drive( (Car) b );
		
		driver.drive( (Car) new Tico() );
		
		ArrayList list = new ArrayList();
		list.add(driver);
		Driver d = (Driver)list.get(0);
		
		 HashMap map = new HashMap();
		 map.put("key","value");            // 넣는법
		 String k = (String)map.get("key"); // 꺼내는 법
		 //////////////////////////////////////////
		 System.out.println("for문 배우기");
		 {
			 
			 for(int a=2; a<=9; a++) {
				 for(int c=1; c<=9; c++) {
					 System.out.println(a + " x " + c + " = " + (a*c));
				 }
				 
			 }
		 }
		 //////////////////////////////////////
		 System.out.println("구구단 2단 찍기");
		 int dan = 2;
		 for(int a=1; a<=9; a++) {
			 System.out.println(dan + " x " + a + " = " + (dan*a));
		 }
	}

}
