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
		for (int i = 1; i <= 2; i++) {
	%>
	9 * <%= i %> = <%= 9 * i %>
	<br/>
	<%} %>
	
</body>
</html>