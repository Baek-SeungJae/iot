<%@page import="dept.DeptDAOImpl"%>
<%@page import="dept.DeptDAO"%>
<%@page import="dept.DeptDTO"%>
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
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		System.out.println("����Ϸ�");
		DeptDTO deptdto = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO deptdao = new DeptDAOImpl();
		int result = deptdao.insert(deptdto);
	%>
	<h1><%=result%>�� �� ���Լ���</h1>
</body>
</html>