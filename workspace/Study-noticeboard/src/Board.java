import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	public String title;

	public void write() {
		ArrayList<String> v = new ArrayList<String>();
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		// Calendar c = Calendar.getInstance();

		FileWriter fos = null;

		System.out.println("����");
		// System.out.println("1.���� 2. ������");

		title = sc.next();
		// int a = sc.nextInt();
		// int y = 0, m = 0, dd = 0;
		//
		// if (a == 1) {
		//
		// {
		// title = sc.next();
		// y = c.get(Calendar.YEAR);
		// m = c.get(Calendar.MONTH) + 1;// �� 0���� ������ �ϱ⶧���� +1�� ���־���.
		// dd = c.get(Calendar.DATE);
		// date = y + "��" + m + "��" + dd + "��";
		// System.out.println(title);
		// }
		//
		// date = y + "��" + m + "��" + dd + "��";
		//
		// System.out.println(title);
		// } else {
		//// System.out.println("��¥�� �Է��϶�. ��)0��0��0��");
		// System.out.println("������ �Է�");
		// title = sc.next();
		// }
		//
		// v.add(title);
		System.out.println("����");
		service.loadData(fileName);
		while (true) {
			String x = null;
			x = sc.next();
			if (x.equals("��"))
				System.out.println("�� �Խù��� ����Ǿ����ϴ�.");
			break;
			// v.add(x);
		}
		File f = new File("noticeboard");
		if (!f.exists())
			f.mkdir();
		try {
			fos = new FileWriter("././noticeboard/" + title + ".txt");
			for (int i = 0; i < v.size(); i++) {
				fos.write("\n"); // �Է°��� �޴´�
				fos.write(v.get(i));
			}
			fos.close();
		} catch (Exception e)

		{
			System.out.println(e);
		}
	} // �߰�ȣ"}"�� ������ ������ ���� �޼��� -> syntax error, insert "}" to complete block

	public void printAll() {
		File f = new File("noticeboard");
		File[] fs = f.listFiles();
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Խ��� ���");
		for (int i = 0; i < fs.length; i++) {
			System.out.print(fs[i].getName()+"\n");
		}
		System.out.println("���ϴ� �Խù��� �Է��Ͻÿ�");
		title = sc.next();
		try {
			fr = new FileReader("././noticeboard/" + title + ".txt");
			int i;

			while ((i = fr.read()) != -1) {
				System.out.println((char) i+"/n");
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}