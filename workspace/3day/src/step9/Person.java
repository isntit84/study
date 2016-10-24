package step9;

public class Person {

	private String name;
	// Car 객체의 주소값을 담기위해 car를 선언하고 참조형 데이터 타입은 클래스 명이된다.

	private Car car; // car라는 변수 앞에 Car라는 클래스명
	// set/get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car; // 객체으 ㅣ주소값 들어감
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
