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
			System.out.println("이름과 국어, 영어, 수학 점수를 입력: ");
			r[i] = new gradeInput();
			r[i].name = sc.next();
			r[i].kor = sc.nextInt();
			r[i].eng = sc.nextInt();
			r[i].math = sc.nextInt();
			r[i].total = r[i].kor + r[i].eng + r[i].math;
			r[i].avg = (float) total / 3;

		}
		for (i=0; i<r.length;i++){
			System.out.println("이름"+r[i].name);
			System.out.println("국어"+r[i].kor);
			System.out.println("영어"+r[i].eng);
			System.out.println("수학"+r[i].math);
			System.out.println("총점"+r[i].total);
			System.out.println("평균"+r[i].avg);
		}
	}
}
