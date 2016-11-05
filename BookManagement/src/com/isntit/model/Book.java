package com.isntit.model;

public class Book {
	static private int bookId = 0;

	private String title;
	private int id;
	private int price;
	private String author;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.id = Book.bookId;
		Book.bookId += 1;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override public String toString() {
		return id + ") " + title;
	}
}
