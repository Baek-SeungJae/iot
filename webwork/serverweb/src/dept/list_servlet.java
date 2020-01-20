package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = {"/list.do"})
public class list_servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		DeptDAO dao = new DeptDAOImpl();
		ArrayList<DeptDTO> list = dao.deptList();
		PrintWriter pw = response.getWriter();
		
		
		request.setAttribute("insertdto", list);
		
		RequestDispatcher rd= request.getRequestDispatcher("/dept/list.jsp");
		rd.include(request, response);
		/*
		pw.print("<h1>何辑格废</h1>");
		pw.print("<hr/>");
		pw.print("<table border='1' width='800' height='600' align='center'>");
		pw.print("<tr align='center'>");
		pw.print("<th>DeptNo</th>");
		pw.print("<th>DeptName</th>");
		pw.print("<th>Loc</th>");
		pw.print("<th>Tel</th>");
		pw.print("<th>Mgr</th>");
		pw.print("<th>昏力</th>");
		pw.print("</tr>");

		for (int i = 0; i < list.size(); i++) {
			DeptDTO dept = list.get(i);
			pw.print("<tr align='center'>");
			pw.print("<td>" + dept.getDeptno() + "</td>");
			pw.print("<td>" + dept.getDeptname() + "</td>");
			pw.print("<td>" + dept.getLoc() + "</td>");
			pw.print("<td>" + dept.getTel() + "</td>");
			pw.print("<td>" + dept.getMgr() + "</td>");
			pw.print("<td>" + "<a href='/serverweb/dept/delete.do?deptno="+dept.getDeptno()+"&info=test'>昏力</a>" + "</td>");
			pw.print("</tr>");

		}
		pw.print("</table>");
		*/
	}

}
