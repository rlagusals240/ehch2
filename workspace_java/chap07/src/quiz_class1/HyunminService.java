package quiz_class1;

public class HyunminService {
	
	HyunminDAO hyunminDAO = new HyunminDAO();
	// 머리속
	String getInfo(String question) {
		String result = hyunminDAO.selectAnswer(question);
		if(result == null) {
		result = "신중히 생각 중";
		}else {
			result = "음 저는요" + result + "이거 가져와";
		}
		return result;
	}
	
	// gpt
	// 노션
	
}
