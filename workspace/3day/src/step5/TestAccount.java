package step5;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 * ���¸� �����Ͽ� �Ա��� ������ �ܾ��� �����Ǵ� ���� class �� Account variable : balance/
		 * type�� int method : �Ա� deposit(money:int):void �߰� �䱸���� �Աݾ��� 0�� �����̸�
		 * "0�� �����̹Ƿ� �Ա��� �� �����ϴ�"��� �޼����� ����ϰ� balance(�ܾ׿��� ������ ���� �ʴ´�.)
		 */

		Account a = new Account();
		a.deposit(100);
		System.out.println("�ܾ�:" + a.getBalance());// �ܾ� 100
		a.deposit(-1);// 0�� �����̹Ƿ� �Ա��� �� �����ϴ�.
		System.out.println("�ܾ�:" + a.getBalance());// �ܾ� 100
		a.deposit(400);
		System.out.println("�ܾ�:" + a.getBalance());// �ܾ� 500

	}

}
