package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Mypost2", urlPatterns = {"/Mypost2.do"})
public class PostFormServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");

		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>고객정보</h1>");
		pw.print("<h3>아이디: " + userId + "</h3>");
		pw.print("<h3>성명: " + userName + "</h3>");
		pw.print("<h3>패스워드: " + passwd + "</h3>");
		pw.print("<h3>성별: " + gender + "</h3>");
		pw.print("<h3>직업: " + job + "</h3>");
		pw.print("<h3>관심사: ");

		for (int i = 0; i < item.length; i++) {
			if (i != item.length - 1)
				pw.print(item[i] + ",");
			else
				pw.println(item[i] + "</h3>");
		}
		pw.print("</body>");
		pw.print("</html>");

		/*
		 * System.out.println("서블릿명: " + req.getAttribute(getServletName()));
		 * System.out.println("요청url: " + req.getServletPath());
		 * System.out.println("Customer");
		 * System.out.println("--------------------------------");
		 * System.out.println("아이디: " + userId); System.out.println("성명: " +
		 * userName); System.out.println("패스워드: " + passwd);
		 * System.out.println("성별: " + gender); System.out.println("직업: " +
		 * job); System.out.print("관심사: "); for (int i = 0; i < item.length;
		 * i++) { if (i != item.length - 1) System.out.print(item[i] + ",");
		 * else System.out.println(item[i]); }
		 */
	}
}
