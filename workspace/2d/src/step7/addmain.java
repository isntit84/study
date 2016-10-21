package step7;

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
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");

			c = sc.nextInt();
			switch (c) {
			case 1:
				a[cnt] = new addr();
				a[cnt].Input(sc);
				cnt++;
				break;

			case 2:
				for (i = 0; i < cnt; i++) {
					a[i].print();
				}
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
}