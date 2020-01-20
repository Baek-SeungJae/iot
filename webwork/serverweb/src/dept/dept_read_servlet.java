package dept;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "deptread", urlPatterns = { "/dept/read.do" })
public class dept_read_servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		DeptDAO dao = new DeptDAOImpl();
		String deptNo = request.getParameter("deptNo");
		DeptDTO dto = dao.readDept(deptNo);
		request.setAttribute("readDTO", dto);
		RequestDispatcher rd= request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.include(request, response);
	}
}
