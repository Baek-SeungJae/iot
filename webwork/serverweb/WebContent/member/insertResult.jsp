<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		int result = (int)(request.getAttribute("insertresult"));
	%>
	<h1><%=result %>개 행 삽입성공!</h1>
</body>
</html>