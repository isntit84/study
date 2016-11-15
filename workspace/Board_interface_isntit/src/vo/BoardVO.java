package vo;

public class BoardVO {
	private String id;
	private String title;
	private String content;
	private String num;

	public BoardVO(String id, String title, String content, String num) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", title=" + title + ", content=" + content + ", num=" + num + "]";
	}

}