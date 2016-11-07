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
		map.put("address", "서울시 양재동");
		String key = "";
		System.out.println("값을 확인하고 싶은 key를 입력하라");
		key = sc.next();
		if (map.containsKey(key)) {
			System.out.println("key" + key + "의 값: " + map.get(key));
		} else {
			System.out.println("일치되는 key가 없다");
		}
		System.out.println("\nmap의 전체 key 출력");
		Object[] keys = map.keySet().toArray();
		for (i = 0; i < keys.length; i++) {
			System.out.println((String) keys[i]);
		}
		System.out.println("\nmap의 전체 value 출력1");
		Object[] values = map.values().toArray();
		for (i = 0; i < values.length; i++) {
			System.out.println((String) values[i]);

		}
		System.out.println("\nmap의 전체 value 출력2");
		for (i = 0; i < keys.length; i++) {
			System.out.println(keys[i] + ":" + map.get((String) keys[i]));
		}
		sc.close();
	}
}




/*값을 확인하고 싶은 key를 입력하라

a
일치되는 key가 없다

map의 전체 key 출력
address
name
tel

map의 전체 value 출력1
서울시 양재동
aaa
111

map의 전체 value 출력2
address:서울시 양재동
name:aaa
tel:111



*/