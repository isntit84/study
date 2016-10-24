package step3;

public class Employee extends Person {
	private String dept;

	public Employee(String name, String tel, String address, String dept) {
		super(name, tel, address);
		this.dept = dept;
	}

	public Employee(String name, String tel, String address) {
		super(name, tel, address);
		// TODO Auto-generated constructor stub
	}

	String getDetails() {
		return super.getDetails() + " " + dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}