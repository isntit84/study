package step8;

public class Car {
	private String model;// nul
	private String color = "white";

	// ������ �����ε� : �����ڸ� �Ű����� �ٸ��� ������ ����
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
