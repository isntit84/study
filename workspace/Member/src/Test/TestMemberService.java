package Test;

import Service.MemberDAO;
import VO.MemberVO;

public class TestMemberService {

	public static void main(String[] args) {

		MemberDAO service = new MemberDAO();

		service.addMemberVO(new MemberVO("java", "�տ���", "111", "����"));
		service.addMemberVO(new MemberVO("oracle", "�迬��", "222", "����"));
		service.addMemberVO(new MemberVO("JSP", "ȫ��", "333", "����"));
		service.addMemberVO(new MemberVO("Ajax", "��û��", "444", "����"));
		service.addMemberVO(new MemberVO("Spring", "������", "555", "����"));
		service.printAll();

		MemberVO vo = service.findMemberVO("java");

		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("ȸ���� �ƴմϴ�.");

		service.deleteMemberVO("Ajax");
		service.printAll();

		boolean result = service.updateMemberVO(new MemberVO("Jquery", "������", "666", "��õ"));
		if (result)
			System.out.println("�����Ϸ�");
		else
			System.out.println("��ǰ�� ��� �����Ұ�");
		service.printAll();
	}
}