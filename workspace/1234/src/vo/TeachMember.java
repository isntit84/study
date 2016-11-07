package vo;

public class TeachMember extends Member {
	
	private String subject;

	public TeachMember(String id, String contents, String subject) {
		super(id, contents);
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
		return "TeachMember [subject=" + subject + ", getId()=" + getId() + ", getContents()=" + getContents() + "]";
	}
	
	

}
