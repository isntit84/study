package step9;

public class Person {

	private String name;
	// Car ��ü�� �ּҰ��� ������� car�� �����ϰ� ������ ������ Ÿ���� Ŭ���� ���̵ȴ�.

	private Car car; // car��� ���� �տ� Car��� Ŭ������
	// set/get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car; // ��ü�� ���ּҰ� ��
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
