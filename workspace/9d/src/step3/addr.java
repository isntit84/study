package step3;

import java.io.FileWriter;
import java.io.IOException;

public class addr {
	private String name;
	private String pnum;
	private String addr;

	public addr(String name, String pnum, String addr) {
		super();
		this.name = name;
		this.pnum = pnum;
		this.addr = addr;
	}

	public void save() throws IOException {
		FileWriter fos = new FileWriter("addr.txt", true);

		String data = "이    름 : " + name + "\n전화번호 : " + pnum + "\n주     소 : " + addr + "\n";
		fos.write(data);
		fos.close();
	}

	public void print() {
		System.out.println("이     름 : " + name);
		System.out.println("전화 번호 : " + pnum);
		System.out.println("주     소 : " + addr);
	}

	public void modify(String name, String pnum, String addr) {
		this.name = name;
		this.pnum = pnum;
		this.addr = addr;
	}

	public String search() {
		return name;
	}
}