import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	public String title;

	public void write() {
		ArrayList<String> v = new ArrayList<String>();
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		// Calendar c = Calendar.getInstance();

		FileWriter fos = null;

		System.out.println("제목");
		// System.out.println("1.오늘 2. 지난날");

		title = sc.next();
		// int a = sc.nextInt();
		// int y = 0, m = 0, dd = 0;
		//
		// if (a == 1) {
		//
		// {
		// title = sc.next();
		// y = c.get(Calendar.YEAR);
		// m = c.get(Calendar.MONTH) + 1;// 달 0부터 시작을 하기때문에 +1을 해주었다.
		// dd = c.get(Calendar.DATE);
		// date = y + "년" + m + "월" + dd + "일";
		// System.out.println(title);
		// }
		//
		// date = y + "년" + m + "월" + dd + "일";
		//
		// System.out.println(title);
		// } else {
		//// System.out.println("날짜를 입력하라. 예)0년0월0일");
		// System.out.println("내용을 입력");
		// title = sc.next();
		// }
		//
		// v.add(title);
		System.out.println("내용");
		service.loadData(fileName);
		while (true) {
			String x = null;
			x = sc.next();
			if (x.equals("끝"))
				System.out.println("새 게시물이 저장되었습니다.");
			break;
			// v.add(x);
		}
		File f = new File("noticeboard");
		if (!f.exists())
			f.mkdir();
		try {
			fos = new FileWriter("././noticeboard/" + title + ".txt");
			for (int i = 0; i < v.size(); i++) {
				fos.write("\n"); // 입력값을 받는다
				fos.write(v.get(i));
			}
			fos.close();
		} catch (Exception e)

		{
			System.out.println(e);
		}
	} // 중괄호"}"가 빠지면 나오는 오류 메세지 -> syntax error, insert "}" to complete block

	public void printAll() {
		File f = new File("noticeboard");
		File[] fs = f.listFiles();
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 목록");
		for (int i = 0; i < fs.length; i++) {
			System.out.print(fs[i].getName()+"\n");
		}
		System.out.println("원하는 게시물을 입력하시오");
		title = sc.next();
		try {
			fr = new FileReader("././noticeboard/" + title + ".txt");
			int i;

			while ((i = fr.read()) != -1) {
				System.out.println((char) i+"/n");
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}