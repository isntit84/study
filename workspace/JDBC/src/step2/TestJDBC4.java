package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC4 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracle jdbc driver loading ok!!!");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("db connect ok!");
			
			Statement stmt = con.createStatement();
			String sql = "delete from member where name='장매력'"; // 삭제
			int result = stmt.executeUpdate(sql);
			 System.out.println(result); //영향을 준수(만약 한명 들어가면 1이 반환)
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}