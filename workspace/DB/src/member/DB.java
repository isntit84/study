package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;

	public DB() {
		jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	}

	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void discon() {
		try {
			if (rs != null) {
				rs.close();
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void MemberInsert() {
		con();
		Scanner sc = new Scanner(System.in);
		// System.out.println("��ȣ:");
		// int num = sc.nextInt();

		System.out.println("�̸�:");
		String name = sc.next();

		System.out.println("�ּ�:");
		String addr = sc.next();

		System.out.println("��ȭ��ȣ:");
		String tel = sc.next();

		String sql = "insert into Member values(Member_seq.nextval,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			// pstmt.setInt(1, num);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, tel);
			pstmt.executeUpdate();

			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void MemberPrint() {
		con();
		String sql = "select * from member order by num";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("��ȣ:" + rs.getInt(1));
				System.out.println("�̸�:" + rs.getString(2));
				System.out.println("�ּ�:" + rs.getString(3));
				System.out.println("��ȭ��ȣ:" + rs.getString(4));
				System.out.println("=========================");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
	}

	public boolean search(String name) {
		con();
		String sql = "select * from member where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// if (name == rs.getString(1)) {
				// System.out.println("�̸�:" + rs.getString(1));
				System.out.println("�ּ�:" + rs.getString(2));
				System.out.println("��ȭ��ȣ:" + rs.getString(3));
				System.out.println("==========================");
				return true;
			}

			// }
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}

	public void update() {

		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �̸��� �Է��ϼ���:");
		String j = sc.next();

		System.out.print("���� �ּ�:");
		String addr = sc.next();

		System.out.print("���� ��ȭ��ȣ:");
		String tel = sc.next();

		String sql = "update Member set addr=?, tel=? where name=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			pstmt.setString(2, tel);
			pstmt.setString(3, j);
			pstmt.executeUpdate();

			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void delete() {
		con();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �̸�");
		String j = sc.next();

		String sql = "delete Member where name=?";
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, j);
			pstmt.executeUpdate();

			discon();
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
