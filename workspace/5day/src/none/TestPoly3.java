package none;

class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {
	// �ż��� �������̵�
	public void eat() {
		System.out.println("����� �Ĵ翡�� ��Դ�");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("���� ��Ḧ �Դ�");
	}
}

class Tiger extends Animal {
	public void eat() {
		System.out.println("ȣ���̰� ������ �Դ�");
	}
}

class ZooService {
	// Animal�� ���� ���� �������� ������ �����Ǿ� Animal Ÿ���� �������� �پ��� �ڽ� ��ü�� ó���� ���ִ�.

	public void pass(Animal a) {
		a.eat();// ������ eat()��� �޼����� �پ��� ������ ������ �����ϴ�. ex) ����� �Դ� ���� �Դ�.. ��

	}
}

public class TestPoly3 {
	public static void main(String[] args) {
		ZooService zoo = new ZooService();
		zoo.pass(new Person());
		zoo.pass(new Dog());
		zoo.pass(new Tiger());

	}

}
