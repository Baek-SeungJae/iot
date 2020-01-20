<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>회원목록</h1>
	<hr />
	<table border='1' width='800' align='center'>
		<tr align='center'>
			<th>ID</th>
			<th>Name</th>
			<th>DeptNo</th>
			<th>Addr</th>
			<th>Point</th>
			<th>Grade</th>
			<th>삭제</th>
		</tr>
		<%
			ArrayList<MemberDTO> dto = (ArrayList<MemberDTO>) request.getAttribute("insertdto");

			for (int i = 0; i < dto.size(); i++) {
				MemberDTO member = dto.get(i);
		%>
		<tr>
			<td><%=member.getId()%></td>
			<td><a href="/serverweb/member/read.do?name=<%=member.getName()%>"><%=member.getName()%></a></td>
			<td><%=member.getDeptno()%></td>
			<td><%=member.getAddr()%></td>
			<td><%=member.getPoint()%></td>
			<td><%=member.getGrade()%></td>
			<td><a href="/serverweb/member/delete.do?id=<%=member.getId()%>">삭제</a></td>
		<tr>
			<%
				}
			%>
		
	</table>
</body>
</html>