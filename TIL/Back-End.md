# Back-End

## 1. Servlet

> - HTML에서는 java코드를 불러올 수 없다.
>
> - 웹에서 java코드를 실행하기 위해서 사용하는 기술이 servlet이다.
>
> - 자바프로그램은 application과 servlet으로 나눠진다.
>
> - servlet은 작성규칙이 있다.
>
> - WEB 플랫폼에서만 사용되는 기술이다.
>
>   - 서블릿은 클라이언트 페이지에서 발생하는 클라이언트에 요청을 처리하기 위한 기술
>   - 클라이언트로부터 요청이 전달되면 서버에서 실행되며 DB연동이나 서버의 자원을 액세스하여 만들어진 결과를 클라이언트로 응답한다.
>   - 클라이언트의 요청을 인식하고 실행되도록 하기 위해서는 서블릿은 정해진 규칙대로 작성이 되어야 하고 서버가 서블릿을 찾아서 실행할 수 있도록 정해진 위치(표준화된 폴더 구조안에 있는 classes폴더)에 작성되어야 한다.
>
>   ![image-20200114093744694](.\images\011.png)
>
>   

### 1. 서블릿작성 규칙

> 1) 표준화된 폴더 구조 안에서 서블릿 디렉토리에 저장되어야 한다.
>
> 	- classes폴더
>
> iot\work\webwork\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\serverweb\WEB-INF\classes에 작성되어야 한다.
>
> ​	=> 이 위치에 서블릿 클래스가 없으면 못 찾는다.
>
> 2)  public 클래스로 작성해야 한다.
>
> ​	=> 서버가 찾아서 실행해야 한다.
>
> 3) 서블릿 클래스를 상속해야 한다.
>
> ​	=> 서버가 우리가 작성한 서블릿 클래스를 찾아서 생성하고 호출하기 위해서는 서버가 인식할 수 있는(서버가 사용할 수 있는) 타입이어야 하므로 서버에 등록된 타입으로 서블릿 클래스를 작성한다.
>
> | Servlet        | 인터페이스                                     |
> | -------------- | ---------------------------------------------- |
> | GenericServlet | 일반적인 내용을 담고 있는 서블릿               |
> | HttpServlet    | http 프로토콜에 특화된 내용을 담고 있는 서블릿 |
> | MyServlet      | 개발자가 만드는 서블릿                         |
>
> 4) 서버가 호출하는 메소드를 오버라이딩 해야한다.
>
> ​	=> 서블릿 클래스는 일반 클래스를 사용하는 방법처럼 객체 생성해서 사용하는 클래스가 아니다. 
> ​		서블릿이 호출되면 서버사 서블릿 객체를 생성하고 적절한 시점에 따라 정해진 메소드를 자동으로 호출		한다. 즉, 서블릿의 Lifecycle(객체를 생성하고 소멸하는 것)을 서버가 관리한다.
> ​		서버가 적절한 시점에 따라 자동으로 메소드를 호출할 때 원하는 작업을 처리하기 위해서는  서버가 호출		하는 메소드를 오버라이딩해서 내가 원하는 내용을 기술해야 한다.
>
> | [오버라이딩 할 메소드] |                                                              |
> | ---------------------- | ------------------------------------------------------------ |
> | init                   | 서블릿이 초기화 될 때 호출                                   |
> | service                | 클라이언트가 요청하면 호출되는 메소드<br />클라이언트의 요청을 처리할 수 있는 내용을 기술<br />ex)  로그인, 게시판목록보기, 회원가입<br />=> 요청방식의 구분없이 모두 호출 |
> | doGet                  | service와 동일하게 동작하며 클라이언트가 get방식으로 요청하는<br /> 경우에만 호출 |
> | doPost                 | service와 동일하게 동작하며 클라이언트가 post 방식으로 요청하는<br /> 경우에만 호출 |
> | destory                | 서블릿 객체가 소멸될 때(메모리에서 해제될 때) 호출           |
>
> 5)  서블릿을 등록
>
> ​	=> 서버가 서블릿을 찾아서 실행할 수 있도록 서블리승ㄹ web.xml(서블릿에 대한 내용을 등록하는 설정파일)에 등록
>
> ```xml
> <!--web.xml-->
> <servlet>
> 	<servlet-name>서블릿의 별칭</servlet-name>
> 	<servlet-class>실제 사용할 서블릿 클래스(패키지포함)</servlet-class>
> </servlet>
> <servlet-mapping>
> 	<servlet-name>미리 등록한 서블릿의 이름</servlet-name>
> 	<url-pattern>요청 url(반드시 /나 .으로 시작)</url-pattern>
> </servlet-mapping>
> 
> <!-- ex) -->
> <servlet>
> 	<servlet-name>first</servlet-name>
> 	<servlet-class>basic.FirstServlet</servlet-class>
> </servlet>
> <servlet-mapping>
> 	<servlet-name>first</servlet-name>
> 	<url-pattern>first.mulit</url-pattern>
> </servlet-mapping>
> ```
>
> 

### 2. 서블릿 요청 방법

> - get방식으로 요청
>
>   - 주소표시줄에 입력하고 요청
>
>     => 테스트용으로 사용
>
>     http://70.12.224.117:8088/serverweb/first.multi
>
>     server.xml에 등록한 path **/** context명 **/** web.xml에 등록한 요청 path
>
>   - form 태그에서 method 속성을 get으로 설정하고 submit버튼 선택
>
>     => action 속성에 설정한다.
>
>     => form태그를 정의하면서 method속성을 생략하면 get방식으로 요청
>
>     ```html
>     <form method="get" action="/contextpath/서블릿요청url">
>         <input type="submit" value="전송"/>
>     </form>
>     ```
>
>     => submit 버튼을 눌러서 요청하면 form태그의 action 속성에 정의한 서블릿이 요청되며 form내부에 정의한 모든 양식태그들의 name과 value가 서블릿으로 전달된다.
>
> - post방식으로 요청
>
>   - form 태그에서 method 속성을 post으로 설정하고 submit버튼 선택
>
>     => action 속성에 설정한다.
>
>     => form태그를 정의하면서 method속성을 생략하면 post방식으로 요청
>
>     ```html
>     <form method="post" action="/contextpath/서블릿요청url">
>         <input type="submit" value="전송"/>
>     </form>
>     ```
>
>     => submit 버튼을 눌러서 요청하면 form태그의 action 속성에 정의한 서블릿이 요청되며 form내부에 정의한 모든 양식태그들의 name과 value가 서블릿으로 전달된다.
>
> | 요청방식 |                                                              |
> | -------- | ------------------------------------------------------------ |
> | get      | 요청할 때 입력하는 내용이 url 뒤에 추가되어 전송되는 방식<br />(요청메시지 헤더에 추가)<br />클라이언트가 입력하는 내용이 그대로 노출된다.<br />전송할 수 있는 데이터의 크기에 제한이 있다.<br />ex) 게시판 목록 확인하기, 상품정보 가져오기, 검색하기 |
> | post     | 요청메시지 body에 추가되어 전송되므로 클라이언트에 노출되지 않지만 툴을 이용하면 확인할 수 있으므로 암호화해서 전송해야 한다.<br />보낼 수 있는 데이터 크기에 제한이 없다.<br />서버의 값을 클라이언트가 원하는 값으로 update(변경)하는 경우<br />ex) 회원등록, 회원정보 수정, 파일업로드, 메일쓰기 |

### 3. 클라이언트가 전달하는 요청 메시지에서 클라이언트의 입력 정보를 추출하기

>1) 요청
>
> - 클라이언트가  요청 메시지를 서버로 전달하면 여러가지 클라인트 정보(입력한 데이터, 쿠키, 세션정보, ip, port....)가 서버로 전달된다.
>   서버는 이 데이터를 가지고 요청 객체(요청객체를 만들면서 전달받은 데이터를 요청객체에 셋팅하는 작업을 수행한다)를 생성한다.
> - http 프로토콜에 특화된 내용은 => HttpServletRequest에서 찾는다.
> - 일반적인 내용은 ServletRequest에서 찾는다.
>
>- 요청정보 추출)
>
> `~~~~~~~~/serverWeb/login.d?id=lee?pass=1234
>
> ​									?파라미터명=파라미터value?
>
> - getParameter
>   - ServletRequest의 메소드 로 메소드를 호출하며 전달한 name에 대한 value를 리턴
>   - return값은 String으로 파라미터의 값 (주소표시줄에 직접 넘긴 value로 =오른쪽에 있는 문자열 form태그를 이용해서 사용자가 직접 입력한 값들)
>   - 매개변수 : String으로 파라미터 이름
>     주소표시줄에 직접 넘긴 name으로 =의 왼쪽에 있는 문자열 양식태그를 정의할 때 name속성에 정의한 값
>     `<input type="text" name="id">
> - getParameterValues
>   - ServletRequest의 메소드로 파라미터 명이 같은 모든 value를 모아서 String 배열로 리턴
>     ex) CheckBox, List에서 복수 개 선택, 임의로 동일한 이름을 정의해서 넘긴 데이터
>
>2)
>
>3) 응답
>
>- 클라이언트가 요청한 내용을 처리하고 처리결과를 웹 페이지에 출력되도록 응답해야한다.
>- 서블릿에서는 응답을 할 수 있도록 출력스트림을 지원한다.
>  - 응답하는 문서의 타입과 인코딩방식을 정의
>    res.setContentType("응답형식(MIME타입);문자셋")
>    res.setContentType("text/html;charset=euc-kr")
>    
>  - 응답객체에서 출력 스트림 얻기
>    ServletResponse객체의 getWriter를 이용해서 리턴받는다.
>    PrintWriter pw = response.getWriter()
>  - 메소드의 매개변수로 응답할 내용을 명시한다.
>    => 실제로 불가능
>    => Ajax용
>    pw.메소드("출력할내용[html태그]");
>
>4) 응답
>
>- 200 : 정상요청
>- 404 : 요청한 url에 맞는 파일을 찾을 수 없습니다.
>- 405 : 요청방식에 따라 실행되는 메소드가 없다.
>- 500 : 

### 4.  

## #. xml

> - 이기종 환경에서 데이터 교환을 위한 언어
> - 미들웨어?
> - 이게 무거워서 만들어진 언어가 JSON이다.