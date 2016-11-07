package step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInput {

	public static void main(String[] args) {
		try {
			// 파일에 연결되는 8bit 입력 스트림 생성
			FileInputStream fis = new FileInputStream("c:\\java-kosta\\iotest\\person.obj");
			// 역직렬화하여 객체를 복원하기 위한 프로세스 스트림 생성
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println("역직렬화하여 객체복원" + p);
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {

		}
	}

}