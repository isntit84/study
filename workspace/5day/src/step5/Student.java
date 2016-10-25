package step5;

public class Student extends MemberVO {

	private String subjects;

	public Student(int num, String name, String dept, String address, String subjects) {
		super(num, name, dept, address);
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
		return super.toString() + ", subjects=" + subjects+"]";
		// return "Student [subjects=" + subjects + "]";

		///
	}

}
