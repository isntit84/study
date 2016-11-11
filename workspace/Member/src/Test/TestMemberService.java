package Test;

import Service.MemberDAO;
import VO.MemberVO;

public class TestMemberService {

	public static void main(String[] args) {

		MemberDAO service = new MemberDAO();

		service.addMemberVO(new MemberVO("java", "손연재", "111", "구로"));
		service.addMemberVO(new MemberVO("oracle", "김연아", "222", "군포"));
		service.addMemberVO(new MemberVO("JSP", "홍명보", "333", "파주"));
		service.addMemberVO(new MemberVO("Ajax", "이청용", "444", "영국"));
		service.addMemberVO(new MemberVO("Spring", "박지성", "555", "수원"));
		service.printAll();

		MemberVO vo = service.findMemberVO("java");

		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("회원이 아닙니다.");

		service.deleteMemberVO("Ajax");
		service.printAll();

		boolean result = service.updateMemberVO(new MemberVO("Jquery", "류현진", "666", "인천"));
		if (result)
			System.out.println("수정완료");
		else
			System.out.println("상품이 없어서 수정불가");
		service.printAll();
	}
}