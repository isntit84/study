package step1;

import step1_1.person;

public class TestPerson {

	public static void main(String[] args) {

		
			person p = new person();
			
			p.a = 1;
			p.b = 2;
			p.print();
			
		
		
		
		
		//// �޼��� ȣ��� ������ Ÿ�Կ� �°� ���ڰ� ���� -->"7"���� �ν�, 7 ������ �ν�
		p.wake(7);
		//�������� 4�κ� �Դ�
		//�޼��� ���� ���� ���� Ÿ�� ������ �°� ȣ��
		p.eat("��������",4);
		//2,4,->6
		p.plus(2,4);
		//���ϰ��� �ִ� �޼��� ȣ��
		String str = p.play();//���ϵ� ���� str�� ����
		System.out.println("���� ��� : "+str);
		String result=p.order(5000);
		System.out.println("�ֹ� ��� : :+result);
		int r=p.minus(4,2);
		System.out.println("���� ���� : " +r);
		int r1=p.minus(6.3);
		System.out.println("���� ���� : " +r1);

	}

}
