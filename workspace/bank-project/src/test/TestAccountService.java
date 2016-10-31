package test;

import exception.IdException;
import exception.MoneyException;
import service.AccountService;
import vo.PersonVO;

public class TestAccountService {

	public static void main(String[] args) {
		AccountService service = new AccountService();
		// 계좌 개설
		try {
			service.addPerson(new PersonVO("a", "아이유", "주소", 1000));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		try {
			service.addPerson(new PersonVO("a", "아이유", "주소", 1000));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		try {
			service.addPerson(new PersonVO("b", "아유", " 주주", 100));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());

		}
		try {
			service.addPerson(new PersonVO("c", "아이", " 소소", 150));
			System.out.println("add ok!");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}

		service.printAll();

		// 입금
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
		// 출금
		try {
			service.withdraw("a", 1000);
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		} catch (MoneyException me) {
			System.out.println(me.getMessage());
		}
		service.printAll();
		System.out.println("**************");

		// 계좌 Search
		try {
			service.findAccount("b");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("**************");

		// 계좌 삭제
		try {
			service.deleteAccount("b");
		} catch (IdException ie) {
			System.out.println(ie.getMessage());
		}
		service.printAll();
		System.out.println("**********");

		// 업데이트
		try {
			service.updateAccount("c", new PersonVO("c", "아이으", " 소주", 150));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		service.printAll();

	}// main

}// class
