package step3;

public class TestMemberVo {

	public static void main(String[] args) {
		// 적절한 데이터를 입력해
		MemberVO vo = new MemberVO("java", "abcd");

		vo.setJob("프로그래머");
		System.out.println(vo.getId() + " " + vo.getPassword() + " " + vo.getJob());

	}

}
