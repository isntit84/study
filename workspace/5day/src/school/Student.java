package school;

public class Student extends MemberVO {
	private String id;

	public Student(String name, String tel, String address, String id) {
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
		return super.toString() + "Student [id=" + id + "]";
	}
}
