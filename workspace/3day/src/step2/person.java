package step2;

public class person {
	// ������(Constructor)�� Ŭ������� ����
	// ������� ������ �����Ϸ��� �����Ѵ�.
	// �޸� �ʱ�ȭ
	// Ŭ���� ��� ����
	// ����Ÿ�� ����.
	// ������ ������ �ʾƵ� �ڵ��� ����(JVM)
	// �޸� ������ �ڵ�ȣ��

	private String name;// �޴� source-> generate constructor using fields

	public person(String name) {// �ڵ�����
		super();
		this.name = name;
	}

	// �޴� source -> generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
// public Person(String n){
// System.out.println("������ ����");
// name=n;//������ �̸��� setting // �޴� source-> generate constructor using fields
// }
// public String getName() //�޴� source -> generate getters and setters
// return name;
// }
// public void setName(String name){
// this.name = name; }
// }
