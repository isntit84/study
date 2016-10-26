package step6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("aaa");// 데이터 추가
		a1.add("bbb");
		a1.add(1, "ccc");// 추가할 방 번호
		a1.set(2, "fff");// 수정
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(i + "번째 요소:" + a1.get(i));// get()데이터 가져오기
		}
		System.out.println("검색할 값을 입력하라");
		String srh = sc.next();
		int idx = 0;
		if (a1.contains(srh)) // 리스트에 포함된 데이터 검색
		{
			idx = a1.indexOf(srh);// 데이터 위치값
			System.out.println(idx + "위치에서" + a1.get(idx) + "검색");

		} else {
			System.out.println("찾는 값이 없다");
		}
		System.out.println("삭제할 값을 입력하라");
		srh = sc.next();
		idx = 0;
		if (a1.contains(srh)) {
			idx = a1.indexOf(srh);
			a1.remove(idx);
		} else {
			System.out.println("해당 값이 없다");
		}
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(i + "번째 요소:" + a1.get(i));
		}
		System.out.println("전체 삭제");
		a1.removeAll(a1);
		if (a1.isEmpty()) {
			System.out.println("리스트가 비었다");
		} else {
			for (int i = 0; i < a1.size(); i++) {
				System.out.println(i + "번째 요소:" + a1.get(i));
			}
		}
	}
}
