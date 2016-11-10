package step1;

//connection 연결, statement 작업명령(입출금 내역서)

//execute 실행하다 , prepared 준비가된, result rs 결과
import java.sql.*;

public class DBTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";// xe는 자바타입별 바뀜

		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");

			stmt = conn.createStatement();// Statement는 항상 커넥션 하위에서 생성을 하고 사용
			String sql = "select last_name from employees";

			ResultSet rs = stmt.executeQuery(sql); // executeQuery는 값의 결과를 출력할때
													// 사용
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
// 1.드라이버 로딩
// 2.커넥션 얻기
// 3.스테이트먼트 얻기
// 4.쿼리 샐행
// 5.결과 처리
// 6.커넥션 종료