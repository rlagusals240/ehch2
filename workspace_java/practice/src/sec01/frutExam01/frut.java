package sec01.frutExam01;

public class frut {

//
//		�迭�� �õ��ҷ���
//		�ּ���
//	String store="���ϰ���";
//		String frut = "���";
//		int price = 10000;
//		int Inventory = 500;

		String[] fr = { "����", "���", "���", "����" };// �迭��[0]���ν����ؼ� ��ȣ�� ������ �ϴ°�
		String[] pr = { "����", "����", "�ܿ�", "��" };

		String fr02pr(String word) {// word�� �������̰� fr02pr ����¸��ᵵ�ȴ�
			for(int x = 0; x < fr.length; x++) {
				if (pr[x].equals(word)) {
					System.out.println("���� �� ã��" + x);
					return pr[x];
				}
			}
			return "����";
		}
	}


