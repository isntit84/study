package step4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGeneric {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("백박사", 200));
		list.add(new Person("황정민", 300));
		list.add(new Person("크리스탈", 400));

		// list.iterator(): money 의 총합
		Iterator<Person> it = list.iterator();
		int total = 0;
		while (it.hasNext()) {
			total += it.next().getMoney();

			System.out.println(total);
			System.out.println("*******");
			// 기존방식으로 for문을 이용해 이름을 출력(캐스팅 필요없다.)
			for (int i = 0; i < list.size(); i++) {
				// Generic으로 선언되어 있어서 캐스팅은 필요없다.
				System.out.println(list.get(i).getName());
			}
			System.out.println("************");
			// jdk 1.5이상에서 지원하는 for 문
			// Person p-> 지역변수 p는 리스트의 개별요소
			// list-> 대상 컬렉션
			// list의 첫번째 요소부터 마지막 요소까지 순차적으로 p에 할당
			for (Person p : list) {
				System.out.println(p.getName());
			}
		}
	}
}
