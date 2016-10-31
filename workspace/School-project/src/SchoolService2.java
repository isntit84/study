import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//HashMap �����
public class SchoolService2 {
	private HashMap map = new HashMap();

	/**
	 * ������ ��ȭ��ȣ�� ������ �߰����� �ʴ´�. ��ȭ��ȣ key, Person �迭 ��ü�� value
	 */
	// HashMap�� ����ϴ°ܿ� Ű ���� ����!!
	public void addPerson(Person p) {
		if (map.containsKey(p.getTel())) {
			System.out.println(p.getTel() + "������ ��ȣ�� �����Ͽ� �߰� �Ұ�!");
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
		//������Ʈ�� ��ȣ�� map�� key�� �����Ѵٸ�		
		if (map.containsKey(tel)) {
			//�����ϰ�
			map.remove(tel);
			//�߰��Ѵ�.
			this.addPerson(p);// ��ȭ��ȣ���� Ȯ���� �߰�
			//��ȣ�� ������ �����Ҽ� ����.
		}else{
			System.out.println("update�� �ʿ䰡 ����!!");
		}
		// key�� �ߺ��� �ȵ�!!!���뵤�
	}
}	
