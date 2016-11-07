import java.util.Scanner;

public class Testboard {

	public static void main(String[] args) {
		Board c = new Board();
		Scanner sc = new Scanner(System.in);
		int i;
		boolean flag = true;
		while (flag) {
			System.out.println("1.등록 2. 전체보기 3. 종료");
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