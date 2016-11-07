package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestEchoClient {
	/**
	 * 서버와 1:1 로 지속적으로 대화하는 클라이언트 만들기 콘솔로부터 입력받은 데이터를 서버에 전송하고 다시 서버에서 전송한 데이터를
	 * 입력받아 콘솔에 출력하는 기능을한다. 1. Socket(ip,port); 2. System.in - InputStreamReader
	 * - BufferedReader 3. socket.getOutputStream()- PrintWriter 4.
	 * socket.getInputStream() - InputStreamReader - BufferedReader 5. 콘솔에서 읽어서
	 * 서버로 보내고 서버가 보낸 데이터를 읽는다. 6. close()
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public void go() throws UnknownHostException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Socket socket = new Socket("127.0.0.1", 5446);
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		try {

			while (true) {
				System.out.println("전송할 내용을 입력하세여");
				String mess = br.readLine();
				pw.println(mess);
				System.out.println(" " + mess + " 서버에 전송");
				System.out.println(socket.getInetAddress() + "님의 말 : " + br1.readLine());

			}

		} catch (IOException e) {
			System.out.println(" 오류");
		}
		br.close();
		br1.close();
		pw.close();

	}

	public static void main(String[] args) {
		TestEchoClient tc = new TestEchoClient();
		try {
			tc.go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
