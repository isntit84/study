package Diary;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Cont {
	public String date;

	public void write() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> v = new ArrayList<String>();

		Calendar c = Calendar.getInstance();

		FileWriter fos = null;

		System.out.println("1.오늘 2. 지난날");
		int a = sc.nextInt();
		int y = 0, m = 0, dd = 0;
		if (a == 1) {

			{
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MONTH) + 1;// 달 0부터 시작을 하기때문에 +1을 해주었다.
				dd = c.get(Calendar.DATE);
				date = y + "년" + m + "월" + dd + "일";
				System.out.println(date);
			}

			date = y + "년" + m + "월" + dd + "일";

			System.out.println(date);
		} else {
			System.out.println("날짜를 입력하라. 예)0년0월0일");
			date = sc.next();
		}

		v.add(date);
		System.out.println("내용");

		while (true) {
			String x = null;
			x = sc.next();
			if (x.equals("끝"))
				break;
			v.add(x);
		}
		File f = new File("MyDiary");
		if (!f.exists())
			f.mkdir();
		try {
			fos = new FileWriter("././MyDiary/" + date + ".txt");
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

	public void read() {
		File f = new File("MyDiary");
		File[] fs = f.listFiles();
		String date;
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("일기목록");
		for (int i = 0; i < fs.length; i++) {
			System.out.print(fs[i].getName());
		}
		System.out.println("원하는 날짜를 입력하시오");
		date = sc.next();
		try {
			fr = new FileReader("././MyDiary/" + date + ".txt");
			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}