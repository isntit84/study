package test;

import service.ProductService;
import vo.ProductVO;

public class TestProductService {

	public static void main(String[] args) {
		ProductService service = new ProductService();

		service.addProductVO(new ProductVO("111", "�տ���", "java", "100"));
		service.addProductVO(new ProductVO("222", "�迬��", "oracle", "200"));
		service.addProductVO(new ProductVO("333", "ȫ��", "JSP", "300"));
		service.addProductVO(new ProductVO("444", "��û��", "Ajax", "400"));
		service.addProductVO(new ProductVO("555", "������", "Spring", "500"));
		service.printAll();

		ProductVO vo = service.findProductVO("111");

		if (vo != null)
			System.out.println(vo);
		else
			System.out.println("ȸ���� �ƴմϴ�.");

		service.deleteProductVO("444");
		service.printAll();

		boolean result = service.updateProductVO(new ProductVO("666", "������", "Jquery", "600"));
		if (result)
			System.out.println("�����Ϸ�");
		else
			System.out.println("��ǰ�� ��� �����Ұ�");
		service.printAll();
	}
}