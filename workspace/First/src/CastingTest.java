
public class CastingTest {

	public static void main(String[] args) {
		int a = 12, b = 13;
		float c = 0;

		c = (a + b) / 2;
		System.out.println("a와 b의 평균은 " + c + " 이다.");

		float d = 12.5f;

		// 강제형변환. f의 타입을 int로 변환
		a = (int) d;
		System.out.println("a= " + a);
	}

}
