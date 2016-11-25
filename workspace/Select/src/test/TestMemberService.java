package test;

import java.util.Scanner;

import service.MemberService;
import service.Service;
import vo.Employee;
import vo.Member;
import vo.Professor;
import vo.Student;

public class TestMemberService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = "", name = "", tel = "", addr = "", etc = "";
		int type = 0;
		boolean flag = true;
		int i = 0, j = 0;
		Member m = null;
		String[] tag = { "", "school", "dept", "job" };
		Service service = new MemberService();

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
				System.out.println("�׷켱��\n1.�л� 2.���� 3.������");
				type = sc.nextInt();
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				System.out.println("�̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.println("�ּҸ� �Է��ϼ��� :");
				addr = sc.next();
				System.out.println(tag[type] + "�Է��ϼ��� :");
				etc = sc.next();
				if (type == 1) {
					service.addMember(new Student(id, name, tel, addr, type, etc));
				} else if (type == 2) {
					service.addMember(new Professor(id, name, tel, addr, type, etc));
				} else if (type == 3) {
					service.addMember(new Employee(id, name, tel, addr, type, etc));
				} else {
					System.out.println("�Է� ������ ���� �߰����� �ʾ���");
				}
				break;
			case 2:
				System.out.println("�˻��� ���̵� �Է��ϼ��� :");
				id = sc.next();
				m = service.getMember(id);
				String str = "";
				if (m.getType() == 1) {
					str = ((Student) m).toString();
				} else if (m.getType() == 2) {
					str = ((Professor) m).toString();
				} else if (m.getType() == 3) {
					str = ((Employee) m).toString();

				}
				System.out.println(str);

				System.out.println(m);
				break;

			case 3:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				System.out.println("������ ��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				System.out.println("������ �ּҸ� �Է��ϼ��� :");
				addr = sc.next();
				m = service.getMember(id);
				type = m.getType();
				System.out.println("������" + tag[type] + "�� �Է��Ͻÿ�: ");
				etc = sc.next();
				if (type == 1) {

				}
				break;

			case 4:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				service.delMember(id);
				break;

			case 5:
				service.getmembers(type);
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