package step1;

import java.util.HashMap;

public class TestMap1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("iu", "아이유");
		map.put("boa", "보아");
		System.out.println(map.size());
		System.out.println(map);// toString() 오버라이딩
		System.out.println(map.get("boa"));// key 로 value를 검색
		map.put("iu", "현아");// 동일한 key를 put하면 key는 중복되지 않고 value가 업데이트

		System.out.println(map);
		// key의 존재유무를 true/false로 리턴
		boolean flag = map.containsKey("iu");
		System.out.println(flag);
		map.remove("iu");
		System.out.println(map);
		// 비어있는지 여부를 true/false로 반환
		// 보통 is계열로 물어보면 true/false로 반환
		System.out.println(map.isEmpty());
		// map.clear();// 비운다
		// System.out.println(map.isEmpty());// true

	}

}

/*2
{boa=보아, iu=아이유}
보아
{boa=보아, iu=현아}
true
{boa=보아}
false
*/