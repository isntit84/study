package school;

public class Employee extends MemberVO {
	private String dept;

	public Employee(String name, String tel, String address, String dept) {
		super(name, tel, address);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [dept=" + dept + "]";
	}
}
