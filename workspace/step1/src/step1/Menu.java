package step1;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int i = 0;
		String name[] = new String[3];
		boolean a = true;

		while (a) {
			System.out.println("1.이름입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			number = sc.nextInt();

			switch (number) {
			case 1:
				for (i = 0; i < name.length; i++) {
					System.out.println("1.이름입력:");
					name[i] = sc.next();
				}
				break;
			case 2:
				for (i = 0; i < name.length; i++) {
					System.out.println(name[i]);
				}
				break;
			case 3:
				a = false;
			}
		}
	}
}