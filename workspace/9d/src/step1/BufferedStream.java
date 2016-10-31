package step1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\java-kosta/a.txt");
		BufferedInputStream bin = new BufferedInputStream(fis);// 보조스트링(수레) 완충

		FileOutputStream fos = new FileOutputStream("c:\\java-kosta/b.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fos);

		int buf;
		while ((buf = bin.read()) != -1) {
			System.out.println((char) buf);
			bout.write(buf);
		}
		bin.close();
		bout.close();

		FileReader fr = new FileReader("c:\\java-kosta/c.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("c:\\java-kosta/d.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("\n\n문자단위(2바이트 단위)로 읽었을때");
		while ((buf = br.read()) != -1) {
			//System.out.println((char) buf); //ln 줄바꿈
			System.out.print((char) buf);
			
			
			bout.write(buf);
		}
		br.close();
		bw.close();

	}
}
