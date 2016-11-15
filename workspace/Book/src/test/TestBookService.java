package test;

import java.util.Scanner;

import service.BookService;
import vo.BookVO;


public class TestBookService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id;
		String author;
		String title;
		String publisher;
		int price;
		
		boolean flag = true;
		int i = 0;
		BookService service = new BookService();
		
		while(flag){
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5. 전체출력 6. 종료");
			i=sc.nextInt();
			switch(i){
			case 1:
				System.out.println("아이디를 입력하세요 :");
				id = sc.next();
				System.out.println("저자를 입력하세요 :");
				author = sc.next();
				System.out.println("제목을 입력하세요 :");
				title = sc.next();
				System.out.println("판매자를 입력하세요 :");
				publisher = sc.next();
				System.out.println("가격을 입력하세요 :");
				price = sc.nextInt();
				service.addBookVO(new BookVO(id, author, title, publisher, price));
				break;
				
			case 2:
				System.out.println("아이디를 입력하세요 :");
				id = sc.next();
				BookVO m = service.findBookVO(id);

				System.out.println(m);
				break;

			case 3:
				System.out.println("수정될 id를 입력하세요 : ");
				id = sc.next();
				System.out.println("수정될 저자를 입력하세요 :");
				author = sc.next();
				System.out.println("수정될 제목을 입력하세요 :");
				title = sc.next();
				System.out.println("수정될 판매자를 입력하세요 :");
				publisher = sc.next();
				System.out.println("수정될 가격을 입력하세요 :");
				price = sc.nextInt();
				BookVO m2 = new BookVO(id, author, title, publisher, price);
				service.updateBookVO(m2);
				break;

			case 4:
				System.out.println("삭제할 id를 입력하세요 : ");
				id = sc.next();
				service.deleteBookVO(id);
				break;

			case 5:
				service.printAll();
				break;
			case 6:
				flag = false;
				break;

			default:
				System.out.println("잘못 입력했어요 다시 입력하세요 ");
			}

		}

	}

}
