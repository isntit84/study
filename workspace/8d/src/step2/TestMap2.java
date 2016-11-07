package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("a", new FriendVO("손연재", "태릉", 200));
		map.put("b", new FriendVO("크리스탈", "노량진", 300));
		map.put("c", new FriendVO("소지섭", "판교", 400));
		System.out.println(map);
		// c 라는 key를 가진 value의 이름과 주소를 출력
		FriendVO vo = (FriendVO) map.get("c");
		// return 타입이 Object 이므로 캐스팅
		// Map의get에 접근하기위해서는 객체캐스팅으로 down캐스팅 해주어야한다.
		System.out.println(vo.getName() + " " + vo.getAddress());
		// key에 해당하는 value가 없으면 null
		System.out.println(map.get("c"));// 대소문자 구분
		// map은 key와 value로 구성
		// key 찾는법

		Set set = map.keySet();// set이 return 타입이므로 Set타입의 set을 설정한다.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("****map의 value들만 출력***");
		Collection col = map.values();
		// value가 Collection 인터페이스 타입으로 반환
		// 사용자는 추상메소드만 호출하면됨
		// Collection은 최상위 인터페이스
		Iterator it2 = col.iterator();
		// map.values().iterator();
		// 위와 아래는 동일 내용->한줄을 두줄로 풀어씀
		// Collection col=map.values();
		// col.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}



/*{a=FriendVO [name=손연재, address=태릉, money=200], b=FriendVO [name=크리스탈, address=노량진, money=300], c=FriendVO [name=소지섭, address=판교, money=400]}
소지섭 판교
FriendVO [name=소지섭, address=판교, money=400]
a
b
c
****map의 value들만 출력***
FriendVO [name=손연재, address=태릉, money=200]
FriendVO [name=크리스탈, address=노량진, money=300]
FriendVO [name=소지섭, address=판교, money=400]

*/