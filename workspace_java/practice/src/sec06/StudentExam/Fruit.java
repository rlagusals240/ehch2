package sec06.StudentExam;

public class Fruit {

	// �ʵ�
	// �ʵ�� ������, ������ ������ ������ �� �ִ�
	String name; // ��ü��
	String address; // ��ü �ּ�
	String tomato = "�丶��";
	int tomatoprice = 2000;

//	Fruit[] fruits = new Fruit[10]; //����
	int[] arr = new int[10];

	String apple = "���";
	int appleprice = 1000;

	// ������
	// new ���ڸ��� ����Ǵ� �޼ҵ��� ����
	Fruit(String name, String address) {
		System.out.println(fruits[0]);
		this.name = name;
		this.address = address;

	}

	Fruit(String address) {
		this.address = address; // this�� ������ ù �ٿ��� ��밡���ϴ�
//		Fruit(String addr) {//�̷���� �𽺸� ������� �ʾƵ� �ȴ�
//		address = addr
//		this("���¿���",address)
	}
	// �޼ҵ�

	// ����, �۵�

	// ���� ��� ��ü ���
	// �޼ҵ� �� : print
	// �������� : ����
	// ����Ÿ�� : void
	void print() {
//		System.out.println("���"+ ", 1000�� ");
		System.out.println("���"+", 1000��");
		System.out.println(apple + ", appleprice + ��");
		System.out.println("����");
		System.out.println("�ڵ�");

		System.out.println(this.tomato +", "+ tomatoprice + "��");
	}

	// ���� �Ǹ�
	// �޼ҵ�� : ask
	// ���� ���� ����
	// ����Ÿ�� : ����
	int ask(String fruitname) {
		if (this.apple.equals("fruitname")) {
			return appleprice;
//			return 1000;
		} else if (tomato.equals(fruitname)) {
			return tomatoprice;
//			return 2000;
		}else {
			System.out.println("�׷� ���� ����");
			return -1;
		}
	}

	int ask2(String fruitname) {
		for (int x = 0; x < fruits.length; x++) {

			// ���޹��� �̸��� ������ �ִٸ�
			if (this.fruits[x].name.equals(fruitname)) {

				// ������ �������
				return this.fruits[x].price;
			}

			System.out.println("�׷� ���� �����ϴ�");
			return -1;
		}
	}
	
	//���� �߰� ���
	//���� �迭�� ���ο� ����Ŭ������ �߰�
	//�޼ҵ� �̸� : addfruit
	
	//�������� :fruit
	//����Ÿ�� :void
	void addfruit(Fruit fruit) {
		//���� ���� �������� �ϳ� �߰�
		
		//���� �� ���� �ϳ� ū �迭 �����
//		this.fruits
		Fruit[] newFruits = new Fruit[this.fruits.length + 1]
		
		// ���� �� ����
			for(int x = 0; x<this.fruits.length; x++) {
				newFruits[x] = this.fruits[x];
				//������ �߰�
				newFruits[newFruits.length]
				
			}
	}
	
}