package sec01.frutExam01;

public class DC {
	
	String[] en = {"love", "hate", "devil", "angel"};
	String[] ko = {"사랑",  "증오", "악마" , "천사"};

	//영어를 한국어로 번역하는 메소드
	//메소드명 : en2ko
	//전달인자 : String 영단어
	//리턴타입 : String 한국어
	String en2ko(String word) {
		for(int x =0; x < en.length; x++) {
			if(en[x].equals(word)) {
				System.out.println("같은거 찾음 : " + x);
				return ko[x];
			}
		}
		return "없는단어";
	}
}
