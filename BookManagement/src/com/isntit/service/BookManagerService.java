package com.isntit.service;

import com.isntit.manager.BookManager;
import com.isntit.model.Book;

public class BookManagerService {

	private BookManager bookManager = new BookManager();

	public void execute(String command) {
		if (command.startsWith("add ")) {
			add(command.substring(4));

		} else if (command.startsWith("remove ")) {
			remove(command.substring(7));

		} else if (command.startsWith("list")) {
			list(command.substring(4));

		} else {
			System.out.println("unkwnon command.");
		}
	}

	private void add(String param) {
		String[] token = param.split("/");
		if (token.length == 3) {
			try {
				int price = Integer.valueOf(token[2]);
				Book book = new Book(token[0], token[1], price);
				bookManager.add(book);
				System.out.println("success to add.");
			} catch (NumberFormatException e) {
				System.out.println("illegal params error. You can input like this (title|author|price)");
			}
		} else {
			System.out.println("illegal params error. You can input like this (title|author|price)");
		}
	}

	private void remove(String idString) {
		try {
			int id = Integer.valueOf(idString);
			Book removedBook = bookManager.get(id);
			
			if (removedBook == null) {
				System.out.println("There isn't book of id.");
			} else {
				bookManager.remove(removedBook);
				System.out.println("success to remove " + id + " book.");
			}
		} catch (NumberFormatException e) {
			System.out.println("illegal id error.");
		}
	}

	private void list(String searchKeyword) {
		searchKeyword = searchKeyword.trim();

		if (searchKeyword.length() == 0) {
			bookManager.printList(null);
		} else {
			bookManager.printList(searchKeyword);
		}
	}
}