import java.io.*;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수를 입력하세요");
		int input_no = Integer.parseInt(keyboard.readLine());

		if (input_no > 0) {
			System.out.println("0보다 큽니다.");
		} else {
			if (input_no == 0) {
				System.out.println("0이군요.");

			} else {
				System.out.println("0보다 작습니다.");
			}

		}
	}
}
