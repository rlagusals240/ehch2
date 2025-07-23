package sec01.exam;

public class Parent {

String name = "Parent의 name";
	
	String getName(){
		System.out.println("Parent의 getName실행");
		return this.name;
	
	}
	Parent(int a){
		System.out.println("parent 생성자");
	}
}

