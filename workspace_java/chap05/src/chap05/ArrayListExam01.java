package chap05;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		

		//�޸�ī�� 1ȣ��
		String[] menu = new String[2];
		menu[0] = "�ڹ�Ĩ����Ǫġ��";
		menu[1] = "������";
		
		//�޸�ī�� 2ȣ��
		//���� ����
		String[] menu2 = menu;
		
		//2ȣ������ ����󶼸� �߰�
		//���� ����
		menu2 = new String[3];
		menu[0] = menu[0];
		menu[1] = menu[1];
		menu[2] = "�����";
		
		//ArrayList ����
		ArrayList list = new ArrayList();
		
		// �߰�
		list.add(1);//�迭
		list.add(false);
		list.add("����");
		
		// ���
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		System.out.println( list.size() );
		
		System.out.println(list);
		
		for(int i = 0; i< list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("ù ��°");
		list2.add("�ι�°");
		for(String data : list2) {
			System.out.println(data);
		}
	}
	
	//�迭�� ���� ����ϱ�
	//Arrays.sort(List)

}
