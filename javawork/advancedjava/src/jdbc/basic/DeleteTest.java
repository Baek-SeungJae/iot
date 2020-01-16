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
			System.out.println("드라이버 로딩 성공~");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공~~");
			
			Statement stmt = con.createStatement();
			System.out.println("Statement 생성 성공~~");
			
			System.out.println(stmt.executeUpdate(sql.toString())+"개 행이 삭제됐습니다.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("Connection 실패");
		}
		
	}
}