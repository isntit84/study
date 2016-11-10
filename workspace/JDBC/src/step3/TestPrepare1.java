package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestPrepare1 {
//prepare 준비하다
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracle jdbc driver loading ok!!!");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("db connect ok!");
			String sql = "insert into member(id,password,name,address) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "ibatis");
			pstmt.setString(2, "bcda");
			pstmt.setString(3, "이진우");
			pstmt.setString(4, "신흥1동");
			int result = pstmt.executeUpdate();

			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}