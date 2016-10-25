package step2;

public class TestArray4 {

	public static void main(String[] args) {
		// 참조형 데이터를 담는 배열의 선언, 생성, 할당을 동시에
		ProductVO pvo[] = { new ProductVO("아이폰", 100, "애플"), new ProductVO("갤러기", 200, "삼성"),
				new ProductVO("넥서스", 300, "삼성") };
		WarehouseService service = new WarehouseService();
		service.printAll(pvo);// ProductVO 3개 모두 전달
		// 힌트 ProductVO[]--> data type
		int sum = service.findSum(pvo);
		System.out.println("상품총액 : " + sum);
		int avg = service.findAvg(pvo);
		System.out.println("상품 평균 가격 : " + avg);
		// 상품들중 전체 평균가격 이상인 상품 정보만 출력
		service.printKind(pvo);

	}

}
