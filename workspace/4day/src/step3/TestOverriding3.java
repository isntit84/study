package step3;
public class TestOverriding3 {

	public static void main(String[] args) {

		Student s = new Student("������", "011", "�Ǳ�", "12");
		System.out.println(s.getDetails());
		//
		Teacher t = new Teacher("�迬��", "016", "����", "ü��");
		System.out.println(t.getDetails());

		Person p;
		p = s;
		System.out.println(p.getDetails());
		p = t;
		System.out.println(p.getDetails());
	}

}
