# JDBC

> - 자바 데이터베이스 커넥티비티
> - 자바로 DB를 엑세스한다.
>
> - JAVA에서는 인터페이스만 구성해놓고 DBMS의 제조사들이 하위클래스를 구현하도록 되어있다.



## 1. 환경설정

## 2. 개요

> 1. 드라이버로딩
>
> 2. 커넥션설정하기
>
> 3. Statement객체 생성하기
>
> 4. SQL문실행하기
>
> 5. 결과처리
>
> 6. 자원반납
>
> 순서대로 작업한다. 

## 0. 드라이버 설치

> jdbc 드라이버를 제조사 홈페이지에서 다운로드 받는다.
>
> => C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar 파일
>
> [이클립스로 작업시]
>
> ​	작업중인 프로젝트 선택
>
> ​	프로젝트에서 단축메뉴 선택 -> [Build path]-[Configure Build path]
>
> ​	대화상자에서 세 번째 탭인 [Libraries]탭 선택
>
> ​	[Add external jar…]선택하고 1번 위치에 있는 ojdbc6.jar 파일을 등록

### 1. 드라이버 로딩

> - 자바에서 어떤 DBMS를 사용하는지 인식시키는 작업이다.
>
> - Class클래스의 forName메소드를 이용해서 핵심 클래스를 로딩하는 작업
>
> - Class.forName("oracle.jdbc.driver.OracleDriver")
>
>   ```java
>   Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클
>   Class.forName("com.mysql.jdbc.Driver"); // MySQL
>   ```
>
> - try - catch문을 사용해야 한다. 여기서는 생략했다.

### 2. 커넥션 설정하기

> - DBMS마다 차이가 있다.
>
> - 연결문자열(프로토콜:@IP:Port:서비스명), 접속계정, 접속패스워드를 넣는다.
>
>   ```java
>   String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 127.0.0.1은 로컬의 주소
>   String user = "scott";
>   String password = "tiger";
>   Connection con = DriverManager.getConnection(url, user, password);
>   ```
>
> - 마찬가지로 try - catch문을 사용해야 하지만 생략했다.
>
> - getConnection을 사용하면 DBMS에 연결하고 연결정보를 Connection타입으로 반환한다.
>
> - e.printStackTrace()를 이용해서 오류를 추적할 수 있음

### 3. Statement객체 생성하기

>- Statement - PreparedStatement - CallableStatement 3단계로 상속받는 객체가 존재함
>  - Statement					: 정적 SQL을 실행 (보안에 취약 -SQL-Injection에 취약)
>  - <u>**PreparedStatement**</u>	: 동적 SQL을 실행 시큐어코딩에 적합
>  - CallableStatement   	: 각 DBMS에 특화된 SQL을 실행
>- 모두 interface라서 new를 이용해서 객체를 생성할 수 없다.
>- sql을 실행하기 위한 객체를 생성 - CONNECTION 객체를 이용해서 생성 
>
> ```java
>Statement stmt = con.createStatement();
>// java.sql.Statement 타입이지만 드라이버 파일에 포함된 Statement 객체가 리턴
>PreparedStatement = 
> ```
>
>- 인터페이스는 내부에서 어떻게 동작하는지 알필요가 없음.

### 4. SQL실행

> - Statement이용
>
>   - excuteUpdate : insert, update, delete 사용
>
>   - int가 return 된다. : 몇개의 row가 변경되었는지 리턴
>
>   - excuteQuery : select 사용
>
>     select문의 실행 결과로 리턴되는 2차원 표를 자바에서 사용할 수 있도록 모델링 해 놓은 객체가 ResultSet이고 executeQuery메소드는 결과로 ResultSet객체를 반환하므로 이 객체를 반환받을 수 있도록 정의한다.
>
>     ```java
>     ResultSet rs = stmt.executeQuery("sql문");
>     ```
>
>     
>
> -  PreparedStatement 이용
>
>   => 동적 SQL문을 사용해야 하기 때문에 
>
>   sql이 실행되는 과정은
>
>   쿼리문을 읽고 분석, 컴파일, 실행
>
>   Statement는 위 과정을 모두 반복해서 실행하고 작업하지만 PreparedStatement는 한 번 실행하고 캐쉬에 저장하고 캐쉬에서 읽어서 작업
>
>   PreparedStatement는 sql문을 실행하는 방식이 sql문을 미리 파싱한 후 동적으로 바인딩해서 작업해야 하는 값들만 나중에 연결해서 인식시키고 실행한다.
>
>   1) sql문을 작성할 때 외부에서 입력받아서 전달할 부분을 ?로 정의한다.
>
>   2) sql문을 미리 파싱해야 하므로 실행할 때 sql을 전달하지 않고 PreparedStatement객체를 생성할 때 sql문을 전달한다.
>
>   ```java
>   PreparedStatement ptmt = con.prepareStatement(sql);
>   ```
>
>   3) ?에 값을 셋팅
>
>   ​	PreparedStatement 객체에 정의되어 있는 setxxxx메소드를 이용
>
>   ​	ResultSet과 동일한 방식으로 메소드를 구성
>
>   ​	setxxxx(index, 값)
>
>   ​					index는 물음표순서, 1부터시작
>
>   ​	오라클 타입과 매칭되는 setXXX메소드
>
>   ​			char, varchar2 -> setString(1, "xxxx")
>
>   ​			number, integer -> setInt(1, 0000)
>
>   ​			소숫점이 있는 number -> setDouble(1, 0.0)
>
>   ​			date -> setDate(1, java.sql.Date 객체)
>
>   4) 실행 메소드 호출
>
>    - insert, delete, update : int result = ptmt.executeUpdate()
>
>    - select : ResultSet rs = ptmt.executeQuery()
>
>      
>
>   

## 5. 결과처리

> - insert, update, delete
>
>   => int 반환
>
> - select
>
>   한줄씩밖에 처리를 못함
>
>   -> while(next())를 이용함.
>
>   ​	next()는 커서의 이동여부를 boolean형태로 반환
>
>   ResultSet을 참조할 수 있도록정의
>
>   ResultSet 안에서 모든 레코드를 읽어서 처리할 수 있도록 반복문을 이용해서 처리
>
>   처음 반환되는 ResultSet에서 Cursor가 레코드에 위치하지 않으므로 Cursor를 ResultSet안의 레코드에 위치할 수 있도록 내부 메소드를 이용해서 처리한다.
>
>   ResultSet내부에서 제공되는 rs.getxxxxx메소드를 이용
>
>   ​	varchar2 or char로 정의된 컬럼값 : getString(컬럼의순서 or 컬럼명) -> 컬럼의 순서는 테이블에 존재하는 것이 아니라 조회된 컬럼의 순서이다. (index는 1부터 시작)
>
>   ​	소숫점 없는 number, integer : getInt(컬럼의순서or 컬럼명)
>
>   ​	소숫점 있는 number : getDouble(컬럼의순서or 컬럼명)
>
>   ​	날짜데이터 : getDate(컬럼의순서or 컬럼명)
>
>   ​	
>
>   ```java
>   while(rs.next()) // 다음 레코드로 cursor를 이동하고 레코드가 존재하면 true, 아니면 false
>   {				// 조호된 테이블의 모든 레코드에 반복작업 시작
>       sysout(rx.getString(1)); 
>       sysout(rx.getString("ename");
>   }
>   ```
>
>   

## 6. 자원반납

> - DBMS는 비싼자원이다.
> - ResultSet, Statement, Connection 모두 반납해야한다.
> - close()메소드를 이용한다.
> - 가장 마지막에 만든 객체부터 해제
>
> ```java
> finally {
> 			try {
> 				if(rs!=null) rs.close();
> 				if(stmt!=null) stmt.close();
> 				if(con!=null) con.close();
> 			} catch(SQLException e) {
> 				e.printStackTrace();
> 			}
> ```
>
> 객체선언부를 try밖으로 빼고 null을 준다.