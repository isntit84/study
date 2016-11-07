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
		System.out.println("데이터가 저장되었습니다.");
	}

	// 추가
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
			list.add(bookVO);// 동일한 북목록 존재
		} else {
			System.out.println("동일한 책이 존재합니다");
		}
	}

	public void printAll() {
		System.out.println(list);

	}

	// id-> title

	// 검색
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
