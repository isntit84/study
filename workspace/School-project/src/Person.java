
public class Person {

	private String tel;
	private String name;
	private String addr;

	public Person(String tel, String name, String addr) {
		super();
		this.tel = tel;
		this.name = name;
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [tel=" + tel + ", name=" + name + ", addr=" + addr + "]";
	}
}



