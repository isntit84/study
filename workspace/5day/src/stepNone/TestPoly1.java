package stepNone;


class Animal {
	public void sleep() {
		System.out.println("자다");
	}

	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal {
	// 매서드 오버라이딩
	public void eat() {
		System.out.println("사람이 먹다");
	}

	public void study() {
		System.out.println("사람이 공부하다");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("개가 사료를 먹다");
	}

	public void bark() {
		System.out.println("개가 왕왕 짖다");
	}
}

public class TestPoly1 {

	public static void main(String[] args) {
		// 부모 타입의 변수에 자식 객체를 참조(다형성)

		Animal a = new Person();
		a.sleep();// 부모로부터상속받은 메서드 호출가능
		a.eat();// 매서드 오버라이딩되어 자신의 메서드 호출
		// a.study(); : 참조변수가 부모 타입이므로 인실불가
		// 즉 자식의 독자적인 멤버는 접근한ㄹ 수 없다.
		// 점근하기 위해서는 객체 캐스팅이 필요하다.
		// ??Person p=new Person();
		Person p = (Person) a;// 객체 캐스팅
		p.study(); // 접근가능

		Animal a2 = new Dog();
		a2.sleep(); // 상속 받았으므로
		a2.eat();// 오버라이딩한 메서드 호출 가능
		// 자식의 독자적인 멤버에 접근하기 위해 캐스팅해야한다.
		// a2.bark();
		Dog d = (Dog) a2;
		d.bark();

	}

}
