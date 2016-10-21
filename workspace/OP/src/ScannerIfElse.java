import java.util.Scanner;

public class ScannerIfElse {

	public static void main(String[] args) {
		// int a, b, max = 0;
		//
		// Scanner sc = new Scanner(System.in);
		// System.out.println("0보다 큰수를 입력:");
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
//		 System.out.println("0보다 큰수를 입력:");
//		 a = sc.nextInt();
//		
//		 if (a >= 0) {
//		 System.out.println(a);
//		 } else if (a < 0) {
//		 System.out.println(a * -1);
//		 }}}
		
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("평균점수 입력:");
		a = sc.nextInt();

		if (90 <= a && a <= 100) {
			System.out.println("수");
		}

		else if (80 <= a && a <= 90) {
			System.out.println("우");
		} else if (70 <= a && a <= 80) {
			System.out.println("미");
		} else if (60 <= a && a <= 70) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
