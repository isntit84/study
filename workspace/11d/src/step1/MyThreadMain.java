package step1;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread2 thread2 = new MyThread2();

		thread1.start(); // start()°¡ run()È£Ãâ 
		thread2.start();

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i + ",");
		}
		System.out.println();
	}

}


