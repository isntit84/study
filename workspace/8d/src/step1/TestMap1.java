package step1;

import java.util.HashMap;

public class TestMap1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("iu", "������");
		map.put("boa", "����");
		System.out.println(map.size());
		System.out.println(map);// toString() �������̵�
		System.out.println(map.get("boa"));// key �� value�� �˻�
		map.put("iu", "����");// ������ key�� put�ϸ� key�� �ߺ����� �ʰ� value�� ������Ʈ

		System.out.println(map);
		// key�� ���������� true/false�� ����
		boolean flag = map.containsKey("iu");
		System.out.println(flag);
		map.remove("iu");
		System.out.println(map);
		// ����ִ��� ���θ� true/false�� ��ȯ
		// ���� is�迭�� ����� true/false�� ��ȯ
		System.out.println(map.isEmpty());
		// map.clear();// ����
		// System.out.println(map.isEmpty());// true

	}

}

/*2
{boa=����, iu=������}
����
{boa=����, iu=����}
true
{boa=����}
false
*/