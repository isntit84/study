package step2;

public class TestArray4 {

	public static void main(String[] args) {
		// ������ �����͸� ��� �迭�� ����, ����, �Ҵ��� ���ÿ�
		ProductVO pvo[] = { new ProductVO("������", 100, "����"), new ProductVO("������", 200, "�Ｚ"),
				new ProductVO("�ؼ���", 300, "�Ｚ") };
		WarehouseService service = new WarehouseService();
		service.printAll(pvo);// ProductVO 3�� ��� ����
		// ��Ʈ ProductVO[]--> data type
		int sum = service.findSum(pvo);
		System.out.println("��ǰ�Ѿ� : " + sum);
		int avg = service.findAvg(pvo);
		System.out.println("��ǰ ��� ���� : " + avg);
		// ��ǰ���� ��ü ��հ��� �̻��� ��ǰ ������ ���
		service.printKind(pvo);

	}

}
