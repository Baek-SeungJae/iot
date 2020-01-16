package jdbc.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		
		System.out.println("********************�Խñ� ����***************");
		System.out.print("���̵�: ");
		String id = key.next();
		System.out.print("�۹�ȣ: ");
		int num = key.nextInt();
		
		obj.update(id, num);
	}
	
	public void update(String id, int num)
	{
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board set id=? where boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����~");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����~~");
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1,id);
			ptmt.setInt(2, num);
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
