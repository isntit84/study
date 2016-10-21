package step3;

public class MemberVO { // value object
	private String id; // 필수적
	private String password; // 필수적
	private String job; // 선택적 source construct using field
	// 인자값(매개변수 ) 두개를 명시

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