package step2;

class Animal1 {
	int age = 1;
	private String card = "ī��";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
}

class Person extends Animal1 {
	public void info() {
		System.out.println("�θ� ������ ���� �׽�Ʈ :" + super.age);
		System.out.println(super.getCard());
	}
}

public class TestSuper3 {

	public static void main(String[] args) {
		Person p = new Person();
		p.info();
	}
}
