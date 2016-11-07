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
			System.out.println("데이터가 로딩되었습니다.");
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList) ois.readObject();
			ois.close();
		}catch(FileNotFoundException e ) {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}

	public void saveData(String fileName) throws IOException {
		
	FileOutputStream fos = new FileOutputStream(fileName);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(list);
	oos.close();
	}
	
	public void insertboard(Member m) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			Member m1 = (Member) list.get(i);
			if (m.equals(m1.getId()))
			flag = true;
			break;
		}
		if (flag == false)
			list.add(m);
		else
			System.out.println("이미 등록된 멤버입니다.");
	}

	public void printboard() {
		System.out.println(list);
	}

	public Member findboard(String id) {
		Member s= null;
		for ( int i = 0; i < list.size(); i++) {
			Member s1 = (Member)list.get(i);
			if(id.equals(s1.getId())){
				s=s1;
			}
		}
		return s;
	}

	public void deleteboard(String id) {
		for(int i = 0; i < list.size(); i++) {
			Member s1 = (Member)list.get(i);
			if(id.equals(s1.getId())){
				list.remove(i);
			}
		}
	}

	public boolean updateboard(Member m) {
		boolean flag = false;
		for ( int i=0; i<list.size(); i++) {
			Member s1 = (Member)list.get(i);
			if(s1.getId().equals(m.getId())){
				list.set(i, m);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
