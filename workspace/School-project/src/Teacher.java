
public class Teacher extends Person {
	private String subject;

	public Teacher(String tel, String name, String addr, String subject) {
		super(tel, name, addr);
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
		return "subject=" + subject + ",getTel()=" + getTel() + ", getName()=" + getName() + ", getAddress()="+ getAddr();
	}

}