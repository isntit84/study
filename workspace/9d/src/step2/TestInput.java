package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {

	public static void main(String[] args) {
		try {
			// ���Ͽ� ����Ǵ� 16bit ��� ��Ʈ��
			FileReader fr = new FileReader("c:\\java-kosta\\output4.txt");
			// �ΰ����(readLine())�� ���� ���μ��� ��Ʈ��
			BufferedReader br = new BufferedReader(fr);
			// system.outprintln(br.readLine());//���ٸ� ����
			// readLin()�� ���̻� ���� ������ ������ null�� ��ȭ
			// while���� �̿��� ������ ��� ������ �о� ���// ���������̿�
			String str = br.readLine();// ù������ �д´�.
			while (str != null) {// str��null�� �ƴҶ����� ��� �ݺ��Ѵ�.
				System.out.println(str);
				str = br.readLine();// ���������� �а� str�� ��´�.
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
