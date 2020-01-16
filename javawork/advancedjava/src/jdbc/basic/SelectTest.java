package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.115.60:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql2 = "select * from tb_board";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user,password);
			Statement stmt =  con.createStatement();
			ResultSet rs = stmt.executeQuery(sql2);
			System.out.println("rs:"+rs);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}	
	}
}
