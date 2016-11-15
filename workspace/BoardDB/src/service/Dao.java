package service;

import java.util.ArrayList;

import vo.Board;

public interface Dao {
	void con();
	void discon();
	void insert(Board b);
	Board selectMember(String id);
	void update(Board b);
	void delete(String id);
	ArrayList selectAll();
}
