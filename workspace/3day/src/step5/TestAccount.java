package step5;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 * 계좌를 개설하여 입금할 땜마다 잔액이 누적되는 예제 class 명 Account variable : balance/
		 * type은 int method : 입금 deposit(money:int):void 추가 요구사항 입금액이 0원 이하이면
		 * "0원 이하이므로 입금할 수 없습니다"라는 메세지를 출력하고 balance(잔액에는 영향을 주지 않는다.)
		 */

		Account a = new Account();
		a.deposit(100);
		System.out.println("잔액:" + a.getBalance());// 잔액 100
		a.deposit(-1);// 0원 이하이므로 입금할 수 없습니다.
		System.out.println("잔액:" + a.getBalance());// 잔액 100
		a.deposit(400);
		System.out.println("잔액:" + a.getBalance());// 잔액 500

	}

}
