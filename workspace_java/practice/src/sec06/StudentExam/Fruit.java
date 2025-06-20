package sec06.StudentExam;

public class Fruit {

	// 필드
	// 필드는 변수고, 변수는 뭔가를 저장할 수 있다
	String name; // 업체명
	String address; // 업체 주소
	String tomato = "토마토";
	int tomatoprice = 2000;

//	Fruit[] fruits = new Fruit[10]; //참고
	int[] arr = new int[10];

	String apple = "사과";
	int appleprice = 1000;

	// 생성자
	// new 하자마자 실행되는 메소드의 일종
	Fruit(String name, String address) {
		System.out.println(fruits[0]);
		this.name = name;
		this.address = address;

	}

	Fruit(String address) {
		this.address = address; // this는 무조건 첫 줄에만 사용가능하다
//		Fruit(String addr) {//이럴경우 디스를 사용하지 않아도 된다
//		address = addr
//		this("오픈예정",address)
	}
	// 메소드

	// 동작, 작동

	// 과일 목록 전체 출력
	// 메소드 명 : print
	// 전달인자 : 없음
	// 리턴타입 : void
	void print() {
//		System.out.println("사과"+ ", 1000원 ");
		System.out.println("사과"+", 1000원");
		System.out.println(apple + ", appleprice + 원");
		System.out.println("수박");
		System.out.println("자두");

		System.out.println(this.tomato +", "+ tomatoprice + "원");
	}

	// 과일 판매
	// 메소드명 : ask
	// 과일 가격 문의
	// 리턴타입 : 가격
	int ask(String fruitname) {
		if (this.apple.equals("fruitname")) {
			return appleprice;
//			return 1000;
		} else if (tomato.equals(fruitname)) {
			return tomatoprice;
//			return 2000;
		}else {
			System.out.println("그런 과일 없음");
			return -1;
		}
	}

	int ask2(String fruitname) {
		for (int x = 0; x < fruits.length; x++) {

			// 전달받은 이름과 같은게 있다면
			if (this.fruits[x].name.equals(fruitname)) {

				// 가격을 돌려줘라
				return this.fruits[x].price;
			}

			System.out.println("그런 과일 없습니다");
			return -1;
		}
	}
	
	//과일 추가 기능
	//기존 배열에 새로운 과일클래스를 추가
	//메소드 이름 : addfruit
	
	//전달인자 :fruit
	//리턴타입 :void
	void addfruit(Fruit fruit) {
		//기존 것의 마지막에 하나 추가
		
		//기존 것 보다 하나 큰 배열 만들기
//		this.fruits
		Fruit[] newFruits = new Fruit[this.fruits.length + 1]
		
		// 기존 것 복사
			for(int x = 0; x<this.fruits.length; x++) {
				newFruits[x] = this.fruits[x];
				//마지막 추가
				newFruits[newFruits.length]
				
			}
	}
	
}