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

		String data = "��    �� : " + name + "\n��ȭ��ȣ : " + pnum + "\n��     �� : " + addr + "\n";
		fos.write(data);
		fos.close();
	}

	public void print() {
		System.out.println("��     �� : " + name);
		System.out.println("��ȭ ��ȣ : " + pnum);
		System.out.println("��     �� : " + addr);
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