package step2;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new ProductVO("������", "����", 200));
		list.add(new ProductVO("������", "�Ｚ", 300));
		list.add(new ProductVO("�ؼ���S", "����", 400));
		System.out.println("����Ʈ���� �Ｚ���� ������ ��ǰ�� ���");

		for (int i = 0; i < list.size(); i++) {
			ProductVO pro = (ProductVO) list.get(i);
			if (pro.getMaker().equals("�Ｚ")) {
				System.out.println(pro.getName());
			}
		}

		System.out.println("list�� ��ü ��ǰ ��հ���");

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			sum += vo.getPrice();

		}
		System.out.println(sum / list.size());

		System.out.println("������ �ε����� ���οü ���Ҵ�");
		list.set(0, new ProductVO("����", "sky", 200));
		// 0��° index�� ���ο� ��ü�� �ְڴ�
		System.out.println(list);
		System.out.println("����Ʈ ��ǰ�� �� ���� �����ϴ� ��ǰ����");
		/*for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			if (vo.getName().startsWith("��")) {
				System.out.println(vo.toString());
			}
		}*/

		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			if (vo.getName().startsWith("��")) {
				System.out.println(vo);
			}
		}
	}
}
