package step5;

public class Overr {
	public String race; // ����
	public String name;// ĳ�����̸�
	public int age; // ����
	public int power;// �Ŀ�
	public int energy;// ������
	public int cnt;

	public Overr() {// ������
		System.out.println("Overr Ŭ����");

	}

	public void eat() {
		energy += 10;
		cnt++;
		aging();
	}

	public void sleep() {
		energy += 15;
		cnt++;
		aging();
	}

	public void exercise() {
		energy -= 10;
		power += 20;
	}

	public void aging() {
		// cnt��5�����ҋ����� 1�� ����
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}

	public void attack() {
		energy -= 25;
		power += 15;
	}

	public void print() {// ���� ĳ���� ���°� ���
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}