package step3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("aaa");
		data.add("bbb");
		data.add("ccc");
		Iterator<String> i = data.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
// iterator ���� �ڵ�� �÷����� iterator() �޼���� ȣ���� �÷��� ��ҿ� ����� Iterator�� ��ȯ�Ѵ�.
// 14������ while�� �������� hasNext()�� ����ߴµ�, �����Ͱ� �ִ� ������ true�� ��ȯ�ϹǷ�
// �÷��ǿ� ����� �������� ���� ��ŭ�� �ݺ��Ѵ�.
// 15�� ���� next()�� ȣ���� �÷��� ��Ҹ� �ϳ��� �о�� �ֿܼ� ����Ѵ�.