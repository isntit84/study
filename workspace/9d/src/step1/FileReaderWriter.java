package step1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		java.io.FileInputStream fis = new FileInputStream("c:\\java-kosta/c.txt");
		int buf;
		System.out.println("����Ʈ ������ �о�����");
		while ((buf = fis.read()) != -1) {
			System.out.println((char) buf);
		}
		fis.close();

		FileReader fr = new FileReader("c:\\java-kosta/c.txt");// ����2����Ʈ
		FileWriter fw = new FileWriter("c:\\java-kosta/d.txt");
		System.out.println("\n\n���ڴ���(2����Ʈ����)�� �о�����");
		while ((buf = fr.read()) != -1) {
			System.out.println((char) buf);
			fw.write(buf);
		}
		fr.close();
		fw.close();
	}

}
