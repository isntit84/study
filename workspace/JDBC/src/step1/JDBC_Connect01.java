package step1;

import java.sql.*;

public class JDBC_Connect01 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		}
	}
}
