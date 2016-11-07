package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("a", new FriendVO("�տ���", "�¸�", 200));
		map.put("b", new FriendVO("ũ����Ż", "�뷮��", 300));
		map.put("c", new FriendVO("������", "�Ǳ�", 400));
		System.out.println(map);
		// c ��� key�� ���� value�� �̸��� �ּҸ� ���
		FriendVO vo = (FriendVO) map.get("c");
		// return Ÿ���� Object �̹Ƿ� ĳ����
		// Map��get�� �����ϱ����ؼ��� ��üĳ�������� downĳ���� ���־���Ѵ�.
		System.out.println(vo.getName() + " " + vo.getAddress());
		// key�� �ش��ϴ� value�� ������ null
		System.out.println(map.get("c"));// ��ҹ��� ����
		// map�� key�� value�� ����
		// key ã�¹�

		Set set = map.keySet();// set�� return Ÿ���̹Ƿ� SetŸ���� set�� �����Ѵ�.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("****map�� value�鸸 ���***");
		Collection col = map.values();
		// value�� Collection �������̽� Ÿ������ ��ȯ
		// ����ڴ� �߻�޼ҵ常 ȣ���ϸ��
		// Collection�� �ֻ��� �������̽�
		Iterator it2 = col.iterator();
		// map.values().iterator();
		// ���� �Ʒ��� ���� ����->������ ���ٷ� Ǯ�
		// Collection col=map.values();
		// col.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}



/*{a=FriendVO [name=�տ���, address=�¸�, money=200], b=FriendVO [name=ũ����Ż, address=�뷮��, money=300], c=FriendVO [name=������, address=�Ǳ�, money=400]}
������ �Ǳ�
FriendVO [name=������, address=�Ǳ�, money=400]
a
b
c
****map�� value�鸸 ���***
FriendVO [name=�տ���, address=�¸�, money=200]
FriendVO [name=ũ����Ż, address=�뷮��, money=300]
FriendVO [name=������, address=�Ǳ�, money=400]

*/