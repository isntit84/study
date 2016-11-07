package step1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("학교명", "대한민국학교");
		map.put("학과명", "컴퓨터 공학과");
		map.put("학년", "3학년");

		String key, value;
		System.out.println("iterator를 key에 연결");
		Iterator<String> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			key = keyIterator.next();
			value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("\niterator를 value에 연결");
		Iterator<String> valueIterator = map.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}

}


/*iterator를 key에 연결
학년:3학년
학과명:컴퓨터 공학과
학교명:대한민국학교

iterator를 value에 연결
3학년
컴퓨터 공학과
대한민국학교
*/