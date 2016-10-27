package service;

import java.util.ArrayList;

import vo.ProductVO;

public class ProductService {

	private ArrayList<ProductVO> list = new ArrayList<ProductVO>();

	public void addProductVO(ProductVO productVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			ProductVO Pro = (ProductVO) list.get(i);
			if (productVO.equals(Pro.getId()))
				flag = true;
			break;
		}

		if (flag == false)
			list.add(productVO);
		else
			System.out.println("이미 등록된 아이디입니다.");
	}

	public void printAll() {
		System.out.println(list);
	}

	public ProductVO findProductVO(String id) {
		ProductVO pro = null;
		for (int i = 0; i < list.size(); i++) {
			ProductVO pro1 = (ProductVO) list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;
	}

	public void deleteProductVO(String id) {
		for (int i = 0; i < list.size(); i++) {
			ProductVO pro1 = (ProductVO) list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);

			}
		}
	}

	public boolean updateProductVO(ProductVO productVO) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			ProductVO Pro = (ProductVO) list.get(i);
			if (Pro.getId().equals(productVO.getId())) {
				list.set(i, productVO);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
// addProductVO
// printAll()
// ProductVO findProductVO()
// deleteProductVO()
// updaterProductVO()
