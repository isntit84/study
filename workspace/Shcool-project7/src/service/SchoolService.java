package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {
	private ArrayList list = new ArrayList();

	public void addPerson(Person p) throws DuplicateTelException {
		int i = findIndex(p.getTel());
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("동일한 번호가 존재하여 추가할수 없습니다.");
		}
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			System.out.println(list.get(i));
		}
	}

	public Person findPerson(String tel) throws PersonNotFoundException {
		Person p = null;
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("찾는 구성원이 없습니다.");
		p = (Person) list.get(i);
		return p;
	}

	public void deletePerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("삭제할 구서원이 없습니다.");
		list.remove(i);
	}

	public void updateperson(String tel, Person p) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("수정할 사람이 없습니다.");
		list.set(i, p);
	}

	private int findIndex(String tel) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			if (per.getTel().equals(tel)) {
				index = i;
				break;

			}
		}
		return index;
	}
}