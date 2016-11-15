package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BookVO;
import vo.Customer;

public class CusDAO implements Dao2 {
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
	public void Customerinsert(Customer b) {
		con();
		String sql = "insert into customer values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getName());
			pstmt.setString(2, b.getAddr());
			pstmt.setString(3, b.getTel());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();
	}

	@Override
	public Customer Cusselect(String name) {
		con();
		Customer b = null;
		String sql = "select * from customer where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new Customer(rs.getString(1), rs.getString(2), rs.getString(3));

			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return b;
	}

	@Override
	public void Cusupdate(Customer b) {
		con();
		String sql = "update customer set tel=?, addr=? where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTel());
			pstmt.setString(2, b.getAddr());
			pstmt.setString(3, b.getName());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
		discon();
	}

	@Override
	public void Cusdelete(String name) {
		con();
		String sql = "delete customer where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		discon();

	}

	@Override
	public ArrayList selectAll() {
		con();
		ArrayList<Customer> b = new ArrayList<Customer>();
		String sql = "select * from customer";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				b.add(new Customer(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return b;
	}

}
