package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		
		System.out.println("********************게시글 등록***************");
		System.out.print("아이디: ");
		String id = key.next();
		System.out.print("제목: ");
		String title = key.next();
		System.out.print("내용: ");
		String content = key.next();
		
		obj.insert(id,title,content);
		
		
		
	}
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@70.12.115.60:1521:xe";
		String user = "scott";
		String password = "tiger";
		//String sql = "insert into tb_board values(board_seq.nextval,'"+id+"','"+title+"','"+content+"',sysdate,0)";
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!! " + con);
			
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setString(2,title);
			ptmt.setString(3,content);
			
			System.out.println("Statement 생성 성공!! " + ptmt);
			System.out.println(ptmt.executeUpdate() +"개 행삽입성공~");
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
		} catch(SQLException e) {
			System.out.println("연결 실패"+e.getMessage());
			e.printStackTrace(); // 오류추적
		} finally {
			try {
			if(ptmt!=null) ptmt.close();
			if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
