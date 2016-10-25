package step1;

public class ZooService {

	public void enter(Animal a) {
		if (a instanceof Person) {
			// a라는 변수가 Animal 타입을 밑으로 내려 p에 저장하겠다.
			// Person p=(Person)a;
			// p.tickerting();
			((Person) a).tickerting();
		}
		a.eat();
		a.play();
	}
}