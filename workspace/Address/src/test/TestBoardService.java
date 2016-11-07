package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BoardService;
import vo.Address;
import vo.Emp;
import vo.Stu;
import vo.Tech;

public class TestBoardService {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "address.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("주소 목록");

		String name;
		String tel;
		String address;
		String dept;
		String id;
		String subject;

		boolean flag = true;
		String i = "";
		String y = "";
		Address p = null;
		BoardService service = new BoardService();
		//service.loadData(fileName);
		while (flag) {
			System.out.println("1.입력 2.검색 3.수정 4.삭제 5.주소보기 6.종료");
			i = br.readLine();
			switch (i) {
			case "1":
				System.out.println("추가할 이름 입력 ");
				name = br.readLine();
				System.out.println("추가할 전화번호 입력");
				tel = br.readLine();
				System.out.println("추가할 주소 입력");
				address = br.readLine();
				
				System.out.println("1.교직원");
				System.out.println("2.학생");
				System.out.println("3.교사");
				
				y=br.readLine();				

				switch (y) {
				case "1":
					System.out.println("부서 입력");
					dept = br.readLine();
					p = new Emp(name, tel, address, dept);
					break;

				case "2":
					System.out.println("학번 입력");
					id = br.readLine();
					p = new Stu(name, tel, address, id);
					break;

				case "3":
					System.out.println("과목 입력");
					subject = br.readLine();
					p = new Tech(name, tel, address, subject);
					break;
				}
				//System.out.println("tst1");
				service.insertboard(p);
				//System.out.println("tst2");
				service.saveData(fileName);
				break;

			case "2":
				System.out.println("검색할 이름 입력");
				name = br.readLine();
				Address a = service.findboard(name);

				System.out.println(a);
				break;

			case "3":
				System.out.println("수정할 이름 입력");
				name = br.readLine();
				System.out.println("수정할 전화번호 입력");
				tel = br.readLine();
				System.out.println("수정할 주소 입력");
				address = br.readLine();
				

				Address a1 = new Address(name, tel, address);
				service.updateboard(a1);
				break;
			case "4":
				System.out.println("삭제할 이름 입력");
				name = br.readLine();
				service.deleteboard(name);
				break;
			case "5":
				service.printboard();
				break;
			case "6":
				flag = false;
				break;

			default:
				System.out.println("잘못 입력 다시 입력");
			}

		}

	}

}
