
public class Employee extends Person {
	private String dept;

	public Employee(String tel, String name, String addr, String dept) {
		super(tel, name, addr);
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
		return "dep=" + dept + ",getTel()=" + getTel() + ", getName()=" + getName() + ", getAddress()=" + getAddr();
	}
}
