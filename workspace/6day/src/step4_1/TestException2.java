package step4_1;

public class TestException2 {

	public static void main(String[] args) {
		String s = null;
		try {// Exception�� �߻����� ������ ����Ǵ� �ڵ��
			System.out.println(s.length());
			// �� �ڵ���ο��� Exception �߻��Ǹ� �ٷ� catch��
			// Exception �߻� �ȵǸ� �Ʒ��ڵ���� ����ȴ�.
			System.out.println("����??����Ȯ��");
			// jvm�� ���� Exception�� �޾Ƽ� ������ ������� ó��
			// Exception �� ó��
		} catch (NullPointerException ne) {
			System.out.println("null�̹Ƿ� ���̸� ���Ҽ�����");
			
			// } catch (Exception ne) { //Exception ���ܸ� ó���ϴ� ���
			// System.out.println("null�̹Ƿ� ���̸� ���Ҽ�����");

		}
		System.out.println("���α׷� �������");
	}

}
