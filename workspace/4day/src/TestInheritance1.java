class Animal {
	int age = 1;

	public void eat() {
		System.out.println("먹다");
	}
}

// extends 상속
class Person extends Animal {
	public void study() {
		System.out.println("공부하다");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.eat();// Animal을 상속 받았으므로 호출가능
		System.out.println(p.age);// Animal에서 age 상속

	}

}
// 자식 클래스를 상속되어 타입이 자식형태