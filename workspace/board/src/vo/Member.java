package vo;

import java.io.Serializable;

public class Member implements Serializable {
	private String id;
	private String Contents;

	public Member(String id, String contents) {
		super();
		this.id = id;
		Contents = contents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		Contents = contents;
	}

	@Override
	public String toString() {
		 return "Member [Id=" + id + ", Contents=" + Contents + "]";
	}
}