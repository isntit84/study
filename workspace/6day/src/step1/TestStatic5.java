package step1;

class Car {
	static int scount; // ����ƽī��Ʈ
	int count;

	// ��ü������ �ڽ��� �ν��Ͻ������� ��� �ʱ�ȭ
	// static������ Ŭ���� ������ �ѹ� �ʱ�ȭ
	Car() {
		System.out.println("car ����");
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
		// ��� �ڵ����� �����Ǿ����� �˰� �ʹ�.
		System.out.println(c3.count);// 1 �Ź� ���Ӱ� �ʱ�ȭ
		System.out.println(Car.scount++);// 3
		// static ������ Ŭ���� ������ ����

	}

}
