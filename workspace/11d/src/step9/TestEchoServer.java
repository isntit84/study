package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TestEchoServer {
	/**
	 * 클라이언트가 보낸 메세지를 입력받아 콘솔에 출력하고 다시 그 메세지를 클라이언트로 전송하는 서버 만들기 단 클라이언트는 한명으로
	 * 한정한다. (힌트 : accept() 위치는?) 지속적으로 대화(loop) ---->(hint : stream 여러번 생성할필요
	 * 없다 위치는?) 1. ServerSocket생성 2. accept() : Socket 3.
	 * socket.getInputStream() -InputStreamReader -BufferedReader 4.
	 * socket.getOutpuStream() -PrintWriter 5. 읽은 내용을 다시 보낸다. 6. close
	 */
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public void go() throws IOException {
		try {
			serverSocket = new ServerSocket(5446);
			System.out.println("****서버실행****");
			// 한명의 클라이언트만 상대하므로 accept() 는 한번만 수행되어야한다.
			socket = serverSocket.accept();
			String ip = socket.getInetAddress().toString();
			// 클라이언트로부터 입력 받을 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 클라이언트에 출력하기 위한 스트림 ture- autoflush
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				try{
				String mess=br.readLine();
				if(mess==null){//작업종료시 널이 계속 반환되는것 방지!!
					System.out.println("작업 종료");
					break;
				}
				System.out.println(ip+" 님 : "+mess);
				pw.println(mess+" server");
				}catch(SocketException se){//비정상종료
					System.out.println("작업종료.....");
					break;
				}
			}
		} finally {
			closeAll();
		}
	}

	public void closeAll() throws IOException {
		// socket 생성
		// br 생성
		// pw 생성
		// br 생성중에 예외 발생==>socket만 close하면됨 pw close시 NullPointException 발생
		// 그러므로 null인지 일일이 확인 해야함==>생성도 안했는다 닫는다고 했으므로

		if (pw != null)// 생성 되었으면 close()하고 null이면 하지 않는다.( NullPointException)
			pw.close();
		if (br != null)
			br.close();
		if (serverSocket != null)
			serverSocket.close();
		if (socket != null)
			socket.close();
	}

	public static void main(String[] args) throws IOException {
		TestEchoServer ts = new TestEchoServer();
		ts.go();		
	}
}
