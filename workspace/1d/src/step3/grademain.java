package step3;

import java.util.Scanner;

public class grademain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		grade g = new grade();
		g.Input(sc);
		g.tot();
		g.avg();
		g.print();
	}

}
