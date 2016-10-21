package step7;

public class TestMyDate {

	public static void main(String[] args) {
		// 
		MyDate date = new MyDate(1, 2, 2000);
		System.out.println(date.getDay());// 1
		System.out.println(date.getMonth());// 2
		System.out.println(date.getYear());// 2000
		// 변수 생성시 set, get 메서드
		System.out.println("기본생성자 호출하여 객체생성");
		MyDate d1 = new MyDate();
		System.out.println(date.getDay());// 3
		System.out.println(date.getMonth());// 3
		System.out.println(date.getYear());// 1999
	}

}
