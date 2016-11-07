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

		String fileName = "school.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("******���� �Խ����� �����մϴ�******");

		String dept;
		String stuId;
		String subject;
		String id;
		String contents;
		boolean flag = true;
		String i = "";
		String y ="";
		Member p = null;
		BoardService service = new BoardService();
		service.loadData(fileName);

		while (flag) {
			System.out.println("1.���Է� 2.�˻� 3.����4.����5.�۳��뺸��6.����");
			i = br.readLine();
			switch (i) {
			case "1":
				System.out.println("�߰��� ���̵� �Է��ϼ��� :");
				id = br.readLine();
				System.out.println("������ �Է��ϼ��� :");
				contents = br.readLine();
				
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				y = br.readLine();
				
				switch(y) {
				case "1" :
				System.out.println("�μ��� �Է��ϼ��� : ");
				dept = br.readLine();
				p = new EmpMember(id,contents,dept);
				break;
				
				case "2" :
				System.out.println("�г��� �Է��ϼ��� : ");
				stuId = br.readLine();
				p = new StuMember(id,contents,stuId);
				break;
				
				case "3" :
				System.out.println("������ �Է��ϼ��� : ");
				subject = br.readLine();
				p = new TeachMember(id,contents,subject);
				break;
				}

				service.insertboard(p);
				service.saveData(fileName);
				break;

			case "2":
				System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
				id = br.readLine();
				Member m = service.findboard(id);

				System.out.println(m);
				break;

			case "3":
				System.out.println("������ ���̵� �Է��ϼ��� : ");
				id = br.readLine();
				System.out.println("������ ������ �Է��ϼ��� : ");
				contents = br.readLine();

				Member m2 = new Member(id, contents);
				service.updateboard(m2);
				break;

			case "4":
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = br.readLine();
				service.deleteboard(id);
				break;

			case "5":
				service.printboard();
				break;

			case "6":
				flag = false;
				break;

			default:
				System.out.println("�߸� �Է��߾�� �ٽ� �Է��ϼ��� ");
			}

		}

	}

}
