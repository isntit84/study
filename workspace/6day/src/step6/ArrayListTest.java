package step6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("aaa");// ������ �߰�
		a1.add("bbb");
		a1.add(1, "ccc");// �߰��� �� ��ȣ
		a1.set(2, "fff");// ����
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(i + "��° ���:" + a1.get(i));// get()������ ��������
		}
		System.out.println("�˻��� ���� �Է��϶�");
		String srh = sc.next();
		int idx = 0;
		if (a1.contains(srh)) // ����Ʈ�� ���Ե� ������ �˻�
		{
			idx = a1.indexOf(srh);// ������ ��ġ��
			System.out.println(idx + "��ġ����" + a1.get(idx) + "�˻�");

		} else {
			System.out.println("ã�� ���� ����");
		}
		System.out.println("������ ���� �Է��϶�");
		srh = sc.next();
		idx = 0;
		if (a1.contains(srh)) {
			idx = a1.indexOf(srh);
			a1.remove(idx);
		} else {
			System.out.println("�ش� ���� ����");
		}
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(i + "��° ���:" + a1.get(i));
		}
		System.out.println("��ü ����");
		a1.removeAll(a1);
		if (a1.isEmpty()) {
			System.out.println("����Ʈ�� �����");
		} else {
			for (int i = 0; i < a1.size(); i++) {
				System.out.println(i + "��° ���:" + a1.get(i));
			}
		}
	}
}
