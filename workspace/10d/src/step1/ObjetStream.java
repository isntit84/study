package step1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjetStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> data = new ArrayList<Student>();
		data.add(new Student("aaa", 56, 34, 34));
		data.add(new Student("bbb", 56, 24, 37));
		data.add(new Student("bbb", 53, 35, 38));

		String path = "c:\\java-kosta/files/MemData.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oout = new ObjectOutputStream(fos);
		int i;
		for (i = 0; i < data.size(); i++) {
			Student s = data.get(i);
			s.eval_avg();
			oout.writeObject(s);
		}
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream oin = new ObjectInputStream(fis);
		Student s2;
		while ((s2 = (Student) oin.readObject()) != null) {
			System.out.println(s2);
			if (fis.available() == 0) // 매서드는 입력 스트림에 남은 바이트 수를 반환
			{
				break;
			}
		}
		oout.close();
		oin.close();
	}
}