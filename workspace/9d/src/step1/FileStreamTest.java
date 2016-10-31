package step1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) throws IOException { //throws IOException나 try catch문 반듯이
		FileInputStream fis = new FileInputStream("c:\\java-kosta/a.txt");
		FileOutputStream fos = new FileOutputStream("c:\\java-kosta/b.txt");
		int buf;
		while ((buf = fis.read()) != -1) {
			System.out.println((char) buf);
			fos.write(buf);
		}
		fis.close();
		fos.close();

	}

}
