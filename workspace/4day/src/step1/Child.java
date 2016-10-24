package step1;

public class Child extends Parent {
	private String hobby;

	public Child() {// 持失切

		System.out.println("Child 持失切");

	}

	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		// System.out.println("money : "+money);拭君降持
		System.out.println("hobby : " + hobby);
	}

	public String getHobby() {
		return hobby;

	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
