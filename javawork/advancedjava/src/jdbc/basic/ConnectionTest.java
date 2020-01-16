package jdbc.basic;

import java.sql.DriverManager;
import java.sql.SQLException;

//����Ŭ�� �����ϱ�
public class ConnectionTest {

	public static void main(String[] args){
		//127.0.0.1 = local host ���� �۾����� �� pc
		//���� ���ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
		String url = "jdbc:oracle:thin:@70.12.115.60:1521:xe";
		//���Ӱ���
		String user = "scott";
		//���Ӱ����� �н�����
		String password = "tiger";
		
		try{
			//1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			//2. DBMS�� �����ϱ� - ���� ������ ����
			DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!!");
		} catch(ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		} catch(SQLException e) {
			System.out.println("���� ����"+e.getMessage());
		}
		
		
	}

}
