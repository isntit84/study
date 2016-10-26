package step5;

public class TestThrow2 {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setName("dkdlf");// 이름은 2자 이상 5자 이하만 가능
		} catch (NameException e) {
			// 이름은 2자 이상 5자 이하만 가능
			System.out.println(e.getMessage());
		}
		System.out.println("정상수행");
	}

}
