package step1;

public class TestArray1 {

	public static void main(String[] args) {
		// 1. �迭 ����
		// int []ages;
		// 2. �迭 ����
		int[] ages = new int[3];
		// ages=new int[3];
		System.out.println(ages); // �迭 ��ü �ּҰ�
		System.out.println(ages[0]); // �⺻ �ʱⰪ 0-> String ����ô�null
		System.out.println(ages.length); // 3
		// 3. �Ҵ� : �ε����� 0���� ����
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 32;
		System.out.println(ages[2]);// 32
		System.out.println("for �̿� ��ü ���� ���");
		// for loop�� �̿��Ͽ� �迭 ����� ���̸� ��� ���
		// �ѱ��̴� ages.length�� ���Ҽ��ִ�.
		// system.out.println(ages[3]);
		// -->���� �ʰ��� Exception �߻�(0~2������ �迭 ����)
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("ages �迭���� 20�� �̻� ���");
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] >= 20) {
				System.out.println(ages[i]);
			} // if
		} // for
	}// main
}// class

// int[] ages =new int[3];
//
// sysout (ages);
// sysout (ages[0];
// sysout (ages.length);
//
// ages[0]=12;
// ages[1]=22;
// ages[2]=32;
// sysout ages[2];
// sysout for "�̿� ��ü ���� ���"
//
// for ( int i=0; i< ages.length; i++){
// sysout ages[i]
// }
// sysout "ages �迭���� 20�� �̻� ���"
// for (int i=0; i < ages.length; i++){
// if (ages[i]>=20){
// sysout ages[i]
