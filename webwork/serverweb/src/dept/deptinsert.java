package dept;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = {"/deptinsert.do"})
public class deptinsert extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		
		//2. �����Ͻ��޼ҵ� call
		DeptDTO deptdto = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO deptdao = new DeptDAOImpl();
		int result = deptdao.insert(deptdto);
		ArrayList<DeptDTO> insertDTO = new ArrayList<DeptDTO>();
		//3. ������ ����
		request.setAttribute("insertresult", result);
		
		//4. ����ȭ������ ��û������
		RequestDispatcher rd= request.getRequestDispatcher("/dept/insertResult.jsp");
		rd.forward(request, response);
		
		
	}
}
