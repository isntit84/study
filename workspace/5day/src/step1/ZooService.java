package step1;

public class ZooService {

	public void enter(Animal a) {
		if (a instanceof Person) {
			// ���� incompatible conditional operand types animal and person
			
			// a��� ������ Animal Ÿ���� ������ ���� p�� �����ϰڴ�.
			// Person p=(Person)a;
			// p.tickerting();
			((Person) a).tickerting();
			// ���� multiple markers at this line
			//-line breakpoint:ZooService [line:10]-enter(animal)
			//-cannot cast from animal to person
		}
		a.eat();
		a.play();
	}
}

