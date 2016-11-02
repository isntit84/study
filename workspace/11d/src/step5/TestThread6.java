package step5;

class ReadWorker implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("서버에서 데이터를 읽는 스레드 .." + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class WriteWorker implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("서버로 데이터를 쓰는 스레드.. " + i);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
			}
		}
	}
}

public class TestThread6 {
	public static void main(String[] args) {
		// ReadWorker의 WriteWorker를 이용해 각각의 스레드 생성후 start()
		ReadWorker worker1 = new ReadWorker();
		Thread t1 = new Thread(worker1);
		Thread t2 = new Thread(new WriteWorker());
		t1.start();
		try {
			t1.join();// t1 스래드 수행 완료시까지 다른 스레드 대기//main 스레드도 대기

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("******main thread 종료******");
	}
}
