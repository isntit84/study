package step8;

public class Car {
	private String model;// nul
	private String color = "white";

	// 생성자 오버로딩 : 생성자를 매개변수 다르게 여러번 정의
	public Car() {
	}

	public Car(String mode1, String color) {
		this.model = model;
		this.color = color;
	}

	public void printInfo() {
		System.out.println(model + " " + color);

	}
}
