package step7;

public class TestMyDate {

	public static void main(String[] args) {
		// 
		MyDate date = new MyDate(1, 2, 2000);
		System.out.println(date.getDay());// 1
		System.out.println(date.getMonth());// 2
		System.out.println(date.getYear());// 2000
		// ���� ������ set, get �޼���
		System.out.println("�⺻������ ȣ���Ͽ� ��ü����");
		MyDate d1 = new MyDate();
		System.out.println(date.getDay());// 3
		System.out.println(date.getMonth());// 3
		System.out.println(date.getYear());// 1999
	}

}
