package step6;

import java.util.Scanner;

public class addmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		addr[] a = new addr[10];
		String name, Tel, addres;
		boolean flag = true;
		int c, cnt = 0;
		int i = 0;
		while (flag) {
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");

			c = sc.nextInt();
			switch (c) {
			case 1:
				a[cnt] = new addr();
				System.out.println("�̸� :");
				a[cnt].name = sc.next();
				System.out.println("��ȭ :");
				a[cnt].Tel = sc.next();
				System.out.println("�ּ� :");
				a[cnt].addres = sc.next();
				cnt++;
				break;
			case 2:
				for (i = 0; i < cnt; i++) {
					System.out.println(a[i].name);
					System.out.println(a[i].Tel);
					System.out.println(a[i].addres);
				}
				break;
			case 3:
				flag = false;
				break;
			}

		}
	}
}
