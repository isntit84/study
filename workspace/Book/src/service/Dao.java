package service;

import java.util.ArrayList;

import vo.BookVO;

public interface Dao {
	void con();

	void discon();

	void bookinsert(BookVO b);

	BookVO selectBook(String id);

	void update(BookVO m);

	void delete(String id);

	ArrayList selectAll();
}
