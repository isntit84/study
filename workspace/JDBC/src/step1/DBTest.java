package step1;

//connection ����, statement �۾����(����� ������)

//execute �����ϴ� , prepared �غ񰡵�, result rs ���
import java.sql.*;

public class DBTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";// xe�� �ڹ�Ÿ�Ժ� �ٲ�

		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");

			stmt = conn.createStatement();// Statement�� �׻� Ŀ�ؼ� �������� ������ �ϰ� ���
			String sql = "select last_name from employees";

			ResultSet rs = stmt.executeQuery(sql); // executeQuery�� ���� ����� ����Ҷ�
													// ���
			int i = 1;
			System.out.println(" name ");
			while (rs.next()) {
				System.out.println(i + " : " + rs.getString(1));
				i++;
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
// 1.����̹� �ε�
// 2.Ŀ�ؼ� ���
// 3.������Ʈ��Ʈ ���
// 4.���� ����
// 5.��� ó��
// 6.Ŀ�ؼ� ����