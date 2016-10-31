package service;

import java.util.ArrayList;

import exception.IdException;
import exception.MoneyException;
import vo.PersonVO;

public class AccountService {
	private ArrayList list = new ArrayList();

	private int findIndex(String id) {
		// id �Է��� �ε��� ���� �����ϴ� �޼���
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			PersonVO per = (PersonVO) list.get(i);
			if (per.getId().equals(id)) {
				index = i;
				break;
			}
		}
		return index;
		// ���� �Է¹��� id�� ������ ����Ʈ�� ������ index�� -1 �� ����Ѵ�.
	}

	public void addPerson(PersonVO per) throws IdException, MoneyException {
		int i = findIndex(per.getId());

		// �Է¹��� id �� findIndex �޼��带 ���� ������ ���̵� ������� -1�� ����
		// ������ ���̵� ������ ��� index���� ��ȯ�Ѵ�.
		if (per.getMoney() <= 0) {// ���� �Է¹��� ���� ������ ������ throw
			throw new MoneyException("�Աݾ��� 0�� �����Դϴ�.");
		}
		if (i != -1) {// index���� -1�� �ƴϸ� throw
			throw new IdException("������ ID�� �����Ͽ� �߰��Ҽ������ϴ�.");
		}
		list.add(per);// ���� ������ ��� �������� ������� list.add�� �߰��Ѵ�.
	}

	public void printAll() {// ����Ѵ�.
		for (int i = 0; i < list.size(); i++) {
			PersonVO per = (PersonVO) list.get(i);
			System.out.println(list.get(i));
		}
	}

	public void deposit(String id, int money) throws IdException, MoneyException {
		int i = findIndex(id);
		if (i != -1) {// ���� ã�� ����� �����Ѵٸ�(index���� -1�� �ƴ϶��) �Ʒ��� ������ �����Ѵ�.
			PersonVO per = (PersonVO) list.get(i);
			if (money <= 0) // ã���� �ϴµ��� 0���� ������ throw
				throw new MoneyException("�Աݾ��� 0�� �����Դϴ�.");
			if (money > 0) // �Է¹��� ���� 0���� ũ�� ������ ���� ���ؼ� �����Ѵ�.
				per.setMoney(money + per.getMoney());
			// �Ա��ϴ� ���� ���� �Ͽ� ����
		}
		if (i == -1) // ���� index�� -1�̶�� ������ ���̴ٰ� ������ throw
			throw new IdException("ID�� �������� �ʽ��ϴ�.");
	}

	public void withdraw(String id, int money) throws MoneyException, IdException {
		int i = findIndex(id);
		if (i != -1) {// ���� ������ ���̵� ���ٸ�(-1�� �ƴ϶��) �Ʒ��� ������ �����Ѵ�.
			PersonVO per = (PersonVO) list.get(i);
			if (per.getMoney() >= money) {
				// ����Ϸ��� ���� ������ ���¿� �����ϴ� ������ �������
				per.setMoney(per.getMoney() - money);
				// ����ϰ� ���� �ݾ� ����
			}
			if (money <= 0) // �Աݾ��� 0���ΰ��
				throw new MoneyException("�Աݾ��� 0�� �����Դϴ�.");
		}
		if (i == -1) // �Է¹��� id �� findIndex �޼��带 ���� ������ ���̵� ������� -1�� ����
			throw new IdException("ID�� �������� �ʽ��ϴ�.");
	}

	public void deleteAccount(String id) throws IdException {
		int i = findIndex(id);
		// �Է¹��� id �� findIndex �޼��带 ���� ������ ���̵� ������� -1�� ����
		// ������ ���̵� ������ ��� index���� ��ȯ�Ѵ�.
		if (i != -1)
			list.remove(i);// ������ ���̵� ������� -1�� ����
		else // ������ ���̵� ������� throw
			throw new IdException("ID�� ���� ���� �ʽ��ϴ�.");
	}

	public PersonVO findAccount(String id) throws IdException {
		int i = findIndex(id);
		if (i != -1) {// ������ ���̵� �����Ұ��
			PersonVO per = (PersonVO) list.get(i);
			System.out.println(per);
			return per;
		} else {// ������ ���̵� �������
			throw new IdException("ID�� ���� ���� �ʽ��ϴ�.");
		}
	}

	public void updateAccount(String id, PersonVO p) throws IdException, MoneyException {
		if (id.equals(p.getId())) {// �Է¹��� ���̵�� �Է¹��� ��ü�� ������ ���̵� �����Ұ��
			int i = findIndex(id);
			if (i == -1) // ������ ���̵� �������� ���� ���
				throw new IdException("id�� ���� ���� �ʽ��ϴ�.");
			if (i != -1) {// ������ ���̴ٰ� �����Ұ��
				PersonVO per = (PersonVO) list.get(i);
				if (p.getMoney() == per.getMoney()) {
					// �Ű������� PersonVO�� ���̵��
					// findIndex���� ã�Ƴ� index�� ����Ű�� list�� �ܾ��� �����Ұ��
					// �ּ� �Է�, �̸� �Է�
					per.setAddress(p.getAddress());
					per.setName(p.getName());
				} else {// �׷��� ������� �ܾ��� ��ȯ
					throw new MoneyException("�ܾ��� �ٸ��ϴ�.");
				}
			}
		} else {// �Է¹��� ���̵�� PesonVO�� ���̵� �ٸ� ��� throw
			throw new IdException("�Է�id ����");
		}
	}
}
