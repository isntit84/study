package step2;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new ProductVO("아이폰", "애플", 200));
		list.add(new ProductVO("갤럭시", "삼성", 300));
		list.add(new ProductVO("넥서스S", "애플", 400));
		System.out.println("리스트에서 삼성에서 생산한 제품명 출력");

		for (int i = 0; i < list.size(); i++) {
			ProductVO pro = (ProductVO) list.get(i);
			if (pro.getMaker().equals("삼성")) {
				System.out.println(pro.getName());
			}
		}

		System.out.println("list의 전체 상품 평균가격");

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			sum += vo.getPrice();

		}
		System.out.println(sum / list.size());

		System.out.println("지정한 인덱스에 새로운객체 재할당");
		list.set(0, new ProductVO("베개", "sky", 200));
		// 0번째 index에 새로운 객체를 넣겠다
		System.out.println(list);
		System.out.println("리스트 상품명 중 갤로 시작하는 상품정보");
		/*for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			if (vo.getName().startsWith("갤")) {
				System.out.println(vo.toString());
			}
		}*/

		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = (ProductVO) list.get(i);
			if (vo.getName().startsWith("갤")) {
				System.out.println(vo);
			}
		}
	}
}
