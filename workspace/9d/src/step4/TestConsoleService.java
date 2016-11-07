package step4;

import java.io.IOException;

public class TestConsoleService {

	public static void main(String[] args) {

		ConsoleService service = new ConsoleService();
		try {
			service.order("c:\\java-kosta\\step2\\order.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
