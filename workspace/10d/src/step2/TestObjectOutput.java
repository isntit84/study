package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {

	public static void main(String[] args) {
		Person p = new Person("백박사", "mc", "성남시 중원구");
		try {// file에 연결되는 8bit 노드 스트림
			FileOutputStream fos = new FileOutputStream("c:\\java-kosta\\iotest\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("객체 직렬화하여 파일에 저장");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
