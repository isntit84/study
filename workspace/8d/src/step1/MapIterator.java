package step1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�б���", "���ѹα��б�");
		map.put("�а���", "��ǻ�� ���а�");
		map.put("�г�", "3�г�");

		String key, value;
		System.out.println("iterator�� key�� ����");
		Iterator<String> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			key = keyIterator.next();
			value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("\niterator�� value�� ����");
		Iterator<String> valueIterator = map.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}

}


/*iterator�� key�� ����
�г�:3�г�
�а���:��ǻ�� ���а�
�б���:���ѹα��б�

iterator�� value�� ����
3�г�
��ǻ�� ���а�
���ѹα��б�
*/