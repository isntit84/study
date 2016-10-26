package step4;


public class TestMemberService {

	public static void main(String[] args) {

		Dao service = new DaoImpl();
		service.connect();
		service.addPerson(new MemberVO(1, "�տ���", "�μ�", "�ּ�"));
		service.addPerson(new MemberVO(2, "�迬��", "��ǻ���а�", "����"));
		service.addPerson(new MemberVO(3, "ȫ��", "�����", "����"));

		service.printAll();

		MemberVO vo = service.findPerson("�տ���");
		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("ȸ���� �ƴմϴ�.");
		
		
		
		Dao service2 = new DaoImpl2();
		service2.connect();
		service2.addPerson(new MemberVO(4, "����", "��", "��"));
		service2.addPerson(new MemberVO(5, "����", "ǻ���а�", "��"));
		service2.addPerson(new MemberVO(6, "��", "���", "��"));

		service2.printAll();

		MemberVO vo2 = service2.findPerson("����");
		if (vo2 != null)
			System.out.println(vo2);
		else
			System.out.println("ȸ���� �ƴմϴ�.");

	}

}
