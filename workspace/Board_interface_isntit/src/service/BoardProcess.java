package service;

import java.util.ArrayList;

import vo.BoardVO;

public class BoardProcess {
	private DAO db;

	public BoardProcess(DAO db) {
		this.db = db;
	}

	public void con() {
		db.con();
	}

	public void discon() {
		db.discon();
	}

	public void insert(BoardVO m) {
		db.insert(m);
	}

	public BoardVO select(String id) {
		return db.select(id);
	}

	public void update(BoardVO m) {
		db.update(m);

	}

	public void delete(String id) {
		db.delete(id);

	}

	public ArrayList<BoardVO> selectAll() {
		return db.selectAll();
	}

}
