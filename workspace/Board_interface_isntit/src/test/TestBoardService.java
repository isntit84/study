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
				System.out.println("제목 입력하세요 :");
				title = sc.next();
				System.out.println("내용 입력하세요 :");
				content = sc.next();
				System.out.println("번호 입력하세요 :");
				num = sc.next();
				service.insert(new BoardVO(id, title, content, num));
				break;
			case 2:
				System.out.println("아이디를 입력하세요 :");
				id = sc.next();
				BoardVO m = service.select(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("수정할 아이디를 입력하세요 : ");
				id = sc.next();
				System.out.println("수정할 제목을 입력하세요 :");
				title = sc.next();
				System.out.println("수정할 내용를 입력하세요 :");
				content = sc.next();
				System.out.println("수정할 번호를 입력하세요 :");
				num = sc.next();
				BoardVO m2 = new BoardVO(id, title, content, num);
				service.update(m2);
				break;

			case 4:
				System.out.println("삭제할 id를 입력하세요 : ");
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
				System.out.println("잘못 입력했어요 다시 입력하세요 ");
			}

		}

	}

}
