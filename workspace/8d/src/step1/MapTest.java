package step1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "aaa");
		map.put("tel", "111");
		map.put("address", "����� ���絿");
		String key = "";
		System.out.println("���� Ȯ���ϰ� ���� key�� �Է��϶�");
		key = sc.next();
		if (map.containsKey(key)) {
			System.out.println("key" + key + "�� ��: " + map.get(key));
		} else {
			System.out.println("��ġ�Ǵ� key�� ����");
		}
		System.out.println("\nmap�� ��ü key ���");
		Object[] keys = map.keySet().toArray();
		for (i = 0; i < keys.length; i++) {
			System.out.println((String) keys[i]);
		}
		System.out.println("\nmap�� ��ü value ���1");
		Object[] values = map.values().toArray();
		for (i = 0; i < values.length; i++) {
			System.out.println((String) values[i]);

		}
		System.out.println("\nmap�� ��ü value ���2");
		for (i = 0; i < keys.length; i++) {
			System.out.println(keys[i] + ":" + map.get((String) keys[i]));
		}
		sc.close();
	}
}




/*���� Ȯ���ϰ� ���� key�� �Է��϶�

a
��ġ�Ǵ� key�� ����

map�� ��ü key ���
address
name
tel

map�� ��ü value ���1
����� ���絿
aaa
111

map�� ��ü value ���2
address:����� ���絿
name:aaa
tel:111



*/