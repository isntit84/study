import java.io.*;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �Է��ϼ���");
		int input_no = Integer.parseInt(keyboard.readLine());

		if (input_no > 0) {
			System.out.println("0���� Ů�ϴ�.");
		} else {
			if (input_no == 0) {
				System.out.println("0�̱���.");

			} else {
				System.out.println("0���� �۽��ϴ�.");
			}

		}
	}
}
