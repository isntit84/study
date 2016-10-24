package step1;

public class TestPerson {

	public static void main(String[] args) {

		// Person 객체 생성
		Person p = new Person();

		// study() 호출 - 자바 공부하다
		p.study("자바");
		p.study("jsp");
		System.out.println("main 종료");

		//// 메서드 호출시 데이터 타입에 맞게 인자값 전달 -->"7"문자 인식, 7 정수로 인식
		p.wake(7);
		// 차돌박이 4인분 먹다
		// 메서드 인자 값의 순서 타입 개수에 맞게 호출
		p.eat("차돌박이", 4);
		// 2,4,->6
		p.plus(2, 4);
		// 리턴값이 있는 메서드 호출
		String str = p.play();// 리턴된 값을 str에 저장
		System.out.println("리턴 결과 : " + str);
		String result = p.order(5000);
		System.out.println("주문 결과 : " + result);
		int r = p.minus(4, 2);
		System.out.println("빼기 연산 : " + r);
		int r1 = p.minus(6, 3);
		System.out.println("빼기 연산 : " + r1);

	}

}
