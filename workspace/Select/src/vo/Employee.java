package vo;

public class Employee extends Member {
	private String job;

	public Employee(String id, String name, String tel, String addr, int type, String job) {
		super(id, name, tel, addr, type);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", type=" + type + ", job"+job+ "]";
	}


}
