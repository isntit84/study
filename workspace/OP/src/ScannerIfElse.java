import java.util.Scanner;

public class ScannerIfElse {

	public static void main(String[] args) {
		// int a, b, max = 0;
		//
		// Scanner sc = new Scanner(System.in);
		// System.out.println("0���� ū���� �Է�:");
		// a = sc.nextInt();
		// b = sc.nextInt();
		//
		// if (max < a)
		// max = a;
		// if (max < b)
		// max = b;
		// System.out.println(max);

//		 int a, b, c, max = 0;
//		
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("0���� ū���� �Է�:");
//		 a = sc.nextInt();
//		
//		 if (a >= 0) {
//		 System.out.println(a);
//		 } else if (a < 0) {
//		 System.out.println(a * -1);
//		 }}}
		
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� �Է�:");
		a = sc.nextInt();

		if (90 <= a && a <= 100) {
			System.out.println("��");
		}

		else if (80 <= a && a <= 90) {
			System.out.println("��");
		} else if (70 <= a && a <= 80) {
			System.out.println("��");
		} else if (60 <= a && a <= 70) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
