package sec06.StudentExam;

public class Student {

	String name;
	int age;
	
	
	int age1 (int age) {
		return age;
	}
	
	// �̸����� ���� �޾Ƽ� �ʵ忡 �����ϴ� �޼ҵ�
	// �޼ҵ��: setName
	// ��������: String
	// ����Ÿ��: void
	void setname(String n , int s) {
		name = n;
		age = s;
//		return; //void���� ������
	}
	
	// �̸����� ���� �޾Ƽ� �ʵ忡 �����ϴ� �޼ҵ�
		// �޼ҵ��: GetName
		// ��������: ����
		// ����Ÿ��: String
	String Getname() {
		return name;
	}
	

	//   �̸��� ���̸� �޾Ƽ� ����
		// �޼ҵ��: setInfo
		// ��������: String n, int a
		// ����Ÿ��: void
	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
	// �̸� �ʵ��� ���� �����ִ� �޼ҵ�
//	void setName(String n) {
//		name = n;
////		return; //void���� ������
//	}
//	String[] a = {name, ","+age}
//	return a;
	
	void reup(String ee) {
		name = ee;
		System.out.println("���� �̸���:" + name);
		
	}
		
		void taric(String re, int k) {
			name = re;
			age = k;
			
		}
			
		
	
}
