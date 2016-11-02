package step4;

public class MyThread4 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ",");

		}
	}

}

class MyThread5 implements Runnable {
	@Override
	public void run() {
		for (char i = 'a'; i < 'z'; i++) {
			System.out.println(i + ",");
		}
	}
}
