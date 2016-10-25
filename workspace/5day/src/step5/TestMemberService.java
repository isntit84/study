package step5;

public class TestMemberService {

	public static void main(String[] args) {
		SchoolService service = new SchoolService();

		service.addPerson(new Professor(1, "손연재", "부서", "주소", "과목"));
		service.addPerson(new Student(2, "김연아", "컴퓨터학과", "군포", "자바"));
		service.addPerson(new Staff(3, "홍명보", "전산부", "파주", "개발자"));

		service.printAll();// 상품4개출력
		// 2차구현: 상품검색
		MemberVO vo = service.findPerson("손연재");
		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("회원이 아닙니다.");
		// 3차 구현: 상품을 삭제
	}

}
