package step5yeje;

public class Picachu extends Overr {
	public Picachu(String Picachu) {
		this.name = name;
		race = "Picachu";
		age = 0;
		power = 50;
		energy = 150;
		cnt = 0;
		System.out.println("��ī�� ����������ϴ�.");
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
	
	public void playwith() { // ����ֱ� �޼���
		energy += 10;// ������ 10 ����
		power += 10;// �Ŀ� 10 ����
		
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
