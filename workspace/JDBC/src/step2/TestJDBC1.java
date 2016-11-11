package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {

	public static void main(String[] args) {
		try {// 1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracle jdbc driver loading ok!!!");

			// 2.Ŀ�ؼ� ���
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("db connect ok!");

			// 3.������Ʈ��Ʈ ���
			Statement stmt = con.createStatement();

			// 4.���� ����
			String sql = "select id, password, name, adress from member";

			// 5.��� ó��
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString("name") + " " + rs.getString("adress"));
			}

			// 6.closeĿ�ؼ� ����
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
