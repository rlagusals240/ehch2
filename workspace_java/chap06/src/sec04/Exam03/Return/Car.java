package sec04.Exam03.Return;

public class Car {

	int gas;

	void setGas(int g) {
		gas = g;
	}

	//���� �ּ��� �ܴٸ�?
	//gas�� 0�̸� false �׷��� ������ true�� �����ִ� �޼ҵ�
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
			// return �ϴ� ������ �޼ҵ� ����!

			// else �� �ִٴ°� ������ �ϳ��� ����Ǵ� ���� ����
		} else
			System.out.println("gas�� �ֽ��ϴ�");
		return true;

	}
	//return�� �ѹ��� �ϴ� ���
	boolean isLeftgas2() {
		boolean result = false;
		
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");
			result = false;
		}else {
			System.out.println("gas�� �ֽ��ϴ�");
			result = true;
		}
		return result;
	}
	boolean isLeftgas3() {
		boolean result = (gas != 0);
		return result;
		
		
		
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�! �ܷ�: "+ gas);
				gas--;
			}else {
				System.out.println("���� ! �ܷ�: " + gas);
				return;
			}
		}
		
	}
}
