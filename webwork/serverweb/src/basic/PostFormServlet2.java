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
		pw.print("<h1>������</h1>");
		pw.print("<h3>���̵�: " + userId + "</h3>");
		pw.print("<h3>����: " + userName + "</h3>");
		pw.print("<h3>�н�����: " + passwd + "</h3>");
		pw.print("<h3>����: " + gender + "</h3>");
		pw.print("<h3>����: " + job + "</h3>");
		pw.print("<h3>���ɻ�: ");

		for (int i = 0; i < item.length; i++) {
			if (i != item.length - 1)
				pw.print(item[i] + ",");
			else
				pw.println(item[i] + "</h3>");
		}
		pw.print("</body>");
		pw.print("</html>");

		/*
		 * System.out.println("������: " + req.getAttribute(getServletName()));
		 * System.out.println("��ûurl: " + req.getServletPath());
		 * System.out.println("Customer");
		 * System.out.println("--------------------------------");
		 * System.out.println("���̵�: " + userId); System.out.println("����: " +
		 * userName); System.out.println("�н�����: " + passwd);
		 * System.out.println("����: " + gender); System.out.println("����: " +
		 * job); System.out.print("���ɻ�: "); for (int i = 0; i < item.length;
		 * i++) { if (i != item.length - 1) System.out.print(item[i] + ",");
		 * else System.out.println(item[i]); }
		 */
	}
}
