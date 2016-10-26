package step5;

public class Person {
	private String name;

	public void setName(String name) throws NameException {
		if (name.length() < 2 || name.length() > 5) {
			throw new NameException("이름은 2자이상 5자이하만 가능");
		} else {
			this.name = name;
		}
	}
}
