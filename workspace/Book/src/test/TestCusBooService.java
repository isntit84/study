package test;

import java.util.Scanner;

import service.BookService;
import service.CustomerService;
import vo.BookVO;
import vo.Customer;

public class TestCusBooService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;

		int menu2 = 0;

		String id;
		String title;
		String author;
		String publisher;
		int price;

		CustomerService ser = new CustomerService();
		BookService service = new BookService();

		while (flag1) {
			flag2 = true;
			System.out.println("1.�� 2.å");
			int menu1 = sc.nextInt();

			switch (menu1) {
			case 1:
				while (flag2) {
					System.out.println("1.��� 2.�˻� 3.��ü��� 4.���� 5.���� 6.����");
					menu2 = sc.nextInt();
					switch (menu2) {
					case 1:

						System.out.println("�̸��Է� �ϼ��� :");

						String name = sc.next();
						System.out.println("�ּҸ� �Է��ϼ��� :");
						String addr = sc.next();
						System.out.println("��ȭ��ȣ�� �Է��ϼ���  :");
						String tel = sc.next();

						ser.Customerinsert(new Customer(name, addr, tel));
						break;
					case 2:
						System.out.println("�̸��� �Է��ϼ��� :");
						name = sc.next();
						Customer m = ser.findCustomer(name);
						System.out.println(m);
						break;

					case 3:
						ser.printAll();
						break;

					case 4:
						System.out.println("������ �̸��� �Է��ϼ��� : ");
						name = sc.next();
						ser.deleteCus(name);
						break;
					case 5:
						System.out.println("������ �̸��� �Է��ϼ��� : ");
						name = sc.next();
						System.out.println("������ �ּҸ� �Է��ϼ��� :");
						addr = sc.next();
						System.out.println("������ ��ȭ��ȣ�� �Է��ϼ��� :");
						tel = sc.next();
						Customer m2 = new Customer(name, addr, tel);
						ser.Cusupdate(m2);
						break;
					case 6:
						flag2 = false;
						break;

					}
				}

			case 2:
				while (flag2) {
					System.out.println("1.å��� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
					menu2 = sc.nextInt();
					switch (menu2) {
					case 1:
						System.out.println("���̵� �Է��ϼ��� :");
						id = sc.next();
						System.out.println("å�̸��� �Է��ϼ��� :");
						title = sc.next();
						System.out.println("���ڸ� �Է��ϼ��� :");
						author = sc.next();
						System.out.println("���ǻ縦  �Է��ϼ��� :");
						publisher = sc.next();
						System.out.println("������ �Է��ϼ��� :");
						price = sc.nextInt();
						service.addBookVO(new BookVO(id, title, author, publisher, price));
						break;
					case 2:
						System.out.println("���̵� �Է��ϼ��� :");
						id = sc.next();
						BookVO m = service.findBookVO(id);

						System.out.println(m);
						break;

					case 3:
						System.out.println("������ id�� �Է��ϼ��� : ");
						id = sc.next();
						System.out.println("������ å�̸��� �Է��ϼ��� :");
						title = sc.next();
						System.out.println("������ ���ڸ� �Է��ϼ��� :");
						author = sc.next();
						System.out.println("������ ���ǻ縦 �Է��ϼ��� :");
						publisher = sc.next();
						System.out.println("������ ������ �Է��ϼ��� :");
						price = sc.nextInt();
						BookVO m2 = new BookVO(id, title, author, publisher, price);
						service.updateBookVO(m2);
						break;

					case 4:
						System.out.println("������ id�� �Է��ϼ��� : ");
						id = sc.next();
						service.deleteBookVO(id);
						break;

					case 5:
						service.printAll();
						break;

					case 6:
						flag = false;
						break;

					}
				}
				break;
			}
		}
	}

}
