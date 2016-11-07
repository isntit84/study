package vo;

public class Emp extends Address {
	private String dept;

	public Emp(String name, String tel, String address, String dept) {
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
//		return "Emp [dept=" + dept + "]";
//	}

	 return "Emp [dept=" + dept + "getName="+getName()+ "getTel="+getTel()+"getAddress="+getAddress()+"]";
	}
}
