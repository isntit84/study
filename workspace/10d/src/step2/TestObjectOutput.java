package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {

	public static void main(String[] args) {
		Person p = new Person("��ڻ�", "mc", "������ �߿���");
		try {// file�� ����Ǵ� 8bit ��� ��Ʈ��
			FileOutputStream fos = new FileOutputStream("c:\\java-kosta\\iotest\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("��ü ����ȭ�Ͽ� ���Ͽ� ����");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
