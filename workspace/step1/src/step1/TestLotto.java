package step1;

import java.util.Random;

public class TestLotto {

//	public static void main(String[] args) {
//		int lotto[] = new int[6];
//		Random r = new Random();
//		// �ζǹ�ȣ ���� (�ߺ���Ҹ� �˻�)
//		// int j=r.nextInt(45);
//		int num;
//		for (int i = 0; i < lotto.length; i++) {
//			num = r.nextInt(45) + 1;
//			// for �ߺ� �˻��� �ߺ��Ǹ� �ٽ� nextInt()������ �˻�
//			// k<i ���� �߰��� �ζ� �迭 ��ҿ� ���� ������ num�� ���ϱ� ���� �ڵ�
//			for (int k = 0; k < i; k++) {
//				// �迭 ��ҿ� ������ num�� ������ ��
//				if (lotto[k] == num) {
//					// �ٽ� ��ȣ ����
//					// ó������ �ٽ� ���ؾ� ��(�ٽ� for ����)
//					num = r.nextInt(45) + 1;
//					k = -1;  // �迭�� �������� �����͸� ������
//				}
//				/*
//				 * lotto[i]=num; }
//				 */
//			}
//			lotto[i] = num;
//		} // for
//			// �ζǹ�ȣ ���� �� �迭 ��Ҹ� ���
//		for (
//
//		int i = 0; i < lotto.length; i++)
//
//		{
//			System.out.println(lotto[i] + "\t");
//		} // for
//	}// main
//
//}

	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random();

		int num;
		for (int i = 0; i < lotto.length; i++) {
			num = r.nextInt(45) + 1;

			for (int k = 0; k < i; k++) {

				if (lotto[k] == num) {
					num = r.nextInt(45) + 1;
					k = -1;
				}
			}
			lotto[i] = num;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + "\t");
		}
	}
}