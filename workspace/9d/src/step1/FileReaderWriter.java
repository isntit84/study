package step1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		java.io.FileInputStream fis = new FileInputStream("c:\\java-kosta/c.txt");
		int buf;
		System.out.println("바이트 단위로 읽었을때");
		while ((buf = fis.read()) != -1) {
			System.out.println((char) buf);
		}
		fis.close();

		FileReader fr = new FileReader("c:\\java-kosta/c.txt");// 문자2바이트
		FileWriter fw = new FileWriter("c:\\java-kosta/d.txt");
		System.out.println("\n\n문자단위(2바이트단위)로 읽었을때");
		while ((buf = fr.read()) != -1) {
			System.out.println((char) buf);
			fw.write(buf);
		}
		fr.close();
		fw.close();
	}

}
