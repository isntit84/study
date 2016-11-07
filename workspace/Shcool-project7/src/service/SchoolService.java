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
			throw new DuplicateTelException("������ ��ȣ�� �����Ͽ� �߰��Ҽ� �����ϴ�.");
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
			throw new PersonNotFoundException("ã�� �������� �����ϴ�.");
		p = (Person) list.get(i);
		return p;
	}

	public void deletePerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("������ �������� �����ϴ�.");
		list.remove(i);
	}

	public void updateperson(String tel, Person p) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("������ ����� �����ϴ�.");
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