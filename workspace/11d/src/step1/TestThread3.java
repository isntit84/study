package step1;

class Worker1 extends Thread {
	// 부모클래스인 Thread 생성자에 스레드 이름을 받도록 정의 되어 있으므로
	// super를 통해 이름을 setting 한다.
	// 이후 Thread의 getName()을 통해 이름을 반환 받을수있다.
	Worker1(String name) {
		super(name);

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "worker run.." + i);
		}
	}
}

public class TestThread3 {

	public static void main(String[] args) {
		Worker1 w = new Worker1("소지섭");
		w.start();
		Worker1 w2 = new Worker1("시용태");
		w2.start();
		System.out.println("main thread 종료");
	}

}
