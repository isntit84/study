package step7;

class Theater implements Runnable {
	private boolean seat = false;

	@Override
	public void run() {
		reserve();
	}

	// synchronized�� ����ϸ� ���� ������ ȯ������ ����ȴ�.
	public synchronized void reserve() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "������ ���� ó�� ����..");
		if (seat == false) {
			System.out.println(name + " ������ ���� ����^^");
			System.out.println();
			try {
				Thread.sleep(500);// 0.5�ʰ� �۾�ó���ҿ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true; // �����Ͽ����Ƿ� true�� ����
		} else {
			System.out.println(name + " ������ ���� ����T,T");

		}
	}
}

public class TestSynchronized {

	public static void main(String[] args) {
		// ��ȭ������ �� �����忡�� �����ؾ� �ϹǷ� ���� ��ü�� �ϳ��� �����ϰ�
		// Thread �ΰ��� �����Ͽ����Ѵ�.
		Theater th = new Theater();
		Thread t1 = new Thread(th, "������");
		Thread t2 = new Thread(th, "��ڻ�");
		t1.start();
		t2.start();
	}

}
