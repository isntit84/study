package step2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestConsoleIO1 {

	public static void main(String[] args) {
		// �ֿܼ��� �Է¹ޱ� ���� ��� ��Ʈ��
		InputStream is = System.in;
		// 8bit ��Ʈ���� 16bit�� ��ȯ�ϱ� ���� ���μ��� ��Ʈ��
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		try {
			// �׸� �̶�� ���ڿ��� �ֱ� �������� ��� �Է¹޴� ���·� ����
			while (true) {
				System.out.println("ģ�� �̸��� ������ : ");
				String str = br.readLine();
				if (str.equals("�׸�")) {
					break;
					
				}
				FileWriter fw = new FileWriter("c:\\java-kosta\\output4.txt", true);// ������ ������

				System.out.println("���� ���� : " + str);


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
