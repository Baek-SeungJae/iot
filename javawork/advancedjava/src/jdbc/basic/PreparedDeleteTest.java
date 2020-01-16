package jdbc.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedDeleteTest obj = new PreparedDeleteTest();
		
		System.out.println("********************게시글 삭제***************");
		System.out.print("글번호: ");
		int num = key.nextInt();	
		obj.delete(num);
	}
	public void delete(int num)
	{
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "delete from tb_board where boardnum=?";
		PreparedStatement ptmt = null;
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공~");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공~~");
			
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, num);
			System.out.println("Statement 생성 성공~~");
			
			System.out.println(ptmt.executeUpdate()+"개 행이 삭제됐습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ptmt!=null) ptmt.close();
				if(con!=null) con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
