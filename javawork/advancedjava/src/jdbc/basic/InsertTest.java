package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		//127.0.0.1 = local host ���� �۾����� �� pc
		//���� ���ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
		String url = "jdbc:oracle:thin:@70.12.115.60:1521:xe";
		//���Ӱ���
		String user = "scott";
		//���Ӱ����� �н�����
		String password = "tiger";
		String sql = "insert into tb_board values(board_seq.nextval,'jang','����','����',sysdate,0)";
		try{
			//0. ����̹� ������ ���� -> Referenced Libraries\ojdbc6.jar
			//1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			
			//2. DBMS�� �����ϱ� - ���� ������ ����
			// DriverManager Ŭ������ getConnection�޼ҵ带 ���� �۾�
			// static�޼ҵ��̹Ƿ� Ŭ�����̸����� ������
			// exceptionó���� �ؾ���
			// <�Ű�����>
			// url : � DBMS�� ����� ���� ���� �޶�����.
			// user : ���Ӱ���
			// password : ������ ������ �н�����
			// ����Ÿ�� : ���������� java.sql.Connection Ÿ������ ����
			// DriverManager�� getConnection�޼ҵ带 �̿��ϸ� DBMS�� ���� �� ���� ������ ��ü�� ���� �����Ѵ�.
			// ���� ��ü�� Ÿ���� java.sql.Connection������ � DBMS�� �����߳Ŀ� ���� Connection�� ���� ��ü�� ���ϵȴ�.
			// ���ο����� ���ӵ� DBMSȸ�翡�� �����ϴ� ���̺귯�� �� Connection�� ���͵ǵ��� �������� ����Ǿ� �ִ�.
			// <�����>
			// Connection con = DriverManager.getConnection(url,user,password)
			//		=> � DBMS�� ���Ŀ� ���� �ٸ��� ���ϵǴ� Connection ��ü�� con�̶�� ���������� ���� ������ �� �ֵ��� �Ҵ�
			// 
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!! " + con);
			
			//3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ� Connection��ü�� �̿��ؼ� ����
			// 
			Statement stmt = con.createStatement();
			System.out.println("Statement ���� ����!! " + stmt);
			
			//4. sql�����ϱ�
			stmt.executeUpdate(sql);
			System.out.println("���Լ���~");
			
			//5. ����
			//for(int i=0; i<10; i++)
			//	stmt.executeUpdate("insert into tb_board values(board_seq.nextval,'"+String.valueOf(i*99)+"','����','����',sysdate,0)");
			//System.out.println("��������~");
						
		} catch(ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		} catch(SQLException e) {
			System.out.println("���� ����"+e.getMessage());
			e.printStackTrace(); // ��������
		}
		
		
	}
}
