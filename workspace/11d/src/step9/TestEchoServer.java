package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TestEchoServer {
	// ���������� �ƴ� �ѻ���� ���� ����
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public void go() throws IOException {
		try {
			serverSocket = new ServerSocket(5440);
			System.out.println("***** ���� ���� ***");
			// �Ѹ��� Ŭ���̾�Ʈ�� ����ϹǷ� accept()�� �ѹ��� ����Ǿ���Ѵ�.
			socket = serverSocket.accept();
			String ip = socket.getInetAddress().toString();
			// Ŭ���̾�Ʈ�κ��� �Է¹��� ��Ʈ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ�� ture- autoflush
			pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				try {
					String mess = br.readLine();
					if (mess == null) {// �۾������ ���� ��ӹ�ȯ�Ǵ°� ����
						System.out.println("�۾�����");
						break;
					}
					System.out.println(ip + " �� : " + mess);
					pw.println(mess + " server");
				} catch (SocketException se) {// ����������
					System.out.println("�۾�����...");
					break;
				}
			}

		} finally {
			closeAll();
		}
	}

	public void closeAll() throws IOException {
		// socket ����
		// br ����
		// pw ����
		// br �����߿� ���� �߻�==> socket�� close�ϸ�� pw close�� NullPointException �߻�
		// �׷��Ƿ� null���� ������ Ȯ�� �ؾ��� => ������ ���ߴµ� �ݴ´ٰ� �����Ƿ�

		if (pw != null) // �����Ǿ����� close()�ϰ� null�̸� ���� �ʴ´�.(NullPointException)
			pw.close();
		if (br != null)
			br.close();
		if (serverSocket != null)
			serverSocket.close();
		if (socket != null)
			socket.close();

	}

	public static void main(String[] args) {
		TestEchoServer ts = new TestEchoServer();
	}

}

// close All() Ŭ������ ���� ������ finally���� closeAll �ν��Ͻ� ���