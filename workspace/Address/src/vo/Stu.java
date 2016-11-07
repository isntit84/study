package vo;

public class Stu extends Address {
	private String id;

	public Stu(String name, String tel, String address, String id) {
		super(name, tel, address);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// return "Stu [id=" + id + "]";
		return "Stu [id=" + id + "getName=" + getName() + "getTel=" + getTel() + "getAddress=" + getAddress() + "]";
	}

}