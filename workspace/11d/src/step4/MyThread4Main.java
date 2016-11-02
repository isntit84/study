package step4;

public class MyThread4Main {

	public static void main(String[] args) {
		MyThread4 runa1 = new MyThread4();
		MyThread5 runa2 = new MyThread5();

		Thread thread1 = new Thread(runa1);
		Thread thread2 = new Thread(runa2);

		thread1.start();
		thread2.start();
	}

}
