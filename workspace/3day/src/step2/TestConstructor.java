package step2;

public class TestConstructor {
	// person 객체 생성시 person 생성자 실행 테스트
	public static void main(String[] args) {
		// 생성자에서 인자값을요구하므로
		// 객체 생성 위해서는 데이터를 입력해야 정상 수행
		person p = new person("아이유");
		System.out.println(p.getName());
		p.setName("보아");
		System.out.println(p.getName());
		// 생성자를 통한 할당과
		// set method를 통한 할당은 결과적으로 동일
		// 용도에 있어서는 차이는 무엇일까?\

		// 생성자에서 명시한 인자값을 입력하지 않으면 컴파일 에러
		// 즉 객체 생성의 조건을 인자값 있는 생성자에서 요구한다.
		// 생성자는 필수적
		// ex)계좌생성시 서류가 필요 요소 제출
		// p.setName("");은 선택적 or 정보수정
		// ex)인터넷뱅킹의 유 무 선택

		// 생성자를 통한 할당 - 객체 생성에 필수ㅈ거 요소
		// set method를통한 할당 -..
	}

}
