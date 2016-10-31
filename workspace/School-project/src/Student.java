
public class Student extends Person {
	private String stuId;

	public Student(String tel, String name, String addr, String stuId) {
		super(tel, name, addr);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "stuId=" + stuId + ",getTel()=" + getTel() + ", getName()=" + getName() + ", getAddress()=" + getAddr();

	}

}