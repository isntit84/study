package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BookVO;

public class BookDAO implements Dao {
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
	public void bookinsert(BookVO b) {
		con();
		String sql = "insert into book2 values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getTitle());
			pstmt.setString(4, b.getPublisher());
			pstmt.setInt(5, b.getPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();
	}

	@Override
	public BookVO selectBook(String id) {
		con();
		BookVO b = null;
		String sql = "select * from book2 where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new BookVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return b;
	}

	@Override
	public void update(BookVO b) {
		con();
		String sql = "update book2 set author=?, title=?, publisher=?, price=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getAuthor());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());
			pstmt.setString(5, b.getId());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
		discon();
	}

	@Override
	public void delete(String id) {
		con();
		String sql = "delete book2 where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();

	}

	@Override
	public ArrayList selectAll() {
		con();
		ArrayList<BookVO> b = new ArrayList<BookVO>();
		String sql = "select * from book2";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				b.add(new BookVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return b;
	}

}
