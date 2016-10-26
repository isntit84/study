package step2;

public class MyImplements implements MyInterface1, MyInterface2 {

	@Override
	public void mul() {

		int i, result = 1;
		for (i = 2; i < MAX; i++) {
			result *= 1;
		}
		System.out.println("mul()의 구현결과 = " + result);
	}

	@Override
	public int add() {
		int i, sum = 0;
		for (i = 2; i < SIZE; i++) {
			sum += 1;

		}
		return sum;
	}
}
