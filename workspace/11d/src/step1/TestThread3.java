package step1;

class Worker1 extends Thread {
	// �θ�Ŭ������ Thread �����ڿ� ������ �̸��� �޵��� ���� �Ǿ� �����Ƿ�
	// super�� ���� �̸��� setting �Ѵ�.
	// ���� Thread�� getName()�� ���� �̸��� ��ȯ �������ִ�.
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
		Worker1 w = new Worker1("������");
		w.start();
		Worker1 w2 = new Worker1("�ÿ���");
		w2.start();
		System.out.println("main thread ����");
	}

}
