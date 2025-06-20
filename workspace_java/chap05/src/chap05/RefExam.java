package chap05;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = a;
		System.out.println(a + ", " + b);

		b = 12;
		System.out.println(a + ", " + b);

		String c = "������";
		// = �� �������� �������� ���� ����ȴ�
		// "������"�� ��heap ������ ����ִ� ������ �Ҵ�(����)
		// ����stack ������ ���� c�� ��� �� ������ ����
		System.out.println("c : " + c);

		System.out.println(a == b);
		// == �Ǵ� != �� ������ stack�� ���� ���Ѵ�

		String d = new String("������");
		System.out.println(c == d);
		System.out.println(c.equals(d));
		// String �� �񱳴� ������ equals()�� ����Ѵ�

		String e = d;
		// d�� �������ִ� �̸��� e�� �־��
		System.out.println(e == d);
//		e = "���";
//				System.out.println("d : "+ d); �迭�Ҷ� �Ѵ�
		String f = "��"+"����";
		System.out.println("c == f : "+(c == f));
		
//		a = null;
		//�⺻ Ÿ�Կ��� null�� ���� �� ����
		
		//null�� �����ϴ� �ּҰ� ���� ����
		String g = "�޸�";
				System.out.println("g == null :"+ (g == null));
		System.out.println("g == null:"+ (g != null));
		
		String h = ""; //null�� �ƴմϴ�
		System.out.println("h != null : " + (h != null));
		
		g = null;
		System.out.println("g == null: "+(g == null));
		System.out.println("g + \"abc\": "+ (g + "abc"));
			System.out.println( h.equals(g));
		
		if(g != null) {
			System.out.println(g.equals(h));
		}
	}
}
