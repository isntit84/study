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
			System.out.println("1.입    력");
			System.out.println("2.전체출력");
			System.out.println("3.수    정");
			System.out.println("4.검    색");
			System.out.println("5.저    장");
			System.out.println("6.종    료");
			System.out.println("==========");
			System.out.println();
			System.out.println("번호를 입력하시요 : ");
			munu = sc.nextInt();
			System.out.println();

			switch (munu) {
			case 1: //
				System.out.println("이름:");
				name = sc.next();
				System.out.println("전화번호");
				pnum = sc.next();
				System.out.println("주  소:");
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
				System.out.print("수정할 이름을 입력하세요");
				name = sc.next();
				no = 0;
				while (no < adnu) {
					if (ad[no].search().equals(name)) {
						System.out.print("이름 :");
						name = sc.next();
						System.out.print("전화번호:");
						pnum = sc.next();
						System.out.print("주소:");
						addr = sc.next();

						ad[no].modify(name, pnum, addr);
						break;

					}
					System.out.println("수정할 이름이 없습니다. 다시 입력해 주세요");
					no++;

					

				}

				break;

			case 4:
				System.out.print("검색할 이름을 입력하세요");
				name = sc.next();
				System.out.println();
				no = 0;
				while (no < adnu) {
					if (ad[no].search().equals(name)) {
						if (ad[no].search().equals(name))
							ad[no].print();
						System.out.println();
					}
					System.out.println("찾으시는 이름이 없습니다.. 다시 입력해 주세요");
					no++;
					
				}

				break;

			case 5:
				no = 0;
				while (no < adnu) {
					ad[no].save();
					System.out.println("저장되었습니다.");
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
