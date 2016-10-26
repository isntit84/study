//x
class Employee {
	private String empNo;
	private String eName;

	public Employee(String empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDetails() {
		return "empNo:" + empNo + "eName:" + eName;

	}
}

class Manager extends Employee {
	private String dept;

	Manager(String empNo, String eName, String dept) {
		super(empNo, eName);
		this.dept = dept;
	}

	// �޼��� �������̵�
	public String getDetails() {
		// return empNo;
		return super.getDetails() + " dept:" + dept;

	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public class TestOverriding2 {
		public static void main(String[] args) {
			Employee e = new Employee("a1", "������");
			System.out.println(e.getDetails());

			Manager m = new Manager("a2", "���뼼", "������");
			System.out.println(m.getDetails());
		}
	}
}