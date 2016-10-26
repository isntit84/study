package step4;


public class TestMemberService {

	public static void main(String[] args) {

		Dao service = new DaoImpl();
		service.connect();
		service.addPerson(new MemberVO(1, "손연재", "부서", "주소"));
		service.addPerson(new MemberVO(2, "김연아", "컴퓨터학과", "군포"));
		service.addPerson(new MemberVO(3, "홍명보", "전산부", "파주"));

		service.printAll();

		MemberVO vo = service.findPerson("손연재");
		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("회원이 아닙니다.");
		
		
		
		Dao service2 = new DaoImpl2();
		service2.connect();
		service2.addPerson(new MemberVO(4, "연재", "서", "소"));
		service2.addPerson(new MemberVO(5, "연아", "퓨터학과", "포"));
		service2.addPerson(new MemberVO(6, "명보", "산부", "주"));

		service2.printAll();

		MemberVO vo2 = service2.findPerson("연재");
		if (vo2 != null)
			System.out.println(vo2);
		else
			System.out.println("회원이 아닙니다.");

	}

}
