package step2;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {

		// 파일을 생성하고 데이터를 쓰는 프로그램
		try {// FileWriter에서 throw해준다
				// 직접 장치에 연결되는 노드 스트림생성
				// 파일이 없으면 파일을 생성하는 기능 존재
				// FileWriter fw=new FileWriter("c:\\java-kosta\\output4.txt");
				// //내용이 누적 안됨
			FileWriter fw = new FileWriter("c:\\java-kosta\\output4.txt", true);// 내용이 누적됨
			// 노드에 접속 실패시(실행되지 않으면) 굳이 실행될 필요없다.
			// 트랜젠션:작업단위->여기서는 try은 자체가 하나의 작업단위
			// 부가 기능을 가진 프로세서 스트림을 생성(한라인씩 데이터를 기록)
			// 프로세스 스트림을 생성할 때 위위 노드스트림을 인자값으로 넣어 연결한다.(fw 넣어준다.)
			// true: autoflush 자동으로 데이터를 바로 출력
			// 만약PrintWriter pw=new PrintWriter(fw); 일경우에는 pw.flush(); 나 pw.close();가 필요하다.
			PrintWriter pw = new PrintWriter(fw, true);
			pw.println("크리스탈");
			// pw.flush();//데이터를 출력->pw.close(); 안해도 데이터 나온다.//실시간 데이터를
			// 보낼경우사용한다.(ex)채팅)

			System.out.println("데이터를 기록");
			pw.close();// 작업완료(항상해주어야된다. 안해주면 데이터 기록이 안된다. 또한 이동 및 삭제 등이 안된다.
			// 버퍼에 임시로 기억하고 있다가 종료시 데이터를 한번에 뿌려서 기록하낟.
			// 종료시 pw.flush();가 수행된다.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
