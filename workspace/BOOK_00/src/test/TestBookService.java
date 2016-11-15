package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BookService;
import vo.Member;

public class TestBookService {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "book.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("북 목록");

		// Scanner sc = new Scanner(System.in);00
		String id;
		String title;
		String author;
		String publisher;
		String price;
		boolean flag = true;
		String i;

		BookService service = new BookService();
		service.loadData(fileName);

		while (flag) {
			System.out.println("1.등록 :");
			System.out.println("2.검색 :");
			System.out.println("3.수정 :");
			System.out.println("4.삭제 :");
			System.out.println("5.전체출력 :");
			System.out.println("6.종료 :");

			// i = sc.nextInt();
			i= br.readLine();

			switch (i) {
			case "1":// 등록
				System.out.println("id를 입력하세요");
				id = br.readLine();
				System.out.println("제목을 입력하세요");
				title = br.readLine();
				System.out.println("작가를 입력하세요");
				author = br.readLine();
				System.out.println("출판사를 입력하세요");
				publisher = br.readLine();
				System.out.println("가격를 입력하세요");
				price = br.readLine();
				service.insert(new Member(id, title, author, publisher, price));
				break;

			case "2":// 검색
				System.out.println("제목을 입력하세요 :");
				id = br.readLine();
				Member m = service.findBookVO(id);
				System.out.println(m);
				break;

			case "3":// 수정
				System.out.println("수정할 id를 입력하세요: ");
				id = br.readLine();
				System.out.println("수정할 제목을 입력하세요: ");
				title = br.readLine();
				System.out.println("수정할 작가를 입력하세요: ");
				author = br.readLine();
				System.out.println("수정할 출판사를 입력하세요: ");
				publisher = br.readLine();
				System.out.println("수정할 가격를 입력하세요: ");
				 price = br.readLine();
				Member m2 = new Member(id, title, author, publisher, price);
				service.updateBookVO(m2);
				break;

			case "4":// 삭제
				System.out.println("삭제할 id를 입력하세요 : ");
				id = br.readLine();
				service.deleteBookVO(id);
				break;

			case "5":// 전체출력
				service.printAll();
				break;

			case "6":// 종료
				flag = false;
				service.saveData(fileName);
				break;

			default:
				System.out.println("잘못 입력했어요 다시 입력하세요");
			}
		}
	}
}