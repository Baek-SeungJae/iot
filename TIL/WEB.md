# WEB

## 1.  <u>*client - server*</u>

> -  client
>
>   html, css, javascript, jQuery
>
>   
>
> - web-server (소프트웨어가 설치되어 있는 컴퓨터)
>
>   IIS, apache
>
>   
>
> - WAS ( tomcat, web logic, JEUS)
>
>   java를 실행할 수 있는 컴퓨터를 컨테이너라고 함
>
>   컨테이너에서 JDBC를 활용
>
> ![image-20191230172434989](.\images\006.png)

## 2. domain name

> ip와 맵핑된

## 3. WEB page

> - html
>
>   글자, 이미지를 정의하는 기술
>
>   구성요소를 정의
>
> - css
>
>   예쁘게 꾸미기
>
> - javascript
>
>   대화형 페이지(WAS) 구성
>
>   몇년 전만 해도 주목받지 못했는데 이제는 굉장히 중요해졌음
>

## 4. 웹 요청방식

http://127.0.0.1:8088/context명/요청할 web application

프로토콜 :// 웹서버ip : port : 기본context는 생략(root)

port(web의 기본 port 80- 생략가능)



## 5. 서버 start

> - 서버가 시작될 때 설정파일(대부분 xml)을 가지고 시작되기 때문에 설정파일을 변경하면 서버를 재시작해야한다.
>
>   실제상황에서는 설정파일을 바꿀 일이 거의 없으므로 서버를 재시작할 일도 거의 없다.
>   
>   

## 6. context

> context의 파일구조가 정해져있다.
>
> ![008](008.png)

## 7. 경로

> .. : 상위폴더로
>
> . : 현재폴더의
>
> http://127.0.0.1:8088/path명/~
>
> http://127.0.0.1:8088 : root
>
> path명 : context
>
> 웹에서는 c:/방식(파일시스템)으로 요청할 수 없다.
>
> < 서버관련경로 >
> 	이클립스에서 서버를 지우고 재설정하려면 콘솔쪽, 프로젝트 익스플로러, 이클립스의 window/server/Runtime Enviroment => 3군데 모두 지워줘야한다.
>
>  

## 8. CLRUD

> 등록 수정 삭제 등등
>
> 

## 9. HTML 입력양식 (form)

> 클라이언트에서 입력한 결과가 서버로 전송되어야 한다.
>
> ex) id pass
>
> 서버로 데이터를 넘기려면 form양식을 사용해야 한다.
>
> 