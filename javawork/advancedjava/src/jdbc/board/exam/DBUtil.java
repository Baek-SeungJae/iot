package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DBMS�� �����ϴ� �ߺ��� �۾��� ������ Ŭ����
public class DBUtil {
	// ����̹� �ε� �۾��� Ŭ������ �ε��� �� ���� �ε��ǵ��� ó��
	// static{}���� ��ɹ��� Ŭ������ �ε��� �� �ѹ��� ����Ǵ� �ڵ�
	
	// 1.
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	// 2. Ŀ�ؼ��ϱ� - DBMS�� ���� �Ŀ� ���� ������ �����ϰ� �ִ� Connection�� ����
	}
	
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return  con;
	}
	
	public static void close(Connection con, PreparedStatement ptmt, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(ptmt!=null) ptmt.close();
			if(con!=null)con.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
