package step1;

class Company {
	public static int i = 1;

	public static void test() {
		System.out.println("static test");
	}
}

public class TestStatic1 {

	// �ν��Ͻ�����, ��ü�� ����
	// ��ü�� ���鶧 �ö󰣴�.
	// ��ü�� ����� ��� �޸𸮿� �ö󰣴�.
	// �ν��Ͻ� ������ �ݵ�� ��ü�� �����ؾ� �޸𸮿� �����

	// ��ü���� �ʿ���� Ŭ������.���(���� �޼���)�� ����
	public static void main(String[] args) {
		// ��ü�� ������ �޸𸮿� �ö�
		// static�� class �ε��ÿ� �޸𸮿� ����
		// ��ü ���� ���� �ν��Ͻ� ������ ������ �� ����.
		// system.out.println(money);
		// ��ü�����ϸ� ���� �����ϴ�. (why? �޸� ����ǹǷ�)
		Company.test();
		System.out.println(Company.i);
	}

}
//static