package step5;

public class Lee extends Overr {

	public Lee(String name) {
		this.name = name;
		race = "Lee";
		age = 0;
		power = 50;
		energy = 150;
		cnt = 0;
		System.out.println("�̻��ذ� ����������ϴ�.");
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