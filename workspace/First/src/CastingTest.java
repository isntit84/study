
public class CastingTest {

	public static void main(String[] args) {
		int a = 12, b = 13;
		float c = 0;

		c = (a + b) / 2;
		System.out.println("a�� b�� ����� " + c + " �̴�.");

		float d = 12.5f;

		// ��������ȯ. f�� Ÿ���� int�� ��ȯ
		a = (int) d;
		System.out.println("a= " + a);
	}

}
