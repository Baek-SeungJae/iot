package member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memInsert", urlPatterns = {"/member/insert.do"})
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String deptno = request.getParameter("deptno");
		String grade = request.getParameter("grade");
		int point = Integer.parseInt(request.getParameter("point"));
		//2. 비지니스메소드 call
		MemberDTO memberdto = new MemberDTO(id, pass, name, addr, deptno, grade, point);
		MemberDAO memberdao = new MemberDAOImpl();
		int result = memberdao.insert(memberdto);
		System.out.println(memberdto);
		//3. 데이터 공유
		request.setAttribute("insertresult", result);
		
		//4. 응답화면으로 요청재지정
		RequestDispatcher rd= request.getRequestDispatcher("/member/insertResult.jsp");
		rd.forward(request, response);
		
		
	}
}
