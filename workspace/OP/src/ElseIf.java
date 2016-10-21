
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하라");
		jumsu = sc.nextInt();
		if (jumsu >= 90) {
			System.out.println("성적은A 입니다.");
		} else if (jumsu >= 80) {
			System.out.println("성적은B 입니다.");
		} else if (jumsu >= 70) {
			System.out.println("성적은C 입니다.");
		} else if (jumsu >= 60) {
			System.out.println("성적은D 입니다.");
		} else {
			System.out.println("성적은F 입니다.");
		}
	}
}
