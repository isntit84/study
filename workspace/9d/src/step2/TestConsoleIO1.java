package step2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestConsoleIO1 {

	public static void main(String[] args) {
		// 콘솔에서 입력받기 위한 노드 스트림
		InputStream is = System.in;
		// 8bit 스트림을 16bit로 변환하기 위한 프로세스 스트림
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		try {
			// 그만 이라는 문자열을 넣기 전까지는 계속 입력받는 형태로 변경
			while (true) {
				System.out.println("친구 이름을 쓰세요 : ");
				String str = br.readLine();
				if (str.equals("그만")) {
					break;
					
				}
				FileWriter fw = new FileWriter("c:\\java-kosta\\output4.txt", true);// 내용이 누적됨

				System.out.println("읽은 내용 : " + str);


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
