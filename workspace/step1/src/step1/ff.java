package step1;

public class ff {
	public void main(String[] args) {
		// 9 1 4 -10 5 12 3 99 8 3
		// 배열의 수중 5 이상의 수의 갯수
		int count = 0;
		int[] arr1 = { 9, 1, 4, -10, 5, 12, 3, 99, 8, 3 };
		for (int a = 0; a < arr1.length; a++) {
			if (arr1[a] >= 5) {
				count++;
			} else {
			}
		}
		System.out.println("배열 레퍼런스변수중 5이상의 갯수는=" + count);
	}
}
// if (arr1[a]%2== 5) {
// 짝수는 몇개

// 1~45까지 6자리 로또
