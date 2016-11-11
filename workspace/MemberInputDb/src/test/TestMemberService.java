package test;

import java.util.Scanner;

import service.MemberDAO;
import vo.MemberVO;

public class TestMemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String id;
		String name;
		String tel;
		String addr;
		boolean flag = true;
		int i = 0;
		MemberDAO service = new MemberDAO();

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
				System.out.println("�̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				System.out.println("�ּ��� �Է��ϼ��� :");
				addr = sc.next();
				service.insert(new MemberVO(id, name, tel, addr));
				break;
			case 2:
				System.out.println("���̵� �Է��ϼ��� :");
				id = sc.next();
				MemberVO m = service.selectMember(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("������ id�� �Է��ϼ��� : ");
				id = sc.next();
				System.out.println("������ �̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.println("������ ��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				System.out.println("������ �ּ��� �Է��ϼ��� :");
				addr = sc.next();
				MemberVO m2 = new MemberVO(id, name, tel, addr);
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
