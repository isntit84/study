package step4;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("������");
		set.add("����");
		set.add("������");

		System.out.println(set.size());// �������� �ߺ��ǹǷ� 2
		System.out.println(set);
		// ���� ���������� toString()�� ȣ��Ǿ� �ּҰ��� ���´�.
		// ������ toString() �������̵� �Ǿ��ִ�.
		// HashSet�� ��� ���� AbstractCollection class����
		// toString()�� �������̵��Ͽ� ���� ��ҵ��� ��µǵ��� �����Ƿ� �¾��� ��ҵ��� ��µȴ�.
		set.add("��ٶ��");
		System.out.println(set.size());
		set.remove("����");// ���� ����
		System.out.println(set);
		// ���ԵǾ� �ִ��� true/false ��ȯ
		System.out.println(set.contains("��ٶ��"));
		set.clear();// ��� ����
		System.out.println(set);
	}
}