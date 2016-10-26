package step4_1;

public class TestException2 {

	public static void main(String[] args) {
		String s = null;
		try {// Exception이 발새오딜 것으로 예상되는 코드블럭
			System.out.println(s.length());
			// 위 코드라인에서 Exception 발생되면 바로 catch로
			// Exception 발생 안되면 아래코드라인 수행된다.
			System.out.println("수행??여부확인");
			// jvm이 던진 Exception을 받아서 적절한 대안으로 처리
			// Exception 을 처리
		} catch (NullPointerException ne) {
			System.out.println("null이므로 길이를 구할수없음");
			
			// } catch (Exception ne) { //Exception 예외만 처리하는 기능
			// System.out.println("null이므로 길이를 구할수없음");

		}
		System.out.println("프로그램 정상수행");
	}

}
