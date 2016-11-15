package service;

import vo.BookVO;

public class BookService {
	private Dao dao;

	public BookService() {
		dao = new BookDAO();
	}

	public void addBookVO(BookVO b) {
		dao.bookinsert(b);
	}

	public void printAll() {
		System.out.println(dao.selectAll());
	}

	public BookVO findBookVO(String id) {
		return dao.selectBook(id);

	}

	public void deleteBookVO(String id) {
		dao.delete(id);
	}

	public void updateBookVO(BookVO b) {
		dao.update(b);
	}
}
