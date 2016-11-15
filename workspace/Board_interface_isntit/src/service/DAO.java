package service;

import java.util.ArrayList;

import vo.BoardVO;

public interface DAO {

	void con();

	void discon();

	void insert(BoardVO m);

	BoardVO select(String id);

	void update(BoardVO m);

	void delete(String id);

	ArrayList<BoardVO> selectAll();

}
