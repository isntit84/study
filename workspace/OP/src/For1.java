
public class For1 {

	public static void main(String[] args) {
		// for (int a = 1; a <= 5; a++) {
		// System.out.println(a + ",");

		// int a, sum=0;
		//
		// for (a = 1; a <= 10; a++) {
		// sum+=a;
		// }
		//
		// System.out.println("1부터 10까지 합="+sum);

		// int a, sum=0;
		//
		// for (a = 1; a <= 100; a++) {
		// sum+=a;
		// }
		//
		// System.out.println("1부터 100까지 합="+sum);

		// int a, sum=0;
		//
		// for (a = 2; a <= 100; a+=2) {
		// sum+=a;
		// }
		//
		// System.out.println("1부터 100까지 짝수의 합="+sum);

		// int a, sum=0;
		//
		// for (a = 1; a <= 100; a+=2) {
		// sum+=a;
		// }
		//
		// System.out.println("1부터 100까지 홀수의 합="+sum);

		// System.out.println("no3");
		// for (int i = 1; i < 11; i++) {
		// System.out.println(5 * i + 5 + " ");

		// System.out.println("no4");
		// for (int i = 3; i < 101; i += 4) {
		// System.out.println(i);

		// System.out.println("no4");
		// for (int i = 1; i < 11; i++) {
		// System.out.println(4 * i - 1 + "");

		// 8번부터 100까지 숫자중3의 배수를 출력하고, 3의배수의 갯수를 구하라.
		System.out.println("no8");
		int count = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "  ");
				count++;
			}
		}
		System.out.println("\n3의 배수의 갯수: " + count);
	}
}