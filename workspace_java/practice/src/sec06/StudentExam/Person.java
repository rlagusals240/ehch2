package sec06.StudentExam;

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;

	//final
	//값이 할당된 경우 변경할 수 없게 막아줌
	
	Person(){
		//final의 값이 없던 경우
		//생성자에게 딱 한번 할당할 수 있다
		//생성자 전달인자로 받아서 할당하고 
		this.ssn = "123";
		this.name = "이름";
//		this.nation = "다른나라"; //바뀌지 못하게 막음
		
	this.name = "이름2";
//	this.nation = "주민번호2";
	}
	
	void test() {
//		this.ssn = "주민번호";
	}
}
