package step5yeje;

public class Firee extends Overr {// OverrŬ������ ���� ���

	public Firee(String name) {// �ʱ�ȭ
		this.name = name;// �̸����� �ʱ�ȭ
		race = "Firee";// ������ �̻��� �ʱ�ȭ
		age = 0;// ���̴� 0���� �ʱ�ȭ
		power = 50;// �Ŀ��� �⺻�� 150
		energy = 150;// ������ �⺻�� 200
		cnt = 0;// cnt 0���� �ʱ�ȭ
		System.out.println("���̸��� ����������ϴ�.");
	}

	public void eat() {// ��Դ� �޼���
		energy += 10;// ������ 15�� ����
		cnt++;// cnt�� 1����
		aging();// aging()�޼��带 ȣ��
	}

	public void sleep() { // ���ڴ� �޼���
		energy += 15;// ���� �ڸ� 5������
		cnt++;// cnt�� 1����
		aging();// aging() �޼��带 ȣ��
	}

	public void exercise() { // ��ϱ� �޼���
		energy -= 10;// ������ �Ҹ� 10����
		power += 20;// �Ŀ� 10 ����
	}

	public void playwith() { // ����ֱ� �޼���
		energy += 10;// ������ 10 ����
		power += 10;// �Ŀ� 10 ����
		
	}
	
	public void aging() {
		// cnt��5�����ҋ����� 1�� ����
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}

	public void attack() {// �����ϴ� �޼���
		energy -= 25;// ������ 15 ����
		power += 15;// �Ŀ� 20 ����
	}

}