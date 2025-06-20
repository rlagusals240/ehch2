package sec06.StudentExam;

public class Student {

	String name;
	int age;
	
	
	int age1 (int age) {
		return age;
	}
	
	// 이름값을 전달 받아서 필드에 저장하는 메소드
	// 메소드명: setName
	// 전달인자: String
	// 리턴타입: void
	void setname(String n , int s) {
		name = n;
		age = s;
//		return; //void때메 생략됨
	}
	
	// 이름값을 전달 받아서 필드에 저장하는 메소드
		// 메소드명: GetName
		// 전달인자: 없음
		// 리턴타입: String
	String Getname() {
		return name;
	}
	

	//   이름과 나이를 받아서 저장
		// 메소드명: setInfo
		// 전달인자: String n, int a
		// 리턴타입: void
	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
	// 이름 필드의 값을 돌려주는 메소드
//	void setName(String n) {
//		name = n;
////		return; //void때메 생략됨
//	}
//	String[] a = {name, ","+age}
//	return a;
	
	void reup(String ee) {
		name = ee;
		System.out.println("너의 이름은:" + name);
		
	}
		
		void taric(String re, int k) {
			name = re;
			age = k;
			
		}
			
		
	
}
