package sec01.frutExam01;

public class DC {
	
	String[] en = {"love", "hate", "devil", "angel"};
	String[] ko = {"���",  "����", "�Ǹ�" , "õ��"};

	//��� �ѱ���� �����ϴ� �޼ҵ�
	//�޼ҵ�� : en2ko
	//�������� : String ���ܾ�
	//����Ÿ�� : String �ѱ���
	String en2ko(String word) {
		for(int x =0; x < en.length; x++) {
			if(en[x].equals(word)) {
				System.out.println("������ ã�� : " + x);
				return ko[x];
			}
		}
		return "���´ܾ�";
	}
}
