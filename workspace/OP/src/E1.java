
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		{
			int a, b;
			String c;

			Scanner sc = new Scanner(System.in);
			System.out.println("���� �ΰ��� �Է��Ͻÿ�.");
			a = sc.nextInt();

			b = sc.nextInt();

			System.out.println("�����ڸ� �Է��Ͻÿ�.");
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
				System.out.println("�����ڸ� �߸������ϼ̽��ϴ�");
				break;
			}
		}
	}
}
