package step5yeje;

public class Picachu extends Overr {
	public Picachu(String Picachu) {
		this.name = name;
		race = "Picachu";
		age = 0;
		power = 50;
		energy = 150;
		cnt = 0;
		System.out.println("피카츄가 만들어졌습니다.");
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
	
	public void playwith() { // 놀아주기 메서드
		energy += 10;// 에너지 10 증가
		power += 10;// 파워 10 증가
		
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
