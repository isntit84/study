package step5yeje;

public class Firee extends Overr {// Overr클래스로 부터 상속

	public Firee(String name) {// 초기화
		this.name = name;// 이름으로 초기화
		race = "Firee";// 종족은 이상해 초기화
		age = 0;// 나이는 0으로 초기화
		power = 50;// 파워는 기본값 150
		energy = 150;// 에너지 기본값 200
		cnt = 0;// cnt 0으로 초기화
		System.out.println("파이리가 만들어졌습니다.");
	}

	public void eat() {// 밥먹는 메서드
		energy += 10;// 에너지 15씩 증가
		cnt++;// cnt는 1증가
		aging();// aging()메서드를 호출
	}

	public void sleep() { // 잠자는 메서드
		energy += 15;// 잠을 자면 5씩증가
		cnt++;// cnt는 1증가
		aging();// aging() 메서드를 호출
	}

	public void exercise() { // 운동하기 메서드
		energy -= 10;// 에너지 소모 10감소
		power += 20;// 파워 10 증가
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

	public void attack() {// 공격하는 메서드
		energy -= 25;// 에너지 15 감소
		power += 15;// 파워 20 증가
	}

}