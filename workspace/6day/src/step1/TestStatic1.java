package step1;

class Company {
	public static int i = 1;

	public static void test() {
		System.out.println("static test");
	}
}

public class TestStatic1 {

	// 인스턴스변수, 객체의 변수
	// 객체를 만들때 올라간다.
	// 객체를 만들어 줘야 메모리에 올라간다.
	// 인스턴스 변수는 반드시 객체를 생성해야 메모리에 적재됨

	// 객체생성 필요없이 클래스명.멤버(변수 메서드)로 접근
	public static void main(String[] args) {
		// 객체를 만들어야 메모리에 올라감
		// static은 class 로딩시에 메모리에 적재
		// 객체 생성 없이 인스턴스 변수에 접근할 수 없다.
		// system.out.println(money);
		// 객체생성하면 접근 가능하다. (why? 메모리 적재되므로)
		Company.test();
		System.out.println(Company.i);
	}

}
//static