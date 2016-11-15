package test;

import java.util.Scanner;

import service.BoardService;
import vo.Board;

public class TestMemberService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id;
		String title;
		String contents;

		boolean flag = true;
		int i = 0;
		// BoardDAO service = new BoardDAO();
		BoardService service = new BoardService();

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
				System.out.println("������ �Է��ϼ��� :");
				sc.nextLine();// �տ��� �Է��� ���͸� �����ֱ� ���ؼ�
				title = sc.nextLine();
				System.out.println("������ �Է��ϼ��� :");
				contents = sc.nextLine();
				service.insert(new Board(id, title, contents));
				break;
			case 2:
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				Board m = service.find(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				System.out.println("������ ������ �Է��ϼ��� :");
				sc.nextLine();// �ѱ��Է¹�����
				title = sc.nextLine();
				System.out.println("������ ������ �Է��ϼ��� :");
				contents = sc.nextLine();

				Board m2 = new Board(id, title, contents);
				service.update(m2);
				break;

			case 4:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				service.delete(id);
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