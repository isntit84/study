package step2;

import java.util.Scanner;

public class product {
	String name;
	int Co;
	int price;

	public void input(Scanner sc) {
		System.out.println("��ǰ �̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("��ǰ ��ȣ�� �Է��ϼ��� : ");
		Co = sc.nextInt();
		System.out.println("��ǰ ������ �Է��ϼ��� : ");
		Co = sc.nextInt();
	}

	public void print() {
		System.out.println("��ǰ �̸��� : " + name);
		System.out.println("��ǰ ��ȣ�� : " + Co);
		System.out.println("��ǰ ������ : " + price);
	}
}
