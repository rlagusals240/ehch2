package sec05.exam05;

public class ConstantExam {

	public static void main(String[] args) {

		int result = loginCheck("admin", "1234"){
		

		if (result == Constant.LOGIN_SUCCESS) {
			System.out.println("�α��� ���� >>>>>������������ �̵�");
		}
		}
	}

	static int LoginCheck(String id, String pw) {

		if ("admin".equals(id) && "1234".equals(pw)) {
			return Constant.LOGIN_SUCCESS;

		}
	}
}
