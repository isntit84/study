
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		{
			int a, b;
			String c;

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 두개를 입력하시오.");
			a = sc.nextInt();

			b = sc.nextInt();

			System.out.println("연산자를 입력하시오.");
			c = sc.next();

			// if (c.equals("+"))
			// System.out.println(a + b);
			//
			// else if (c.equals("-"))
			// System.out.println(a - b);
			//
			// else if (c.equals("*"))
			// System.out.println(a * b);
			//
			// else if (c.equals("/"))
			// System.out.println((float) a / b);
			// }
			//
			// }

			switch (c) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			default:
				System.out.println("연산자를 잘못선택하셨습니다");
				break;
			}
		}
	}
}
