package vo;

public class StuMember extends Member {
	private String stuId;

	public StuMember(String id, String contents, String stuId) {
		super(id, contents);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "StuMember [stuId=" + stuId + "getId()="+getId()+", getContents()="+getContents()+"]";
	}

}
