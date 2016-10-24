package step5;

public class Overr {
	public String race; // 종족
	public String name;// 캐리터이름
	public int age; // 나이
	public int power;// 파워
	public int energy;// 에너지
	public int cnt;

	public Overr() {// 생성자
		System.out.println("Overr 클래스");

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
		// cnt가5증가할떄마다 1살 증가
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}

	public void attack() {
		energy -= 25;
		power += 15;
	}

	public void print() {// 현재 캐릭터 상태값 출력
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}