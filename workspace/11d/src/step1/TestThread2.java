package step1;

class Worker extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("worker run().." + i);
			// 실행주기를 1초 간격
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestThread2 {
	public static void main(String[] args) {
		Worker w = new Worker();
		w.start();
		System.out.println("main thread 종료!");
	}

}
