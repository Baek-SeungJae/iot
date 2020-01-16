package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		//127.0.0.1 = local host 현재 작업중인 내 pc
		//연결 문자열 - 어떤 DBMS를 쓰느냐에 따라 형식이 달라진다.
		String url = "jdbc:oracle:thin:@70.12.115.60:1521:xe";
		//접속계정
		String user = "scott";
		//접속계정의 패스워드
		String password = "tiger";
		String sql = "insert into tb_board values(board_seq.nextval,'jang','연습','연습',sysdate,0)";
		try{
			//0. 드라이버 파일을 연결 -> Referenced Libraries\ojdbc6.jar
			//1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공!!");
			
			//2. DBMS에 연결하기 - 연결 정보를 정의
			// DriverManager 클래스의 getConnection메소드를 통해 작업
			// static메소드이므로 클래스이름으로 엑세스
			// exception처리를 해야함
			// <매개변수>
			// url : 어떤 DBMS를 사용할 지에 따라 달라진다.
			// user : 접속계정
			// password : 접속할 계정의 패스워드
			// 리턴타입 : 연결정보를 java.sql.Connection 타입으로 리턴
			// DriverManager의 getConnection메소드를 이용하면 DBMS에 연결 후 연결 정보를 객체로 만들어서 리턴한다.
			// 연결 객체의 타입은 java.sql.Connection이지만 어떤 DBMS를 접속했냐에 따라 Connection의 하위 객체가 리턴된다.
			// 내부에서는 접속된 DBMS회사에서 제공하는 라이브러리 속 Connection이 리터되도록 다형성이 적용되어 있다.
			// <사용방법>
			// Connection con = DriverManager.getConnection(url,user,password)
			//		=> 어떤 DBMS를 쓰냐에 따라서 다르게 리턴되는 Connection 객체를 con이라는 참조변수를 통해 접근할 수 있도록 할당
			// 
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!! " + con);
			
			//3. sql을 실행하기 위한 객체를 생성 - 연결정보와 연결시켜야 하므로 Connection객체를 이용해서 생성
			// 
			Statement stmt = con.createStatement();
			System.out.println("Statement 생성 성공!! " + stmt);
			
			//4. sql실행하기
			stmt.executeUpdate(sql);
			System.out.println("삽입성공~");
			
			//5. 연습
			//for(int i=0; i<10; i++)
			//	stmt.executeUpdate("insert into tb_board values(board_seq.nextval,'"+String.valueOf(i*99)+"','연습','연습',sysdate,0)");
			//System.out.println("연습성공~");
						
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
		} catch(SQLException e) {
			System.out.println("연결 실패"+e.getMessage());
			e.printStackTrace(); // 오류추적
		}
		
		
	}
}
