package step6;

import java.util.ArrayList;

public class TestList1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("������");
		list.add("����");
		list.add("������");
		System.out.println(list.size());// 3
		System.out.println(list);// �� list�� �ּҰ��� �ƴ� ���밪�� �����°�?
		// toString()�޼ҵ尡 list���� �������̵� �Ǿ����ִ�. �׷��Ƿ� ��Ұ� ��µȴ�.
		System.out.println(list.get(0));

		System.out.println(list);

		list.remove(2); // �迭�� 2�� �����Ѵ�
		System.out.println(list);
		// for ���� �̿��Ͽ� list�� ��� ��Ҹ� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // for
	}// main

}// class
