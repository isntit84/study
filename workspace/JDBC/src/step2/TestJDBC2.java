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
			
			// 2.Ŀ�ؼ� ���
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("db connect ok!");
			
			// 3.������Ʈ��Ʈ ���
			Statement stmt = con.createStatement();
			String sql = "insert into member(id,password,name,address) values('spring','aaaa','��ŷ�','�浿')"; // ������ �� �߰�
			int result = stmt.executeUpdate(sql);
			// System.out.println(result); //������ �� row ��(���� �Ѹ� ���� 1�� ��ȯ)
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}