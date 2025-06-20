package sec06.exam06.getset;

public class Car {

	// �ʵ�� private���� �����ؼ�
	// ���� �а� ���°� ����
	private int speed;
	private boolean stop;
	
	private String color;
	private double gas;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	// �̷��� ����� ���� �Ǵµ�
	public int test();

	{
		return this.speed;
	}

	// getter
	// ���� �ʵ� ���� �����ִ� ���
	// �޼ҵ�� : get + �ʵ��(�빮�ڷ� ����)
	// �������� : ����
	// ����Ÿ�� : �ʵ��� Ÿ��
	public int getSpeed() {
		return this.speed;
	}

	// setter
	// ���� �ʵ� ���� �����ϴ� ���
	// �޼ҵ�� : set + �ʵ��(�빮�ڷ� ����)
	// �������� : �ʵ��� Ÿ��
	// ����Ÿ�� : void
	void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;

		}
	}

	// getter �߿��� boolean Ÿ���� ���
	// get ��� is�� ����ϱ⵵ ��
	// getStop, isStop �Ѵ� ����ε�
	// �Ϻο����� get�� ��� �����ϴ� ��찡 �ִ�
	public boolean isStop() {
		return this.stop;
	}

	public boolean getStop() {
		return this.stop;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}
	
}
