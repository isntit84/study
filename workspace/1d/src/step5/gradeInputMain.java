package step5;

import java.util.Scanner;

public class gradeInputMain {

	public static void main(String[] args) {
		gradeInput[] r = new gradeInput[3];
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, total = 0, hap;
		int i = 0;
		float ave;
		for (i = 0; i < r.length; i++) {
			System.out.println("�̸��� ����, ����, ���� ������ �Է�: ");
			r[i] = new gradeInput();
			r[i].name = sc.next();
			r[i].kor = sc.nextInt();
			r[i].eng = sc.nextInt();
			r[i].math = sc.nextInt();
			r[i].total = r[i].kor + r[i].eng + r[i].math;
			r[i].avg = (float) total / 3;

		}
		for (i=0; i<r.length;i++){
			System.out.println("�̸�"+r[i].name);
			System.out.println("����"+r[i].kor);
			System.out.println("����"+r[i].eng);
			System.out.println("����"+r[i].math);
			System.out.println("����"+r[i].total);
			System.out.println("���"+r[i].avg);
		}
	}
}
