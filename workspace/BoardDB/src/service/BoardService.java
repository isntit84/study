package service;

import vo.Board;

public class BoardService {
	private Dao dao;

	public BoardService() {
		dao = new BoardDAO();
	}

	public void insert(Board b) {
		dao.insert(b);
	}

	public void printAll() {
		System.out.println(dao.selectAll());

	}

	public Board find(String id) {
		return dao.selectMember(id);
	}

	public void delete(String id) {
		dao.delete(id);
	}

	public void update(Board b) {
		dao.update(b);
	}
}
