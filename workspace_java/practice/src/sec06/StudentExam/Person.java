package sec06.StudentExam;

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;

	//final
	//���� �Ҵ�� ��� ������ �� ���� ������
	
	Person(){
		//final�� ���� ���� ���
		//�����ڿ��� �� �ѹ� �Ҵ��� �� �ִ�
		//������ �������ڷ� �޾Ƽ� �Ҵ��ϰ� 
		this.ssn = "123";
		this.name = "�̸�";
//		this.nation = "�ٸ�����"; //�ٲ��� ���ϰ� ����
		
	this.name = "�̸�2";
//	this.nation = "�ֹι�ȣ2";
	}
	
	void test() {
//		this.ssn = "�ֹι�ȣ";
	}
}
