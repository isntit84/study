package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;

public class BoardService implements DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void discon() {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void insert(BoardVO m) {
		con();
		String sql = "insert into board values(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getTitle());
			pstmt.setString(3, m.getContent());
			pstmt.setString(4, m.getNum());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();
	}

	@Override
	public BoardVO select(String id) {
		con();
		BoardVO m = null;
		String sql = "select * from board where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m = new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	}

	@Override
	public void update(BoardVO m) {
		con();
		String sql = "update board set title=?, content=? where id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTitle());
			pstmt.setString(2, m.getContent());
			pstmt.setString(3, m.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

		discon();
		System.out.println(22);
	}

	@Override
	public void delete(String title) {
		con();
		String sql = "delete board where title=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();

	}

	@Override
	public ArrayList<BoardVO> selectAll() {
		con();
		ArrayList<BoardVO> m = new ArrayList<BoardVO>();
		String sql = "select * from board";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				m.add(new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return m;
	}

}
