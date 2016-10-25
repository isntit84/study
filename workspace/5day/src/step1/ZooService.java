package step1;

public class ZooService {

	public void enter(Animal a) {
		if (a instanceof Person) {
			// 오류 incompatible conditional operand types animal and person
			
			// a라는 변수가 Animal 타입을 밑으로 내려 p에 저장하겠다.
			// Person p=(Person)a;
			// p.tickerting();
			((Person) a).tickerting();
			// 오류 multiple markers at this line
			//-line breakpoint:ZooService [line:10]-enter(animal)
			//-cannot cast from animal to person
		}
		a.eat();
		a.play();
	}
}

