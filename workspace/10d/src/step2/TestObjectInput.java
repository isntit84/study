package step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInput {

	public static void main(String[] args) {
		try {
			// ���Ͽ� ����Ǵ� 8bit �Է� ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("c:\\java-kosta\\iotest\\person.obj");
			// ������ȭ�Ͽ� ��ü�� �����ϱ� ���� ���μ��� ��Ʈ�� ����
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println("������ȭ�Ͽ� ��ü����" + p);
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {

		}
	}

}