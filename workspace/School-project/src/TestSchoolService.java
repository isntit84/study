
public class TestSchoolService {

	public static void main(String[] args) {
		// SchoolService2 service=new SchoolService2(); //매인 테스트클래스 작성
		SchoolService service = new SchoolService();
		// tel, name ,address, stuId
		Student s = new Student("011", "크리스탈", "판교", "12");
		service.addPerson(s);// 한명이 추가,찍히는건 없다
		// tel, name, address,subject
		Teacher t = new Teacher("017", "황정민", "익산", "국어");
		service.addPerson(t);// 한명씩 들어감
		// tel, name, address,dept
		Employee e = new Employee("015", "시용태", "수지", "전산부");
		service.addPerson(e);
		service.printAll();
		Person per = service.findPerson("017");
		if (per != null)
			System.out.println(per);// 황정민 정보가 모두 출력
		else
			System.out.println("찾는 구성원 없음!");
		// 번호 일치하면 삭제
		service.deletePerson("017");
		service.printAll();
		// 번호에 해당하는 리스트의 요소를 업데이트
		service.updatePerson("019", new Student("010", "보아", "종로", "13"));
		service.printAll();

	}

}
