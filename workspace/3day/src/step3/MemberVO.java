package step3;

public class MemberVO { // value object
	private String id; // �ʼ���
	private String password; // �ʼ���
	private String job; // ������ source construct using field
	// ���ڰ�(�Ű����� ) �ΰ��� ���

	public MemberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}