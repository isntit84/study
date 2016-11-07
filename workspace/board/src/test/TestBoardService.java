package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BoardService;
import vo.EmpMember;
import vo.Member;
import vo.StuMember;
import vo.TeachMember;

public class TestBoardService {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "board.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("간단 게시판 시작");

		String id;
		String Contents;

		String dept;
		String stuId;
		String subject;

		boolean flag = true;
		String i = "";
		String y = "";
		Member p = null;

		BoardService service = new BoardService();
		service.loadData(fileName);
		while (flag) {
			System.out.println("1.글입력 2.검색 3.수정 4.삭제 5.글내용보기 6.종료");
			// i=sc.next();
			i = br.readLine();
			switch (i) {

			case "1":
				System.out.println("아이디를 입력");
				id = br.readLine();
				System.out.println("내용를 입력");
				Contents = br.readLine();
				
				System.out.println("1.교직원");
				System.out.println("2.학생");
				System.out.println("3.교사");
				y = br.readLine();
				switch (y) {
				case "1":
					System.out.println("부서를 입력");
					dept = br.readLine();
					p = new EmpMember(id, Contents, dept);
					break;

				case "2":
					System.out.println("학번을 입력");
					stuId = br.readLine();
					p = new StuMember(id, Contents, stuId);
					break;

				case "3":
					System.out.println("과목을 입력");
					subject = br.readLine();
					p = new TeachMember(id, Contents, subject);
					break;

				}
				
				
				service.intsertBoard(p);
				service.saveData(fileName);
				
				break;

			case "2":
				System.out.println("아이디를 입력");
				id = br.readLine();
				Member m = service.findboard(id);

				System.out.println(m);
				break;

			case "3":
				System.out.println("수정할 아이디 입력");
				id = br.readLine();
				System.out.println("수정할 내용 입력");
				Contents = br.readLine();

				Member m2 = new Member(id, Contents);
				service.updateboard(m2);
				break;

			case "4":
				System.out.println("삭제할 아이디를 입력");
				id = br.readLine();
				service.deleteboard(id);

			case "5":
				service.printboard();
				break;

			case "6":// 종료
				flag = false;

				break;

			default:
				System.out.println("잘못 입력했어요 다시 입력하세요");
			}
		}
	}
}