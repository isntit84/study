package step3;

public class TestMemberVo {

	public static void main(String[] args) {
		// ������ �����͸� �Է���
		MemberVO vo = new MemberVO("java", "abcd");

		vo.setJob("���α׷���");
		System.out.println(vo.getId() + " " + vo.getPassword() + " " + vo.getJob());

	}

}
