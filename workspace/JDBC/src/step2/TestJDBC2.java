package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracle jdbc driver loading ok!!!");
			
			// 2.커넥션 얻기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("db connect ok!");
			
			// 3.스테이트먼트 얻기
			Statement stmt = con.createStatement();
			String sql = "insert into member(id,password,name,address) values('spring','aaaa','장매력','길동')"; // 데이터 행 추가
			int result = stmt.executeUpdate(sql);
			// System.out.println(result); //영향을 준 row 수(만약 한명 들어가면 1이 반환)
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}