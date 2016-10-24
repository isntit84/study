package step3;

public class Person {
	private String name;
	private String tel;
	private String address;

	public Person(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String getDetails() {
		return "이름: " + name + " 폰:" + tel + "주소 :" + address;

	}

}
