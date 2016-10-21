package step1;

import java.util.Random;

public class TestLotto {

//	public static void main(String[] args) {
//		int lotto[] = new int[6];
//		Random r = new Random();
//		// 로또번호 생성 (중복요소를 검사)
//		// int j=r.nextInt(45);
//		int num;
//		for (int i = 0; i < lotto.length; i++) {
//			num = r.nextInt(45) + 1;
//			// for 중복 검사후 중복되면 다시 nextInt()수행해 검사
//			// k<i 현재 추가된 로또 배열 요소와 현재 생성한 num을 비교하기 위한 코드
//			for (int k = 0; k < i; k++) {
//				// 배열 요소와 생성한 num이 같은지 비교
//				if (lotto[k] == num) {
//					// 다시 번호 생성
//					// 처음부터 다시 비교해야 함(다시 for 수행)
//					num = r.nextInt(45) + 1;
//					k = -1;  // 배열에 공간에서 데이터만 빼낸다
//				}
//				/*
//				 * lotto[i]=num; }
//				 */
//			}
//			lotto[i] = num;
//		} // for
//			// 로또번호 생성 후 배열 요소를 출력
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