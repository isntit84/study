package step2;


class Employee {// extends Object
	private String no;

	Employee(String no) {// super();
		this.no = no;

	}
}

class Manager extends Employee {
	private String dept;

	Manager(String no, String dept) {
		super(no);// �θ� �������� ���ڰ��� �Է��Ѵ�.
		this.dept = dept;

	}
}

public class TestSuper2 {

	public static void main(String[] args) {
		Manager m = new Manager("kosta1", "������");
	}
}
