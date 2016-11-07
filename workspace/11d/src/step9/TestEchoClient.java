package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestEchoClient {
	/**
	 * ������ 1:1 �� ���������� ��ȭ�ϴ� Ŭ���̾�Ʈ ����� �ַܼκ��� �Է¹��� �����͸� ������ �����ϰ� �ٽ� �������� ������ �����͸�
	 * �Է¹޾� �ֿܼ� ����ϴ� ������Ѵ�. 1. Socket(ip,port); 2. System.in - InputStreamReader
	 * - BufferedReader 3. socket.getOutputStream()- PrintWriter 4.
	 * socket.getInputStream() - InputStreamReader - BufferedReader 5. �ֿܼ��� �о
	 * ������ ������ ������ ���� �����͸� �д´�. 6. close()
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
				System.out.println("������ ������ �Է��ϼ���");
				String mess = br.readLine();
				pw.println(mess);
				System.out.println(" " + mess + " ������ ����");
				System.out.println(socket.getInetAddress() + "���� �� : " + br1.readLine());

			}

		} catch (IOException e) {
			System.out.println(" ����");
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
