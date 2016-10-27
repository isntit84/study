package step4;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGeneric {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ڻ�", 200));
		list.add(new Person("Ȳ����", 300));
		list.add(new Person("ũ����Ż", 400));

		// list.iterator(): money �� ����
		Iterator<Person> it = list.iterator();
		int total = 0;
		while (it.hasNext()) {
			total += it.next().getMoney();

			System.out.println(total);
			System.out.println("*******");
			// ����������� for���� �̿��� �̸��� ���(ĳ���� �ʿ����.)
			for (int i = 0; i < list.size(); i++) {
				// Generic���� ����Ǿ� �־ ĳ������ �ʿ����.
				System.out.println(list.get(i).getName());
			}
			System.out.println("************");
			// jdk 1.5�̻󿡼� �����ϴ� for ��
			// Person p-> �������� p�� ����Ʈ�� �������
			// list-> ��� �÷���
			// list�� ù��° ��Һ��� ������ ��ұ��� ���������� p�� �Ҵ�
			for (Person p : list) {
				System.out.println(p.getName());
			}
		}
	}
}
