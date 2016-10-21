package step2;

import java.util.Scanner;

public class productmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		product p = new product();
		p.input(sc);
		p.print();

	}
}
