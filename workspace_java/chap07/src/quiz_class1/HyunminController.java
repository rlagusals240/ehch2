package quiz_class1;

public class HyunminController extends Student {
	

	HyunminController() {
		super("현민");
	}
	
	HyunminService hyunminService = new HyunminService();

	@Override
	String answer(String question) {
		String result = hyunminService.getInfo(question);
		return result;
	}
}
