package step2;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {

		// ������ �����ϰ� �����͸� ���� ���α׷�
		try {// FileWriter���� throw���ش�
				// ���� ��ġ�� ����Ǵ� ��� ��Ʈ������
				// ������ ������ ������ �����ϴ� ��� ����
				// FileWriter fw=new FileWriter("c:\\java-kosta\\output4.txt");
				// //������ ���� �ȵ�
			FileWriter fw = new FileWriter("c:\\java-kosta\\output4.txt", true);// ������ ������
			// ��忡 ���� ���н�(������� ������) ���� ����� �ʿ����.
			// Ʈ������:�۾�����->���⼭�� try�� ��ü�� �ϳ��� �۾�����
			// �ΰ� ����� ���� ���μ��� ��Ʈ���� ����(�Ѷ��ξ� �����͸� ���)
			// ���μ��� ��Ʈ���� ������ �� ���� ��彺Ʈ���� ���ڰ����� �־� �����Ѵ�.(fw �־��ش�.)
			// true: autoflush �ڵ����� �����͸� �ٷ� ���
			// ����PrintWriter pw=new PrintWriter(fw); �ϰ�쿡�� pw.flush(); �� pw.close();�� �ʿ��ϴ�.
			PrintWriter pw = new PrintWriter(fw, true);
			pw.println("ũ����Ż");
			// pw.flush();//�����͸� ���->pw.close(); ���ص� ������ ���´�.//�ǽð� �����͸�
			// ����������Ѵ�.(ex)ä��)

			System.out.println("�����͸� ���");
			pw.close();// �۾��Ϸ�(�׻����־�ߵȴ�. �����ָ� ������ ����� �ȵȴ�. ���� �̵� �� ���� ���� �ȵȴ�.
			// ���ۿ� �ӽ÷� ����ϰ� �ִٰ� ����� �����͸� �ѹ��� �ѷ��� ����ϳ�.
			// ����� pw.flush();�� ����ȴ�.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
