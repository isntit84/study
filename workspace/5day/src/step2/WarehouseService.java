package step2;

public class WarehouseService {
	// ��� ������ ���

	public void printAll(ProductVO[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getName() + " " + a[i].getMaker() + " " + a[i].getPrice());
		}
	}

	public int findSum(ProductVO[] b) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i].getPrice();
		}
		return sum;
	}

	public int findAvg(ProductVO[] c) {
		// int sum=0;
		// for(int i=0;i<c.length;i++){
		// sum+=c[i].getPrice();
		// }
		// �� ������ ���ϴ� �޼��� �����ؼ� length�� ������.
		int avg = 0;
		avg = findSum(c) / c.length;
		return avg;
	}

	public void printKind(ProductVO[] d) {
		for (int i = 0; i < d.length; i++)
			if (d[i].getPrice() >= findAvg(d)) {
				System.out.println("��հ����̻� : " + d[i].getName() + " " + d[i].getMaker() + " " + d[i].getPrice());
			}
	}
}