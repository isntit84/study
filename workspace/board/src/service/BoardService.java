package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import vo.Member;

public class BoardService {
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

	public void intsertBoard(Member b) {

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Member pro = (Member) list.get(i);
			// if (b.getTitle().equals(Bo.getTitle())) {
			System.out.println("test3");
			if (b.equals(pro.getId())) // equals�� ��ü�� ��
				flag = true;
			System.out.println("test4");
			break;
			
		}
		if (flag == false)
			list.add(b);
		else
			System.out.println("�̹� ��ϵ� ���̵� �Դϴ�.");
	}

	public void printboard() {
		System.out.println(list);

	}

	public Member findboard(String id) {
		Member pro = null;
		for (int i = 0; i < list.size(); i++) {
			Member pro1 = (Member) list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;

	}

	public void deleteboard(String id) {
		for (int i = 0; i < list.size(); i++) {
			Member pro1 = (Member) list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}

	public boolean updateboard(Member productVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Member pro = (Member) list.get(i);
			if (pro.getId().equals(productVO.getId())) {
				list.set(i, productVO);
				flag = true;
				break;

			}
		}
		return flag;
	}

}