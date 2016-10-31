import java.util.Scanner;

public class TstPersonService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList<MemberVO> list =new ArrayList<MemberVO>();
		String dept, stuId, subject;
		String name;
		String tel;
		String addr;
		boolean flag = true;
		int i = 0, y = 0;
		SchoolService service = new SchoolService();
		Person p = null;
		while (flag) {

			System.out.println("1.���");
			System.out.println("2.�˻�");
			System.out.println("3.����");
			System.out.println("4.����");
			System.out.println("5.��ü���");
			System.out.println("6.����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("�̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				System.out.println("�ּ��� �Է��ϼ��� :");
				addr = sc.next();
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				y = sc.nextInt();
				switch(y){
				case 1:
					System.out.println("�μ��� �Է��ϼ��� :");
					dept = sc.next();
					p = new Employee(tel, name, addr, dept);
					break;
				case 2:
					System.out.println("�й��� �Է��ϼ��� :");
					stuId = sc.next();
					p = new Student(tel, name, addr, stuId);
					break;
				case 3:
					System.out.println("���� �Է��ϼ��� :");
					subject = sc.next();
					p = new Teacher(tel, name, addr, subject);
					break;
				}
				
				service.addPerson(p);
				break;
			case 2:
				System.out.println("��ȭ��ȣ�� �Է��ϼ��� :");
				tel = sc.next();
				p = service.findPerson(tel);
				System.out.println(p);
				break;
				
			case 3:
				System.out.println("������ ����� ��ȭ��ȣ�� �Է��ϼ��� : ");
				tel = sc.next();
				System.out.println("�� �̸��� �Է��ϼ��� :");
				name = sc.next();
				System.out.println("�� �ּҸ� �Է��ϼ��� :");
				addr = sc.next();
				System.out.println("1.������");
				System.out.println("2.�л�");
				System.out.println("3.����");
				y = sc.nextInt();
				switch(y){
				case 1:
					System.out.println("�� �μ��� �Է��ϼ��� :");
					dept = sc.next();
					p = new Employee(tel, name, addr, dept);
					break;
				case 2:
					System.out.println("�� �й��� �Է��ϼ��� :");
					stuId = sc.next();
					p = new Student(tel, name, addr, stuId);
					break;
				case 3:
					System.out.println("�� ���� �Է��ϼ��� :");
					subject = sc.next();
					p = new Teacher(tel, name, addr, subject);
					break;
				}			
				service.updatePerson(tel, p);
			   break;
			
			case 4:
			System.out.println("������ ����� ��ȭ��ȣ�� �Է��ϼ��� : ");
			tel = sc.next();
			service.deletePerson(tel);
			break;
			
			case 5:
				service.printAll();
		        break; 
			case 6:
				flag=false; 
			    break; 
			    
			default:
				System.out.println("�߸� �Է��߾�� �ٽ� �Է��ϼ��� ");
			}

		}

	}

}
