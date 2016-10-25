package school;

public class Teacher {
	private String subjects;

	public Teacher(String subjects) {
		super();
		this.subjects = subjects;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return super.toString() + "Teacher [subjects=" + subjects + "]";
	}

}
