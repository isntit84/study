package step5;

public class TestThrow2 {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setName("dkdlf");// �̸��� 2�� �̻� 5�� ���ϸ� ����
		} catch (NameException e) {
			// �̸��� 2�� �̻� 5�� ���ϸ� ����
			System.out.println(e.getMessage());
		}
		System.out.println("�������");
	}

}
