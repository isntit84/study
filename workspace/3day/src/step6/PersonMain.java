package step6;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person p1 = null;

		String name;
		String tel;
		String addr;
		int i;
		boolean flag = true;

		while (flag) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");

			i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("이름,전화,주소를 입력하세요:");
				name = sc.next();
				tel = sc.next();
				addr = sc.next();
				Person p = new Person(name, tel, addr);
				p1 = p;
				break;
			case 2:
				System.out.println(p1.getName());
				System.out.println(p1.getAddr());
				System.out.println(p1.getTel());
				break;
			case 3:
				flag = false;
				break;

			}
		}
	}
}