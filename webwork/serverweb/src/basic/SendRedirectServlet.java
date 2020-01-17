package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		//데이터공유하기
		pw.println("<h1>sendRedirect화면</h1>");
		DeptDTO dept = new DeptDTO("001","전산실","","","");
		request.setAttribute("mydata", dept);
		System.out.println("SendRedirectServlet실행완료");
		
		//요청재지정
		response.sendRedirect("/serverweb/jspbasic/subPage.jsp");
		
		
	}

}
