package jdbc.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete from tb_board ");
		sql.append("where boardnum=7");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����~");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����~~");
			
			Statement stmt = con.createStatement();
			System.out.println("Statement ���� ����~~");
			
			System.out.println(stmt.executeUpdate(sql.toString())+"�� ���� �����ƽ��ϴ�.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("Connection ����");
		}
		
	}
}