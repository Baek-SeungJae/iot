# Tiles

- Tiles프레임워크를 이용해서 화면 구성하기

1. 라이브러리를 pom.xml에 등록
2. 레이아웃이 적용되어 있는 템플릿 파일과 연결할 jsp파일들이 미리 준비되어 있어야 한다.
3. tiles설정파일을 작성(main-tiles.xml)
   - 템플릿을 등록 : 템플릿의 각 영역을 나누고 각 영역에 기본으로 연결할 jsp파일을 설정한다.
4. 템플릿(레이아웃을 미리 설정해놓은 파일 - mainLayout.jsp)으로 만들어 놓은 jsp파일의 각각 영역이 템플릿에 등록한 영역과 일치하도록 설정
   => tiles에서 제공하는 태그를 사용한다. (내부에서 tiles 설정파일에 등록한 내용과 연결하여 실행하는 작업을 처리하기 위해 tiles에서 제공하는 태그를 써서 작업해야한다.)
5. 스프링 내부에서 실행될때 DispatcherServlet이 뷰 정보를 ViewResolver에게 전달하면 ViewResolver가 tiles 프레임워크를 활용해서 뷰를 만들 수 있도록 spring 설정파일에 등록
   	- tiles 설정파일이 어떤 파일인지 등록
    - 만들어야 하는 view가 tiles뷰임을 등록

6. 템플릿을 활용해서 만들어질 뷰의 정보를 tiles설정 파일에 등록