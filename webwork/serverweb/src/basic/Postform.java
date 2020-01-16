package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Postform extends HttpServlet {
	public Postform() {
	}
	public void init() {
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		if (req.getMethod().equals("GET")) {
			doGet(req, res);
		} else {
			doPost(req, res);
		}
	}
 
	public void destroy() {
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");

		String gender = req.getParameter("gender");

		String job = req.getParameter("job");

		String[] favorites = req.getParameterValues("item");

		System.out.println("서블릿명: " + req.getServletContext());
		System.out.println("요청url: " + req.getServletPath());
		System.out.println("Customer");
		System.out.println("--------------------------------");
		System.out.println("아이디: " + id);
		System.out.println("성명: " + name);
		System.out.println("패스워드: " + pass);
		System.out.println("성별: " + gender);
		System.out.println("직업: " + job);
		System.out.print("관심사: ");
		for (int i = 0; i < favorites.length; i++) {
			if (i != favorites.length - 1)
				System.out.print(favorites[i] + ",");
			else
				System.out.println(favorites[i]);
		}
	}
}
