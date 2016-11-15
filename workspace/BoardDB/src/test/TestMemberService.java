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
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 전체출력");
			System.out.println("6. 종료");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("아이디를 입력하세요 :");
				id = sc.next();
				System.out.println("제목을 입력하세요 :");
				sc.nextLine();// 앞에서 입력한 엔터를 지워주기 위해서
				title = sc.nextLine();
				System.out.println("내용을 입력하세요 :");
				contents = sc.nextLine();
				service.insert(new Board(id, title, contents));
				break;
			case 2:
				System.out.println("아이디를 입력하세요 :");
				id = sc.next();
				Board m = service.find(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("수정할 id를 입력하세요 : ");
				id = sc.next();
				System.out.println("수정할 제목을 입력하세요 :");
				sc.nextLine();// 한글입력받을때
				title = sc.nextLine();
				System.out.println("수정할 내용을 입력하세요 :");
				contents = sc.nextLine();

				Board m2 = new Board(id, title, contents);
				service.update(m2);
				break;

			case 4:
				System.out.println("삭제할 id를 입력하세요 : ");
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
				System.out.println("잘못 입력했어요 다시 입력하세요 ");
			}

		}

	}

}