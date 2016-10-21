package step2;

public class person {
	// 생성자(Constructor)는 클래스명과 동일
	// 명시하지 않으면 컴파일러가 삽입한다.
	// 메모리 초기화
	// 클래스 명과 동일
	// 리턴타입 없다.
	// 생성을 만들지 않아도 자동을 생성(JVM)
	// 메모리 생성시 자동호출

	private String name;// 메뉴 source-> generate constructor using fields

	public person(String name) {// 자동생성
		super();
		this.name = name;
	}

	// 메뉴 source -> generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
// public Person(String n){
// System.out.println("생성자 실행");
// name=n;//생성시 이름을 setting // 메뉴 source-> generate constructor using fields
// }
// public String getName() //메뉴 source -> generate getters and setters
// return name;
// }
// public void setName(String name){
// this.name = name; }
// }
