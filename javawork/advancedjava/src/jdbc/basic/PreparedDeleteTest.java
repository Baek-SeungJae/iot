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
		
		System.out.println("********************�Խñ� ����***************");
		System.out.print("�۹�ȣ: ");
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
			System.out.println("����̹� �ε� ����~");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����~~");
			
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, num);
			System.out.println("Statement ���� ����~~");
			
			System.out.println(ptmt.executeUpdate()+"�� ���� �����ƽ��ϴ�.");
			
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
