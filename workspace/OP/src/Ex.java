import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		int a, b, c, min = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��Ͻÿ�:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
