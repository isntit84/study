package step9;

public class TestHasA {

	public static void main(String[] args) {
		// Person has a Car 관계를 표현
		Person p = new Person();// 인스터스변수 car,name
		p.setName("아이유");
		p.setCar(new Car("k5", "red"));// 생성자 명시 인스턴스 변수 model,color,객체생성시 주소값
										// 반환
		System.out.println(p.getName());// 아이유
		System.out.println(p.getCar());// Car 객체 주소값
		System.out.println(p.getCar().getModel());// k5->(=car.getModel())
		System.out.println(p.getCar().getColor());// red
		// 아이유 객체 p가 소유한 Car의 모델명을 sm5로 변경
		p.getCar().setModel("sm5");
		// 아이유 객체 p가 소유한 Car의 색상을 black으로 변경
		p.getCar().setColor("black");
		System.out.println(p.getCar().getModel());// sm5
		System.out.println(p.getCar().getColor());// black

	}

}// class 무엇이 필요한지, 각 class의 instance 변수?
	// 필요 매서드
