package step2;

import java.util.Scanner;

public class product {
	String name;
	int Co;
	int price;

	public void input(Scanner sc) {
		System.out.println("제품 이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("제품 번호를 입력하세요 : ");
		Co = sc.nextInt();
		System.out.println("제품 가격을 입력하세요 : ");
		Co = sc.nextInt();
	}

	public void print() {
		System.out.println("제품 이름은 : " + name);
		System.out.println("제품 번호은 : " + Co);
		System.out.println("제품 가격은 : " + price);
	}
}
