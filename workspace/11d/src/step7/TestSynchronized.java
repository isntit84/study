package step7;

class Theater implements Runnable {
	private boolean seat = false;

	@Override
	public void run() {
		reserve();
	}

	// synchronized를 명시하면 단일 스레드 환경으로 실행된다.
	public synchronized void reserve() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드 예매 처리 시작..");
		if (seat == false) {
			System.out.println(name + " 스레드 예매 성공^^");
			System.out.println();
			try {
				Thread.sleep(500);// 0.5초간 작업처리소요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true; // 예매하였으므로 true로 변경
		} else {
			System.out.println(name + " 스래드 예매 실패T,T");

		}
	}
}

public class TestSynchronized {

	public static void main(String[] args) {
		// 영화정보는 각 스래드에서 공유해야 하므로 극장 객체는 하나만 생성하고
		// Thread 두개에 공유하여야한다.
		Theater th = new Theater();
		Thread t1 = new Thread(th, "소지섭");
		Thread t2 = new Thread(th, "백박사");
		t1.start();
		t2.start();
	}

}
