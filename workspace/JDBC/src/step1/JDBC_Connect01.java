package step1;

import java.sql.*;

public class JDBC_Connect01 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ���� ����!");
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
	}
}
