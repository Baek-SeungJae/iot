# JAVAScript

## 1. 용도

> - 이벤트에 반응하는 동작을 구현할 수 있다.
> - Ajax를 통하여 전체 페이지를 로드하지 않고도, 서버로부터 새로운 페이지를 받거나 데이터를 제출할 수 있다. -> 비동기통신 (중요함)
> - HTML요소의 크기나 색상을 동적으로 변경할 수 있다.
> - 사용자가 입력한 값을 검증하는 작업도 자바스크립트를 이용한다. -> 옛날에나 이렇게했지 Spring으로 할 것이다.

## 2. 초급

>- 문법
>  - 사용방법
>  - 변수
>  - 제어구문
>- 함수
>- 객체
>  - 내장객체
>  - String, Array, Date, Math
>- 이벤트핸들러
>- 브라우저객체모델(BOM)
>
>

## 3. 중급

> - DOM
> - JSON
> - Ajax
> - 자바스크립트의 프로토타입
>   - 사용자 정의 객체 정의
>   - 클로저

## 4. 고급

> - 자바스크립트의 프레임워크 사용
>   - bootstap - css와 javascript의 프레임워크
>   - MEAN stack
>     - MongoDB
>     - Express.js
>     - Angular.js
>     - Node.js
>   - React.js - 웹 UI개발에 사용 (facebook이 공개한 오픈소스)
>   - Vue.js
>   - D3
>
> 

## 5.명령어 index

>- alert("") // 팝업창띄우기
>- document.wirte("") // 표준출력

## 6. BOM

>- 브라우저에 출력되는 모든 구성요소를 객체로 정의하고 접근
>- window
>- location
>- document
>- form(양식태그)
>- image
>
>![image-20200109102650317](.\images\010.png)
>
>1.  접근방법
>
> - 모든 객체는 계층 구조를 갖고 있다.
>
> ```javascript
>window.document........
> ```
>
> - form태그와 form 하위 태그를 객체로 접근하기 위해서 name 속성을 정의하고 접근
>
> ```javascript
> <form name="myform">
> 	아이디 : <input type="text" name="id">
>     패스워드 : <input type="password" name="pass">
> </form>
> 
> window.document.myform.id.속성(메소드)
> ```
>
> ​		주로 window.document는 생략
>
> - id를 정의하는 경우
>
> ``` javascript
> <div id="mydiv">
>     </div>
> 객체 = document.getElementById("mydiv")
> ```
>
> - popup과 opener사이에서 데이터 움직임 : 
>   - js_bom\js_window_test01.html
>   - js_popup.html
>   
>
>
>
>< 명령어모음 >
>
>- 대화상자
>  - alert
>  - prompt
>  - confirm
>- popup
>  - open
>  - close
>- 자동실행
>  - setTimeout
>  - setInterval
>- 데이터처리
>  - palseInt : 숫자모양을 한 문자열을 숫자로 변환
>  - isNaN : 입력받은 값이 숫자인지 문자인지 확인 (실제 값이 숫자면 false, 문자면 true)
>  - eval : 수식을 입력받아서 연산결과를 반환
>  - trim : 공백을 제외한 문자열 길이 반환
>
>

## 7. 이벤트

> - onclick
> - onkeyup
> - onmouseover, onmouseout
> - onchange
> - onload

## 8.DOM

> 
>
> 
>
> 
>
> 
>
> 

## 9. 정적요소 vs 동적요소

> - 

## 10. 함수의 hoisting

> - 자바스크립트는 다른 스크립트 명령문보다 함수선언문을 먼저 읽는다.
>
> - 함수와 변수 등 Global 영역에 추가해야 하는 것들을 먼저 추가하고 다른 스크립트 명령문을 읽기 때문에 아래와 같이 작업해도 오류가 발생하지 않는다. 
>
> - 이를 함수의 호이스팅이라고 한다.
> 
>   ```javascript
>   <body>
>   	<script type="text/javascript">
>   		test(90);
>   		function test(num) {
>   			if (num > 90)
>   				alert("성공");
>   			else
>   				alert("실패");
>   		}
>   	</script>
>  </body>
>   ```
>
>   함수가 선언되기 전에 호출하는 명령문을 정의하는 것은 코드를 엉성하게 만들고 함수의 선언문이 많아지게 되면 이를 읽어서 글로벌 영역에 추가하는 시간이 소요되므로 웹 페이지를 response한 시간이 늦어지므로 권하지 않는다.

## 11. 함수의 표현식

> - 아래와 같이 함수를 표현식으로 정의하고 사용하면 함수의 호이스팅이 발생하지 않는다. 또한 =연산자를 이용해서 함수를 변수에 할당, 이런 경우 정의한 함수명을 사용하지 않고 변수명을 함수명처럼 사용한다.
>
>   ```javascript
>   <body>
>   	<script type="text/javascript">
>   		myfunc(90);
>   		myfunc = function test(num){
>   				if (num > 90)
>   					alert("성공");
>   				else
>   					alert("실패");
>   		}
>   		myfunc(90);
>   	</script>
>   </body>
>   ```
>
>   ​	이런 경우에 함수명을 굳이 쓸 필요가 없고 생략할 수 있고 익명함수라고 부른다.

