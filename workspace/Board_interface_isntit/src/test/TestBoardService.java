package test;

import java.util.Scanner;

import service.BoardProcess;
import service.BoardService;
import vo.BoardVO;

public class TestBoardService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		String title;
		String content;
		String num;

		boolean flag = true;
		int i = 0;
		BoardProcess service = new BoardProcess(new BoardService());

		while (flag) {
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ��ü���");
			System.out.println("6. ����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				System.out.println("���� �Է��ϼ��� :");
				title = sc.next();
				System.out.println("���� �Է��ϼ��� :");
				content = sc.next();
				System.out.println("��ȣ �Է��ϼ��� :");
				num = sc.next();
				service.insert(new BoardVO(id, title, content, num));
				break;
			case 2:
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				BoardVO m = service.select(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("������ ���̵� �Է��ϼ��� : ");
				id = sc.next();
				System.out.println("������ ������ �Է��ϼ��� :");
				title = sc.next();
				System.out.println("������ ���븦 �Է��ϼ��� :");
				content = sc.next();
				System.out.println("������ ��ȣ�� �Է��ϼ��� :");
				num = sc.next();
				BoardVO m2 = new BoardVO(id, title, content, num);
				service.update(m2);
				break;

			case 4:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				service.delete(id);
				break;

			case 5:
				System.out.println(service.selectAll());
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
