package step5;

public class TestMemberService {

	public static void main(String[] args) {
		SchoolService service = new SchoolService();

		service.addPerson(new Professor(1, "�տ���", "�μ�", "�ּ�", "����"));
		service.addPerson(new Student(2, "�迬��", "��ǻ���а�", "����", "�ڹ�"));
		service.addPerson(new Staff(3, "ȫ��", "�����", "����", "������"));

		service.printAll();// ��ǰ4�����
		// 2������: ��ǰ�˻�
		MemberVO vo = service.findPerson("�տ���");
		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("ȸ���� �ƴմϴ�.");
		// 3�� ����: ��ǰ�� ����
	}

}
