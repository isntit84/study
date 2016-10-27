package test;

import service.ProductService;
import vo.ProductVO;

public class TestProductService {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		service.addProductVO(new ProductVO("111", "손연재", "java", "100"));
		service.addProductVO(new ProductVO("222", "김연아", "oracle", "200"));
		service.addProductVO(new ProductVO("333", "홍명보", "JSP", "300"));
		service.addProductVO(new ProductVO("444", "이청용", "Ajax", "400"));
		service.addProductVO(new ProductVO("555", "박지성", "Spring", "500"));
		service.printAll();

		ProductVO vo = service.findProductVO("111");

		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("회원이 아닙니다.");

		service.deleteProductVO("444");
		service.printAll();

		boolean result = service.updateProductVO(new ProductVO("666", "류현진", "Jquery", "600"));
		if (result)
			System.out.println("수정완료");
		else
			System.out.println("상품이 없어서 수정불가");
		service.printAll();
	}
}