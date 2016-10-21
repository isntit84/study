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
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();

	}

	void tot() {
		total = kor + eng + math;

	}

	void avg() {
		avg = total / 3;
	}

	void print() {
		System.out.println("이름" + name);
		System.out.println("국어" + kor);
		System.out.println("영어" + eng);
		System.out.println("수학" + math);
		System.out.println("총점" + total);
		System.out.println("평균" + avg);
	}
}