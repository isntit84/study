package step9;

public class TestHasA {

	public static void main(String[] args) {
		// Person has a Car ���踦 ǥ��
		Person p = new Person();// �ν��ͽ����� car,name
		p.setName("������");
		p.setCar(new Car("k5", "red"));// ������ ��� �ν��Ͻ� ���� model,color,��ü������ �ּҰ�
										// ��ȯ
		System.out.println(p.getName());// ������
		System.out.println(p.getCar());// Car ��ü �ּҰ�
		System.out.println(p.getCar().getModel());// k5->(=car.getModel())
		System.out.println(p.getCar().getColor());// red
		// ������ ��ü p�� ������ Car�� �𵨸��� sm5�� ����
		p.getCar().setModel("sm5");
		// ������ ��ü p�� ������ Car�� ������ black���� ����
		p.getCar().setColor("black");
		System.out.println(p.getCar().getModel());// sm5
		System.out.println(p.getCar().getColor());// black

	}

}// class ������ �ʿ�����, �� class�� instance ����?
	// �ʿ� �ż���
