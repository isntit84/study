
public class DoWhile1 {

	public static void main(String[] args) {
		// int a = 1; // 1~3 출력
		// do {
		// System.out.println(a);
		// a++;
		// } while (a <= 3);
		// }
		// }

		// int n = 0; // 1~10 출력
		// do {
		// n = n + 1;
		// System.out.println(n);
		// } while (n < 10);
		// }
		// }

		int n = 0; // 1부터 10까지 2배수 짝수만 출력
		do {
			n = n + 1;
			System.out.println(2 * n);
		} while (n < 10);
	}
}
// N=0 //짝수
// N=N+1
// (2*N)
//
// n=0 //홀수
// n=n+1
// (2*n-1)
//
// a%b=0 //나머지가 영
