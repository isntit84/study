package step8;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.printInfo();// null,white
		Car car2 = new Car("k5", "red");
		car2.printInfo();// k5 red
		car1.printInfo();// null white -> ca1과 ca2와 참조값이 다르므로
		System.out.println("car1 주소값:" + car1);
		System.out.println("car1 주소값:" + car2);
		// car1 참조변수에 car2의 주소값을 할당
		car1 = car2;
		car1.printInfo();
		// 가비지 컬렉터에 의해 null, white 제거 되며 재사용시 다시 할당
		System.out.println("car1 주소값:" + car1);
		System.out.println("car2 주소값:" + car2);
	}

}
