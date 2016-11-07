package step2;

import java.io.Serializable;

public class Person implements Serializable {
	// transient : 직렬화 대상에서 제외시키는 제어자(usage modifier)
	private String name;
	private transient String password;
	private String address;

	public Person(String name, String password, String address) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
