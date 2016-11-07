package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import vo.Address;

public class BoardService {
	private ArrayList list = new ArrayList();

//	public void loadData(String fileName) throws IOException, ClassNotFoundException {
//
//		try {
//			System.out.println("데이터가 로딩되었습니다.");
//			FileInputStream fis = new FileInputStream(fileName);
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			list = (ArrayList) ois.readObject();
//			ois.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("저장된 데이터가 없습니다.");
//		}
//	}
//
	public void saveData(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
	}

	public void insertboard(Address b) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Address a1 = (Address) list.get(i);
			System.out.println("test3");
			if (b.equals(a1.getName()))
				flag = true;
			System.out.println("test4");
			break;
		}
		if (flag == false)
			list.add(b);
		else
			System.out.println("이미 등록된 이름입니다.");
	}

	public void printboard() {
		System.out.println(list);

	}

	public Address findboard(String name) {
		Address s = null;
		for (int i = 0; i < list.size(); i++) {
			Address s1 = (Address) list.get(i);
			if (name.equals(s1.getName())) {
				s = s1;
			}
		}
		return s;
	}

	public void deleteboard(String name) {
		for (int i = 0; i < list.size(); i++) {
			Address a1 = (Address) list.get(i);
			if (name.equals(a1.getName())) {
				list.remove(i);
			}
		}
	}

	public boolean updateboard(Address adrs) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Address a1 = (Address) list.get(i);
			if (a1.getName().equals(adrs.getName())) {
				list.set(i, adrs);
				flag = true;
				break;
			}
		}
		return flag;
	}
}