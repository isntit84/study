import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//HashMap 사용방법
public class SchoolService2 {
	private HashMap map = new HashMap();

	/**
	 * 동일한 전화번호가 있으면 추가하지 않는다. 전화번호 key, Person 계열 객체가 value
	 */
	// HashMap을 사용하는겨우 키 값이 존재!!
	public void addPerson(Person p) {
		if (map.containsKey(p.getTel())) {
			System.out.println(p.getTel() + "동일한 번호가 존재하여 추가 불가!");
		} else {
			map.put(p.getTel(), p);
		}// for
	}// addPerson

	public void printAll() {
		Iterator it = map.values().iterator();
		/*
		 * Collection col = map.values(); Iterator it = col.iterator();
		 */
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}// printAll

	public Person findPerson(String tel) {
		Person p = (Person) map.get(tel);
		return p;
		// retrun (Person)map.get(tel);

	}

	public void deletePerson(String tel) {
		map.remove(tel);
	}

	public void updatePerson(String tel, Person p) {
		//업데이트할 번호가 map에 key로 존재한다면		
		if (map.containsKey(tel)) {
			//삭제하고
			map.remove(tel);
			//추가한다.
			this.addPerson(p);// 전화번호까지 확인후 추가
			//번호가 없으면 수정할수 없다.
		}else{
			System.out.println("update할 필요가 없음!!");
		}
		// key는 중복이 안됨!!!내용덮어씀
	}
}	
