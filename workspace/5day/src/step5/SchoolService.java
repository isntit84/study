package step5;

public class SchoolService {
	private int index;
	private MemberVO p[] = new MemberVO[10];

	// �迭�� �߰��� ��Ұ� ����� �����ϴ� ����
	// �б� �������� �߰��ϴ� �ż��� ��ü�� �Ѿ���� �迭�� �߰��ϰ� index++�Ѵ�.
	public void addPerson(MemberVO p) {
		this.p[index] = p;
		index++;
	}
	// p�迭�� ��� ��θ� ��� toString()�� �������̵� �����Ƿ� �迭 ���(ex)p[0]�� ����ϸ�ȴ�.
	// index�� �̿��� �迭 ��ΰ� �ƴ϶� �߰��� ��ұ����� ����ؾ��Ѵ�.

	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(p[i]);
		}
	}

	// ��ȭ��ȣ�� �б� ���������˻��ϴ� �ż��� �Ѿ�� ��ȣ�� �迪����� ��ȭ��ȣ�� ��ġ�ϸ�
	// �ش� �迭 ��Ҹ� �����Ѵ�. ���� ��ġ�Ǵ� �迭 ��Ұ� ���� ��� null�� ��ȯ�Ѵ�.

	public MemberVO findPerson(String name) {
		MemberVO per = null;
		for (int i = 0; i < index; i++) {
			if (p[i].getName().equals(name)) {// ��ȭ��ȣ�� ������ ��
				per = p[i];//
			}
		}
		return per;
	}
}