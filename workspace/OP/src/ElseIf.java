
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu = sc.nextInt();
		if (jumsu >= 90) {
			System.out.println("������A �Դϴ�.");
		} else if (jumsu >= 80) {
			System.out.println("������B �Դϴ�.");
		} else if (jumsu >= 70) {
			System.out.println("������C �Դϴ�.");
		} else if (jumsu >= 60) {
			System.out.println("������D �Դϴ�.");
		} else {
			System.out.println("������F �Դϴ�.");
		}
	}
}
