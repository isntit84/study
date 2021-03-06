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
			System.out.println("데이터가 로딩되었습니다.");
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("저장된 데이터가 없습니다.");
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
			throw new DuplicateTelException("동일한 번호가 존재하여 추가할 수 없습니다.");

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
		throw new PersonNotFoundException("찾는 구성원이 없습니다.")
		p=(Person)list.get(i);
	return p;
	
}

public void deletePerson(String tel)throws PersonNotFoundException{
	int i = findIndex(tel);
	if (i==-1)
		throw
		new PersonNotFoundException("삭제할 구성원이 없습니다.")
		list.remove(i);
}

public void updatePerson(String tel, Person p)throws PersonNotFoundException{
	int i=findIndex(tel);
	if(i==-1)
		throw
		new PersonNotFoundException("수정할 사람이 없습니다.")
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