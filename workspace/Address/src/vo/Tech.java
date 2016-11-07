package vo;

public class Tech extends Address {
	private String subject;

	public Tech(String name, String tel, String address, String subject) {
		super(name, tel, address);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Tech [subject=" + subject + "getName=" + getName() + "getTel=" + getTel() + "getAddress=" + getAddress()+ "]";
	}

}