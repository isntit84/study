package step1;

class Car {
	static int scount; // 스태틱카운트
	int count;

	// 객체생서시 자신의 인스턴스변수는 계속 초기화
	// static변수는 클래스 생성시 한번 초기화
	Car() {
		System.out.println("car 생성");
		count++;
		scount++;

	}
}

public class TestStatic5 {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.count);
		Car c2 = new Car();
		System.out.println(c2.count);
		Car c3 = new Car();
		// 몇개의 자동차가 생성되었는지 알고 싶다.
		System.out.println(c3.count);// 1 매번 새롭게 초기화
		System.out.println(Car.scount++);// 3
		// static 변수는 클래스 명으로 접근

	}

}
