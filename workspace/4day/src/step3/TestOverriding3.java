package step3;
public class TestOverriding3 {

	public static void main(String[] args) {

		Student s = new Student("아이유", "011", "판교", "12");
		System.out.println(s.getDetails());
		//
		Teacher t = new Teacher("김연아", "016", "군포", "체육");
		System.out.println(t.getDetails());

		Person p;
		p = s;
		System.out.println(p.getDetails());
		p = t;
		System.out.println(p.getDetails());
	}

}
