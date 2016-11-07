package step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException { // throws IOEception ó������ ������ ������ ����(unhandled exception type ioexception)
		File file = new File("C:\\java-kosta/fileTest.txt");
		if (!file.exists()) // �Ȱ��� ������ �������� ���� ���
		{
			System.out.println("������ �����մϴ�.");
			file.createNewFile();// ���� ����
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		int ch;
		String path = file.getPath();//��θ� �о���� �޼���
		System.out.println("path:" + path);
		if (file.canWrite()) {
			System.out.println("���� ���� ����");
			bw.write("hello\n");
			bw.flush(); // bw�� ����
		}
		if (file.canRead()) {
			System.out.println("�б� ���� ����");
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
		}
		if (file.canExecute()) { // ������������
			System.out.println("���� ���� ����");
		}
		if (file.isFile()) { // ��������
			System.out.println("���� �Դϴ�.");
		}
		if (file.isHidden()) { // ������������
			System.out.println("���� �Ӽ�");
		}
		long size = file.length();
		System.out.println("����ũ��:" + size);
		System.out.println(path + " ������ �����Ѵ�.");
		file.delete();

		File dir = new File("C:\\java-kosta/files");
		if (!dir.exists()) {
			System.out.println("���丮 ����");
			dir.mkdir();// ���� ����
		}

		String[] fileNames = dir.list(); // ���ϸ��
		System.out.println("���ϸ��");
		for (ch = 0; ch < fileNames.length; ch++) {
			System.out.println(fileNames[ch]);
		}
		br.close();
		bw.close();

	}
}
