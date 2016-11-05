package com.isntit;

import java.util.Scanner;

import com.isntit.service.BookManagerService;

public class Main {
	private static Scanner scan;

	
	public static void main(String[] args) {
		BookManagerService service = new BookManagerService();
		
		scan = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");
			String command = scan.nextLine();
			service.execute(command);
		}
	}
}
