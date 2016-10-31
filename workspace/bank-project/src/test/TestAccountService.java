package test;

import exception.IdException;
import exception.MoneyException;
import service.AccountService;
import vo.PersonVO;

public class TestAccountService {

	public static void main(String[] args) {
		AccountService service = new AccountService();
		// ���� ����
		try {
			service.addPerson(new PersonVO("a", "������", "�ּ�", 1000));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		try {
			service.addPerson(new PersonVO("a", "������", "�ּ�", 1000));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		try {
			service.addPerson(new PersonVO("b", "����", " ����", 100));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());

		}
		try {
			service.addPerson(new PersonVO("c", "����", " �Ҽ�", 150));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		service.printAll();

		// �Ա�
		System.out.println("*********Deposit*********");
		try {
			service.deposit("c", 0);
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}
		service.printAll();

		System.out.println("*******************");
		// ���
		try {
			service.withdraw("a", 1000);
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}
		service.printAll();
		System.out.println("**************");

		// ���� Search
		try {
			service.findAccount("b");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("**************");

		// ���� ����
		try {
			service.deleteAccount("b");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		}
		service.printAll();
		System.out.println("**********");

		// ������Ʈ
		try {
			service.updateAccount("c", new PersonVO("c", "������", " ����", 150));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		service.printAll();

	}// main

}// class
