package step3;

import java.io.IOException;
import java.util.Scanner;

class addrMain {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		addr[] ad = new addr[10];

		String name;
		String pnum;
		String addr;
		// addr temp;

		boolean f = true;

		int munu = 0, adnu = 0, no = 0;

		while (f)

		{
			System.out.println("==========");
			System.out.println("1.��    ��");
			System.out.println("2.��ü���");
			System.out.println("3.��    ��");
			System.out.println("4.��    ��");
			System.out.println("5.��    ��");
			System.out.println("6.��    ��");
			System.out.println("==========");
			System.out.println();
			System.out.println("��ȣ�� �Է��Ͻÿ� : ");
			munu = sc.nextInt();
			System.out.println();

			switch (munu) {
			case 1: //
				System.out.println("�̸�:");
				name = sc.next();
				System.out.println("��ȭ��ȣ");
				pnum = sc.next();
				System.out.println("��  ��:");
				addr = sc.next();
				System.out.println();
				ad[adnu] = new addr(name, pnum, addr);

				adnu++;
				break;

			case 2:
				no = 0;
				while (no < adnu) {
					ad[no].print();
					System.out.println();
					no++;
				}
				break;
			case 3://
				System.out.print("������ �̸��� �Է��ϼ���");
				name = sc.next();
				no = 0;
				while (no < adnu) {
					if (ad[no].search().equals(name)) {
						System.out.print("�̸� :");
						name = sc.next();
						System.out.print("��ȭ��ȣ:");
						pnum = sc.next();
						System.out.print("�ּ�:");
						addr = sc.next();

						ad[no].modify(name, pnum, addr);
						break;

					}
					System.out.println("������ �̸��� �����ϴ�. �ٽ� �Է��� �ּ���");
					no++;

					

				}

				break;

			case 4:
				System.out.print("�˻��� �̸��� �Է��ϼ���");
				name = sc.next();
				System.out.println();
				no = 0;
				while (no < adnu) {
					if (ad[no].search().equals(name)) {
						if (ad[no].search().equals(name))
							ad[no].print();
						System.out.println();
					}
					System.out.println("ã���ô� �̸��� �����ϴ�.. �ٽ� �Է��� �ּ���");
					no++;
					
				}

				break;

			case 5:
				no = 0;
				while (no < adnu) {
					ad[no].save();
					System.out.println("����Ǿ����ϴ�.");
					no++;
					
				}

				break;
			case 6:
				f = false;
				break;
			}
		}
	}
}
