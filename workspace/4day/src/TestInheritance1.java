class Animal {
	int age = 1;

	public void eat() {
		System.out.println("�Դ�");
	}
}

// extends ���
class Person extends Animal {
	public void study() {
		System.out.println("�����ϴ�");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.eat();// Animal�� ��� �޾����Ƿ� ȣ�Ⱑ��
		System.out.println(p.age);// Animal���� age ���

	}

}
// �ڽ� Ŭ������ ��ӵǾ� Ÿ���� �ڽ�����