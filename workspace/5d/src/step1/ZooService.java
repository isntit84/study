package step1;

public class ZooService {

	public void enter(Animal a) {
		if (a instanceof Person) {
			// a��� ������ Animal Ÿ���� ������ ���� p�� �����ϰڴ�.
			// Person p=(Person)a;
			// p.tickerting();
			((Person) a).tickerting();
		}
		a.eat();
		a.play();
	}
}