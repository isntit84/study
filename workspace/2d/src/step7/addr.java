package step7;

import java.util.Scanner;

public class addr {
	String name;
	String Tel;
	String addres;
	
	boolean search(String name){
		if(this.name.equals(name))
			return true;
		else
			return false;
	}

	void Input(Scanner sc) {
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		Tel = sc.next();
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		addres = sc.next();
	}

	void print() {
		System.out.println("�̸��� : " + name);
		System.out.println("��ȭ��ȣ�� : " + Tel);
		System.out.println("�ּҴ� : " + addres);
//		System.out.println("�̸� : "+name+"\t��ȭ��ȣ : "+Tel+"\t�ּ� : "+addres);
	}
}

// ���� ����: �̸� ���� �ּ� ->�˻����� -> �Է°�-> ��°�
