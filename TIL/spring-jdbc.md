spring-jdbc



spring-jdbc

> Connection관리
>
> - DriverManager
>
> - Data Source : Connection Pool
>
>   => 예전에는 개발자가 Pool을 만들었는데 요즘에는 WAS가 제공해준다.
>   - DBCP
>     - 아파치에서 제공하는 커넥션풀
>     - 
>
> 
>
> 
>
> sql처리
>
> - JdbcTemplate



트랜잭션 : 논리작업단위

예를들면 책구매 -> sql작업이 insert,update,insert,update와 같이 복잡하게 여러 작업이 들어간다. 그런데 중간에 오류가 뜨면 이미 처리된 부분들을 다 rollback해야한다.

view -> controller -> service -> DAO -> mybatis -> DBMS