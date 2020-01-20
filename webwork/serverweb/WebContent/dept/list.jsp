<%@page import="dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>부서목록</h1>
	<hr />
	<table border='1' width='800' height='600' align='center'>
	<tr align='center'>
		<th>DeptNo</th>
		<th>DeptName</th>
		<th>Loc</th>
		<th>Tel</th>
		<th>Mgr</th>
		<th>삭제</th>
		</tr>
		<%
			ArrayList<DeptDTO> dto = (ArrayList<DeptDTO>)request.getAttribute("insertdto");
			
			for (int i = 0; i < dto.size(); i++) {
				DeptDTO dept = dto.get(i);
				%>
				<tr>
				
				<td><%= dept.getDeptno() %></td>
				<td><a href="/serverweb/dept/read.do?deptNo=<%=dept.getDeptno() %>"><%= dept.getDeptname() %></a></td>
				<td><%= dept.getLoc() %></td>
				<td><%= dept.getTel() %></td>
				<td><%= dept.getMgr() %></td>
				<td><a href='/serverweb/dept/delete.do?deptno=<%=dept.getDeptno()%>'>삭제</a></td><tr>
				
				<%
			}
		%>
	</table>

</body>
</html>