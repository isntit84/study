package stepNone;


class Animal {
	public void sleep() {
		System.out.println("�ڴ�");
	}

	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {
	// �ż��� �������̵�
	public void eat() {
		System.out.println("����� �Դ�");
	}

	public void study() {
		System.out.println("����� �����ϴ�");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("���� ��Ḧ �Դ�");
	}

	public void bark() {
		System.out.println("���� �տ� ¢��");
	}
}

public class TestPoly1 {

	public static void main(String[] args) {
		// �θ� Ÿ���� ������ �ڽ� ��ü�� ����(������)

		Animal a = new Person();
		a.sleep();// �θ�κ��ͻ�ӹ��� �޼��� ȣ�Ⱑ��
		a.eat();// �ż��� �������̵��Ǿ� �ڽ��� �޼��� ȣ��
		// a.study(); : ���������� �θ� Ÿ���̹Ƿ� �νǺҰ�
		// �� �ڽ��� �������� ����� �����Ѥ� �� ����.
		// �����ϱ� ���ؼ��� ��ü ĳ������ �ʿ��ϴ�.
		// ??Person p=new Person();
		Person p = (Person) a;// ��ü ĳ����
		p.study(); // ���ٰ���

		Animal a2 = new Dog();
		a2.sleep(); // ��� �޾����Ƿ�
		a2.eat();// �������̵��� �޼��� ȣ�� ����
		// �ڽ��� �������� ����� �����ϱ� ���� ĳ�����ؾ��Ѵ�.
		// a2.bark();
		Dog d = (Dog) a2;
		d.bark();

	}

}
