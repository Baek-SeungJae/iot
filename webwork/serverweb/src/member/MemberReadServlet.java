package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		MemberDAO dao = new MemberDAOImpl();
		String name = request.getParameter("name");
		MemberDTO dto = dao.readMember(name);
		request.setAttribute("readDTO", dto);
		RequestDispatcher rd= request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
		
	}

}
