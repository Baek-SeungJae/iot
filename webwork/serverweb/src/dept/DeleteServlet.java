package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = {"/dept/delete.do"})
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		DeptDAO dao = new DeptDAOImpl();
		String deptno = request.getParameter("deptno");
		System.out.println(deptno);
		int result = dao.delete(deptno);
		PrintWriter pw = response.getWriter();
		pw.print("<h1>삭제성공</h1>");
		pw.print("<hr/>");
		pw.print("<h3>"+result+"개 삭제</h3>");
		response.sendRedirect("/serverweb/list.do");
		pw.print("<a href='/serverweb/list.do'>목록보기</a>");
	}
}
