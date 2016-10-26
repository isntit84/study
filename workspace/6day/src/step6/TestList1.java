package step6;

import java.util.ArrayList;

public class TestList1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("아이유");
		list.add("보아");
		list.add("아이유");
		System.out.println(list.size());// 3
		System.out.println(list);// 왜 list의 주소값이 아닌 내용값이 나오는가?
		// toString()메소드가 list에서 오버라이딩 되어져있다. 그러므로 요소가 출력된다.
		System.out.println(list.get(0));

		System.out.println(list);

		list.remove(2); // 배열값 2를 삭제한다
		System.out.println(list);
		// for 문을 이용하여 list의 모든 요소를 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // for
	}// main

}// class
