package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432);// 대표전화역할
		// 서버소켓으로 포트를 열어준다.
		System.out.println("*****서버수행중*****");
		try {
			while (true) {
				// 대기하다가 크라이언트접속하면 실행된다...일반소켓을 반환해준다.
				// 클라이언트는 일반소켓이랑 대화한다.
				// socket은 개별 상담원
				Socket socket = serverSocket.accept();
				// 8bit Stream을 ->16bit Stream로 변환한다.
				InputStream is = socket.getInputStream();
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir);
				try {
					System.out.println(socket.getInetAddress() + "님의 말 :" + br.readLine());
				} catch (IOException ie) {
					System.out.println(socket.getInetAddress() + "의 데이터를 읽는 문제가 발생..");
				}
				br.close();
				socket.close();
			} // while
		} finally {// 항상 수행
			if (serverSocket != null) // 서버소켓이 생성 안되면 null이므로 굳이 닫을 필요없다.
				serverSocket.close();
			// 수행시키기 위해
		}
	}

	public static void main(String[] args) {
		TestServer ts = new TestServer();
		try {
			ts.go();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
