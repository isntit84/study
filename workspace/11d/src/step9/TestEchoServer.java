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
	 * Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� �ֿܼ� ����ϰ� �ٽ� �� �޼����� Ŭ���̾�Ʈ�� �����ϴ� ���� ����� �� Ŭ���̾�Ʈ�� �Ѹ�����
	 * �����Ѵ�. (��Ʈ : accept() ��ġ��?) ���������� ��ȭ(loop) ---->(hint : stream ������ �������ʿ�
	 * ���� ��ġ��?) 1. ServerSocket���� 2. accept() : Socket 3.
	 * socket.getInputStream() -InputStreamReader -BufferedReader 4.
	 * socket.getOutpuStream() -PrintWriter 5. ���� ������ �ٽ� ������. 6. close
	 */
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public void go() throws IOException {
		try {
			serverSocket = new ServerSocket(5446);
			System.out.println("****��������****");
			// �Ѹ��� Ŭ���̾�Ʈ�� ����ϹǷ� accept() �� �ѹ��� ����Ǿ���Ѵ�.
			socket = serverSocket.accept();
			String ip = socket.getInetAddress().toString();
			// Ŭ���̾�Ʈ�κ��� �Է� ���� ��Ʈ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ�� ture- autoflush
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				try{
				String mess=br.readLine();
				if(mess==null){//�۾������ ���� ��� ��ȯ�Ǵ°� ����!!
					System.out.println("�۾� ����");
					break;
				}
				System.out.println(ip+" �� : "+mess);
				pw.println(mess+" server");
				}catch(SocketException se){//����������
					System.out.println("�۾�����.....");
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
		// br �����߿� ���� �߻�==>socket�� close�ϸ�� pw close�� NullPointException �߻�
		// �׷��Ƿ� null���� ������ Ȯ�� �ؾ���==>������ ���ߴ´� �ݴ´ٰ� �����Ƿ�

		if (pw != null)// ���� �Ǿ����� close()�ϰ� null�̸� ���� �ʴ´�.( NullPointException)
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
