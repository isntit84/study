package step3;

// abstract method(추상메서드를 하나이상 가지고 있으며 그 클래스는 abstract class로 선언되어야 한다.
//abstract class 는 직젖 객체화 될수 업삳.
abstract class Parent {
	public void eat() {
		System.out.println("먹다");
	}
	// abstract method구한부가없다.
	// 자식들은 반드시 abstract method를 오버라이딩 해야한다.
	// 만약 오버라이딩 하지 않으면
	// 자식클래스가 abstract가 되야 한다.-> 객체 생성이 안됨
	// 객체생성을 하려면 오버라이딩 해야한다.

	public abstract void study();
}

class Child extends Parent {
	//
	@Override
	public void study() {
		System.out.println("공부하다");
	}
}

public class TestAbstract1 {

	public static void main(String[] args) {
		// abstract class 이므로 직접 객체 생성 할 수 없다
		// 자식을 통해 객체를 생성한다.
		// Parent p=new parent();
		Child c = new Child();
		c.eat();
		c.study();
		// 다형성 적용
		Parent p1 = new Child();
		p1.eat();
		p1.study();
	}

}
