package product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;

		while (flag) {
			System.out.println("1.��ǰ���� 2.��ǰ��� 3.��ǰ�˻� 4.��ǰ�ֹ� 5.�ֹ����� 6.����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				p.ProductInsert();
				break;

			case 2:
				p.Productprint();
				break;

			case 3:
				System.out.println("�˻��� ��ǰ��ȣ �Է�:");
				int productId=sc.nextInt();
				p.Productsearch(productId);
				break;

			case 4:
				p.order();
				break;

			case 5:
				p.print_ord();
				break;

			case 6:
				flag = false;
				break;

			default:
				System.out.println("�߸��Է�");
			}
		}
	}
}
