package step5;

public class Person {
	private String name;

	public void setName(String name) throws NameException {
		if (name.length() < 2 || name.length() > 5) {
			throw new NameException("�̸��� 2���̻� 5�����ϸ� ����");
		} else {
			this.name = name;
		}
	}
}
