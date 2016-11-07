package step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException { // throws IOEception 처리하지 않으면 나오는 오류(unhandled exception type ioexception)
		File file = new File("C:\\java-kosta/fileTest.txt");
		if (!file.exists()) // 똑같은 파일이 존재하지 않을 경우
		{
			System.out.println("파일을 생성합니다.");
			file.createNewFile();// 파일 생성
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		int ch;
		String path = file.getPath();//경로를 읽어오는 메서드
		System.out.println("path:" + path);
		if (file.canWrite()) {
			System.out.println("쓰기 가능 파일");
			bw.write("hello\n");
			bw.flush(); // bw를 비어내다
		}
		if (file.canRead()) {
			System.out.println("읽기 가능 파일");
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
		}
		if (file.canExecute()) { // 실행파일인지
			System.out.println("실행 가능 파일");
		}
		if (file.isFile()) { // 파일인지
			System.out.println("파일 입니다.");
		}
		if (file.isHidden()) { // 숨김파일인지
			System.out.println("숨김 속성");
		}
		long size = file.length();
		System.out.println("파일크기:" + size);
		System.out.println(path + " 파일을 삭제한다.");
		file.delete();

		File dir = new File("C:\\java-kosta/files");
		if (!dir.exists()) {
			System.out.println("디렉토리 생성");
			dir.mkdir();// 폴더 생성
		}

		String[] fileNames = dir.list(); // 파일목록
		System.out.println("파일목록");
		for (ch = 0; ch < fileNames.length; ch++) {
			System.out.println(fileNames[ch]);
		}
		br.close();
		bw.close();

	}
}
