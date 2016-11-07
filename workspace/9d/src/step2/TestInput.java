package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {

	public static void main(String[] args) {
		try {
			// 파일에 연결되는 16bit 노드 스트림
			FileReader fr = new FileReader("c:\\java-kosta\\output4.txt");
			// 부가기능(readLine())을 위한 프로세스 스트림
			BufferedReader br = new BufferedReader(fr);
			// system.outprintln(br.readLine());//한줄만 가능
			// readLin()은 더이상 읽을 내용이 없으면 null을 반화
			// while문을 이용해 파일의 모든 내용을 읽어 출력// 지역변수이용
			String str = br.readLine();// 첫라인을 읽는다.
			while (str != null) {// str이null이 아닐때까지 계속 반복한다.
				System.out.println(str);
				str = br.readLine();// 다음라인을 읽고 str에 담는다.
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
