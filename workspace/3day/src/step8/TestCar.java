package step8;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.printInfo();// null,white
		Car car2 = new Car("k5", "red");
		car2.printInfo();// k5 red
		car1.printInfo();// null white -> ca1�� ca2�� �������� �ٸ��Ƿ�
		System.out.println("car1 �ּҰ�:" + car1);
		System.out.println("car1 �ּҰ�:" + car2);
		// car1 ���������� car2�� �ּҰ��� �Ҵ�
		car1 = car2;
		car1.printInfo();
		// ������ �÷��Ϳ� ���� null, white ���� �Ǹ� ����� �ٽ� �Ҵ�
		System.out.println("car1 �ּҰ�:" + car1);
		System.out.println("car2 �ּҰ�:" + car2);
	}

}
