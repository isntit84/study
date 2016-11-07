package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList list = new ArrayList();

	public void loadData(String fileName) throws IOException, ClassNotFoundException {
		try {
			System.out.println("�����Ͱ� �ε��Ǿ����ϴ�.");
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		}
	}

	public void saveData(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();

	}

	public void addPerson(Person p) throws DuplicateTelException {
		int i = findIndex(p.getTel());
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("������ ��ȣ�� �����Ͽ� �߰��� �� �����ϴ�.");

		}
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			Person per = (Person) list.get(i);
			System.out.println(list.get(i));
		}
	}

public Person findPerson(String tel)throws PersonNotFoundException{
	Person p= null;
	int i = findIndex(tel);
	if(i==-1)
		throw new PersonNotFoundException("ã�� �������� �����ϴ�.")
		p=(Person)list.get(i);
	return p;
	
}

public void deletePerson(String tel)throws PersonNotFoundException{
	int i = findIndex(tel);
	if (i==-1)
		throw
		new PersonNotFoundException("������ �������� �����ϴ�.")
		list.remove(i);
}

public void updatePerson(String tel, Person p)throws PersonNotFoundException{
	int i=findIndex(tel);
	if(i==-1)
		throw
		new PersonNotFoundException("������ ����� �����ϴ�.")
		list.set(i,p);
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