import java.util.Scanner;
// 3개의 입력값중 중간수를 구하시오  
public class ExMideInt {

	public static void main(String[] args) {
		int a, b, c, min = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("세개의 숫자를 입력하시오:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

//		if (a < b && a < c) {
//			System.out.println(a);
//		} else if (b < a && b < c) {
//			System.out.println(b);
//		} else {
//			System.out.println(c);
		
		if (a < b && a > c) {
			System.out.println(a);
		} else if (b < a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
