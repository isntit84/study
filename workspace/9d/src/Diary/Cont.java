package Diary;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Cont {
	public String date;

	public void write() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> v = new ArrayList<String>();

		Calendar c = Calendar.getInstance();

		FileWriter fos = null;

		System.out.println("1.���� 2. ������");
		int a = sc.nextInt();
		int y = 0, m = 0, dd = 0;
		if (a == 1) {

			{
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MONTH) + 1;// �� 0���� ������ �ϱ⶧���� +1�� ���־���.
				dd = c.get(Calendar.DATE);
				date = y + "��" + m + "��" + dd + "��";
				System.out.println(date);
			}

			date = y + "��" + m + "��" + dd + "��";

			System.out.println(date);
		} else {
			System.out.println("��¥�� �Է��϶�. ��)0��0��0��");
			date = sc.next();
		}

		v.add(date);
		System.out.println("����");

		while (true) {
			String x = null;
			x = sc.next();
			if (x.equals("��"))
				break;
			v.add(x);
		}
		File f = new File("MyDiary");
		if (!f.exists())
			f.mkdir();
		try {
			fos = new FileWriter("././MyDiary/" + date + ".txt");
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

	public void read() {
		File f = new File("MyDiary");
		File[] fs = f.listFiles();
		String date;
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ϱ���");
		for (int i = 0; i < fs.length; i++) {
			System.out.print(fs[i].getName());
		}
		System.out.println("���ϴ� ��¥�� �Է��Ͻÿ�");
		date = sc.next();
		try {
			fr = new FileReader("././MyDiary/" + date + ".txt");
			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}