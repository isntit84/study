package vo;

import java.io.Serializable;

public class Member implements Serializable{

	private String id;
	private String contents;
	public Member(String id, String contents) {
		super();
		this.id = id;
		this.contents = contents;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", contents=" + contents + "]";
	}
	
	
	
}