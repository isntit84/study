import java.util.Scanner;

public class Testboard {

	public static void main(String[] args) {
		Board c = new Board();
		Scanner sc = new Scanner(System.in);
		int i;
		boolean flag = true;
		while (flag) {
			System.out.println("1.��� 2. ��ü���� 3. ����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				c.write();
				break;
			case 2:
				c.printAll();
				break;
			case 3:
				flag = false;

			}
		}
	}
}