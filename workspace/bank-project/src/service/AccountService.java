package service;

import java.util.ArrayList;

import exception.IdException;
import exception.MoneyException;
import vo.PersonVO;

public class AccountService {
	private ArrayList list = new ArrayList();

	private int findIndex(String id) {
		// id 입력후 인덱스 값을 리턴하는 메서드
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			PersonVO per = (PersonVO) list.get(i);
			if (per.getId().equals(id)) {
				index = i;
				break;
			}
		}
		return index;
		// 만약 입력받은 id와 동일한 리스트가 없으면 index는 -1 을 출력한다.
	}

	public void addPerson(PersonVO per) throws IdException, MoneyException {
		int i = findIndex(per.getId());

		// 입력받은 id 를 findIndex 메서드를 통해 동일한 아이디 없을경우 -1을 리턴
		// 동일한 아이디가 존재할 경우 index값을 반환한다.
		if (per.getMoney() <= 0) {// 만약 입력받은 돈이 영보다 작으면 throw
			throw new MoneyException("입금액이 0원 이하입니다.");
		}
		if (i != -1) {// index값이 -1이 아니면 throw
			throw new IdException("동일한 ID가 존재하여 추가할수없습니다.");
		}
		list.add(per);// 위의 조건이 모두 반족하지 않을경우 list.add로 추가한다.
	}

	public void printAll() {// 출력한다.
		for (int i = 0; i < list.size(); i++) {
			PersonVO per = (PersonVO) list.get(i);
			System.out.println(list.get(i));
		}
	}

	public void deposit(String id, int money) throws IdException, MoneyException {
		int i = findIndex(id);
		if (i != -1) {// 만약 찾는 사람이 존재한다면(index값이 -1이 아니라면) 아래의 내용을 수행한다.
			PersonVO per = (PersonVO) list.get(i);
			if (money <= 0) // 찾고자 하는돈이 0보다 작으면 throw
				throw new MoneyException("입금액이 0원 이하입니다.");
			if (money > 0) // 입력받은 돈이 0보다 크면 기존의 돈과 합해서 저장한다.
				per.setMoney(money + per.getMoney());
			// 입금하는 돈을 포함 하여 저장
		}
		if (i == -1) // 만약 index가 -1이라면 동일한 아이다가 없으로 throw
			throw new IdException("ID가 존재하지 않습니다.");
	}

	public void withdraw(String id, int money) throws MoneyException, IdException {
		int i = findIndex(id);
		if (i != -1) {// 만약 동일한 아이디가 없다면(-1이 아니라면) 아래의 내용을 수행한다.
			PersonVO per = (PersonVO) list.get(i);
			if (per.getMoney() >= money) {
				// 출금하려는 돈이 기존의 계좌에 존재하는 돈보다 적은경우
				per.setMoney(per.getMoney() - money);
				// 출금하고 남은 금액 저장
			}
			if (money <= 0) // 입금액이 0원인경우
				throw new MoneyException("입금액이 0원 이하입니다.");
		}
		if (i == -1) // 입력받은 id 를 findIndex 메서드를 통해 동일한 아이디 없을경우 -1을 리턴
			throw new IdException("ID가 존재하지 않습니다.");
	}

	public void deleteAccount(String id) throws IdException {
		int i = findIndex(id);
		// 입력받은 id 를 findIndex 메서드를 통해 동일한 아이디 없을경우 -1을 리턴
		// 동일한 아이디가 존재할 경우 index값을 반환한다.
		if (i != -1)
			list.remove(i);// 동일한 아이디가 있을경우 -1을 리턴
		else // 동일한 아이디가 없을경우 throw
			throw new IdException("ID가 존재 하지 않습니다.");
	}

	public PersonVO findAccount(String id) throws IdException {
		int i = findIndex(id);
		if (i != -1) {// 동일한 아이디가 존재할경우
			PersonVO per = (PersonVO) list.get(i);
			System.out.println(per);
			return per;
		} else {// 동일한 아이디가 없을경우
			throw new IdException("ID가 존재 하지 않습니다.");
		}
	}

	public void updateAccount(String id, PersonVO p) throws IdException, MoneyException {
		if (id.equals(p.getId())) {// 입력받은 아이디와 입력받은 객체가 동일한 아이디가 존재할경우
			int i = findIndex(id);
			if (i == -1) // 동일한 아이디가 존재하지 않을 경우
				throw new IdException("id가 존재 하지 않습니다.");
			if (i != -1) {// 동일한 아이다가 존재할경우
				PersonVO per = (PersonVO) list.get(i);
				if (p.getMoney() == per.getMoney()) {
					// 매개변수인 PersonVO의 아이디와
					// findIndex에서 찾아낸 index가 가르키는 list의 잔액이 동일할경우
					// 주소 입력, 이름 입력
					per.setAddress(p.getAddress());
					per.setName(p.getName());
				} else {// 그렇지 않을경우 잔액을 반환
					throw new MoneyException("잔액이 다릅니다.");
				}
			}
		} else {// 입력받은 아이디와 PesonVO의 아이디가 다를 경우 throw
			throw new IdException("입력id 오류");
		}
	}
}
