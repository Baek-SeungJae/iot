package dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = {"/deptinsert.do"})
public class deptinsert extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost성공");
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");

		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		System.out.println("추출완료");
		DeptDTO deptdto = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO deptdao = new DeptDAOImpl();
		deptdao.insert(deptdto);
	}
}
