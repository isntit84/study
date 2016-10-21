
public class Star {

	public static void main(String[] args) {
		// int a;
		// int b;
		// for (a = 0; a < 3; a++) {
		// for (b = 0; b < 5; b++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// }
		// }

		// int a;
		// int b;
		//
		// for (a = 0; a < 5; a++) {
		// for (b = 0; b < a; b++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// }
		// }
		// *
		// **
		// ***
		// ****

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
///// *
//// **
/// ***
// ****

// int a;
// int b;
//
// for (a = 0; a <= 5; a++) {
// for (b = 0; b < a; b++) {
// System.out.print("*");
// }
// System.out.println();
// ???
//// 1
/// 111
// 11111