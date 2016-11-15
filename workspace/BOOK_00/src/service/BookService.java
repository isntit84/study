package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import vo.Member;

public class BookService {

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
		System.out.println("�����Ͱ� ����Ǿ����ϴ�.");
	}

	// �߰�
	public void insert(Member bookVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Member Bo = (Member) list.get(i);
			if (bookVO.getTitle().equals(Bo.getTitle())) {
				// if (b.equals(pro.getId())
				flag = true;
			}
		}
		if (flag == false) {
			list.add(bookVO);// ������ �ϸ�� ����
		} else {
			System.out.println("������ å�� �����մϴ�");
		}
	}

	public void printAll() {
		System.out.println(list);

	}

	// id-> title

	// �˻�
	public Member findBookVO(String id) {
		Member pro = null;
		for (int i = 0; i < list.size(); i++) {
			Member pro1 = (Member) list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;

	}

	public void deleteBookVO(String id) {
		for (int i = 0; i < list.size(); i++) {
			Member pro1 = (Member) list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}

	public boolean updateBookVO(Member bookVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Member Mem = (Member) list.get(i);
			if (Mem.getId().equals(bookVO.getId())) {
				list.set(i, bookVO);
				flag = true;
				break;
			}
		}
		return flag;
	}

}
