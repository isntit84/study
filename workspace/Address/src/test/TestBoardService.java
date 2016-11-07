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
		System.out.println("�ּ� ���");

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
			System.out.println("1.�Է� 2.�˻� 3.���� 4.���� 5.�ּҺ��� 6.����");
			i = br.readLine();
			switch (i) {
			case "1":
				System.out.println("�߰��� �̸� �Է� ");
				name = br.readLine();
				System.out.println("�߰��� ��ȭ��ȣ �Է�");
				tel = br.readLine();
				System.out.println("�߰��� �ּ� �Է�");
				address = br.readLine();
				
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				
				y=br.readLine();				

				switch (y) {
				case "1":
					System.out.println("�μ� �Է�");
					dept = br.readLine();
					p = new Emp(name, tel, address, dept);
					break;

				case "2":
					System.out.println("�й� �Է�");
					id = br.readLine();
					p = new Stu(name, tel, address, id);
					break;

				case "3":
					System.out.println("���� �Է�");
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
				System.out.println("�˻��� �̸� �Է�");
				name = br.readLine();
				Address a = service.findboard(name);

				System.out.println(a);
				break;

			case "3":
				System.out.println("������ �̸� �Է�");
				name = br.readLine();
				System.out.println("������ ��ȭ��ȣ �Է�");
				tel = br.readLine();
				System.out.println("������ �ּ� �Է�");
				address = br.readLine();
				

				Address a1 = new Address(name, tel, address);
				service.updateboard(a1);
				break;
			case "4":
				System.out.println("������ �̸� �Է�");
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
				System.out.println("�߸� �Է� �ٽ� �Է�");
			}

		}

	}

}
