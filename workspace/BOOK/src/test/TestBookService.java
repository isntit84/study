package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BookService;
import vo.Member;

public class TestBookService {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "book.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("�� ���");

		// Scanner sc = new Scanner(System.in);00
		String id;
		String title;
		String author;
		String publisher;
		String price;
		boolean flag = true;
		String i;

		BookService service = new BookService();
		service.loadData(fileName);

		while (flag) {
			System.out.println("1.��� :");
			System.out.println("2.�˻� :");
			System.out.println("3.���� :");
			System.out.println("4.���� :");
			System.out.println("5.��ü��� :");
			System.out.println("6.���� :");

			// i = sc.nextInt();
			i= br.readLine();

			switch (i) {
			case "1":// ���
				System.out.println("id�� �Է��ϼ���");
				id = br.readLine();
				System.out.println("������ �Է��ϼ���");
				title = br.readLine();
				System.out.println("�۰��� �Է��ϼ���");
				author = br.readLine();
				System.out.println("���ǻ縦 �Է��ϼ���");
				publisher = br.readLine();
				System.out.println("���ݸ� �Է��ϼ���");
				price = br.readLine();
				service.insert(new Member(id, title, author, publisher, price));
				break;

			case "2":// �˻�
				System.out.println("������ �Է��ϼ��� :");
				id = br.readLine();
				Member m = service.findBookVO(id);
				System.out.println(m);
				break;

			case "3":// ����
				System.out.println("������ id�� �Է��ϼ���: ");
				id = br.readLine();
				System.out.println("������ ������ �Է��ϼ���: ");
				title = br.readLine();
				System.out.println("������ �۰��� �Է��ϼ���: ");
				author = br.readLine();
				System.out.println("������ ���ǻ縦 �Է��ϼ���: ");
				publisher = br.readLine();
				System.out.println("������ ���ݸ� �Է��ϼ���: ");
				 price = br.readLine();
				Member m2 = new Member(id, title, author, publisher, price);
				service.updateBookVO(m2);
				break;

			case "4":// ����
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = br.readLine();
				service.deleteBookVO(id);
				break;

			case "5":// ��ü���
				service.printAll();
				break;

			case "6":// ����
				flag = false;
				service.saveData(fileName);
				break;

			default:
				System.out.println("�߸� �Է��߾�� �ٽ� �Է��ϼ���");
			}
		}
	}
}