package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.DeptDTO;

@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		//�����Ͱ����ϱ�
		pw.println("<h1>includedȭ��</h1>");
		pw.println("<hr/><hr/><hr/><hr/>");
		DeptDTO dept = new DeptDTO("001","�����","","","");
		request.setAttribute("mydata", dept);
		System.out.println("IncludeServlet����Ϸ�");
		
		//��û������
		RequestDispatcher rd= request.getRequestDispatcher("/jspbasic/subPage.jsp");
		rd.include(request, response);
		
		
	}

}