package com.isntit.manager;

import java.util.ArrayList;
import java.util.List;

import com.isntit.model.Book;

public class BookManager {
	private List<Book> bookList = new ArrayList<>();

	public BookManager() {
	}

	public void add(Book book) {
		bookList.add(book);
	}
	
	public Book get(int id) {
		for (int i=0; i<bookList.size(); i++) {
			Book b = bookList.get(i);
			if (b.getId() == id) {
				return b;
			}
		}
		return null;
	}

	public boolean remove(Book book) {
		return bookList.remove(book);
	}

	public Book removeAt(int index) {
		return bookList.remove(index);
	}

	public void printList(String searchKeyword) {
		for (int i=0; i<bookList.size(); i++) {
			Book b = bookList.get(i);
			if (searchKeyword == null) {
				System.out.println(b);	
			} else {
				if (b.getTitle().contains(searchKeyword) || b.getAuthor().contains(searchKeyword)) {
					System.out.println(b);
				}
			}
		}
		//		for (Book b : bookList) {
		//			System.out.println(b);
		//		}
	}
}
