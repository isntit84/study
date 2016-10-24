package step3;

public class Teacher extends Person {
	private String subject;

	Teacher(String name, String tel, String address, String subject) {
		super(name, tel, address);
		this.subject = subject;
	}

	String getDetails() {
		return super.getDetails() + " °ú¸ñ" + subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}