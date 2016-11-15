package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Board;

public class BoardDAO implements Dao {
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

	public void discon() {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insert(Board b) {
		con();
		String sql = "insert into board values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getContents());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();
	}

	public Board selectMember(String id) {
		con();
		Board b = null;
		String sql = "select * from board where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new Board(rs.getString(1), rs.getString(2), rs.getString(3));

			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return b;
	}

	public void update(Board b) {
		con();
		String sql = "update board set contents=?, title=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getContents());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getId());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
		discon();
	}

	public void delete(String id) {
		con();
		String sql = "delete board where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();

	}

	public ArrayList selectAll() {
		con();
		ArrayList<Board> b = new ArrayList<Board>();
		String sql = "select * from board";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				b.add(new Board(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return b;
	}

}
