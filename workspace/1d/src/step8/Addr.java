package step8;

public class Addr {
	String name;
	String tel;
	String addr;

	boolean search(String name) {
		if (this.name.equals(name))
			return true;
		else
			return false;
	}

	void Input() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	boolean edit(String name, String tel, String addr) {
		boolean f;
		f = search(name);

		if (f == true) {
			this.tel = tel;
			this.addr = addr;
		}
		return f;
	}
}