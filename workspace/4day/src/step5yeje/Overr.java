package step5yeje;

public class Overr {
	public String race;
	public String name;
	public int age;
	public int power;
	public int energy;
	public int cnt;

	public Overr() {
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

	public void playwith() { // ����ֱ� �޼���
		energy += 10;// ������ 10 ����
		power += 10;// �Ŀ� 10 ����
	}

	public void aging() {
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}

	public void attack() {
		energy -= 25;
		power += 15;
	}

	public void print() {
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}