package step4;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("아이유");
		set.add("보아");
		set.add("아이유");

		System.out.println(set.size());// 아이유가 중복되므로 2
		System.out.println(set);
		// 원래 내부적에서 toString()이 호출되어 주소값이 나온다.
		// 하지만 toString() 오버라이딩 되어있다.
		// HashSet이 상속 받은 AbstractCollection class에서
		// toString()을 오버라이딩하여 개별 요소들이 출력되도록 했으므로 셋안의 요소들이 출력된다.
		set.add("산다라박");
		System.out.println(set.size());
		set.remove("보아");// 보아 삭제
		System.out.println(set);
		// 포함되어 있는지 true/false 반환
		System.out.println(set.contains("산다라박"));
		set.clear();// 모두 비운다
		System.out.println(set);
	}
}