package test;

import java.util.Scanner;

import service.BookService;
import vo.BookVO;


public class TestBookService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id;
		String author;
		String title;
		String publisher;
		int price;
		
		boolean flag = true;
		int i = 0;
		BookService service = new BookService();
		
		while(flag){
			System.out.println("1.��� 2.�˻� 3.���� 4.���� 5. ��ü��� 6. ����");
			i=sc.nextInt();
			switch(i){
			case 1:
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				System.out.println("���ڸ� �Է��ϼ��� :");
				author = sc.next();
				System.out.println("������ �Է��ϼ��� :");
				title = sc.next();
				System.out.println("�Ǹ��ڸ� �Է��ϼ��� :");
				publisher = sc.next();
				System.out.println("������ �Է��ϼ��� :");
				price = sc.nextInt();
				service.addBookVO(new BookVO(id, author, title, publisher, price));
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
				System.out.println("������ ���ڸ� �Է��ϼ��� :");
				author = sc.next();
				System.out.println("������ ������ �Է��ϼ��� :");
				title = sc.next();
				System.out.println("������ �Ǹ��ڸ� �Է��ϼ��� :");
				publisher = sc.next();
				System.out.println("������ ������ �Է��ϼ��� :");
				price = sc.nextInt();
				BookVO m2 = new BookVO(id, author, title, publisher, price);
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

			default:
				System.out.println("�߸� �Է��߾�� �ٽ� �Է��ϼ��� ");
			}

		}

	}

}
