package step3;

import java.util.Scanner;

public class grade {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	float avg;

	void Input(Scanner sc) {
		System.out.println("�̸� : ");
		name = sc.next();
		System.out.println("���� : ");
		kor = sc.nextInt();
		System.out.println("���� : ");
		eng = sc.nextInt();
		System.out.println("���� : ");
		math = sc.nextInt();

	}

	void tot() {
		total = kor + eng + math;

	}

	void avg() {
		avg = total / 3;
	}

	void print() {
		System.out.println("�̸�" + name);
		System.out.println("����" + kor);
		System.out.println("����" + eng);
		System.out.println("����" + math);
		System.out.println("����" + total);
		System.out.println("���" + avg);
	}
}