package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTest extends HttpServlet {
	public LifeCycleTest() {
		System.out.println("서블릿 객체 생성....");
	}
	public void init() {
		System.out.println("서블릿 객체의 초기화 init()....");
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("클라이언트의 요청 처리 service()" + req.getMethod());
		// getMethod()는 String을 리턴
		if (req.getMethod().equals("GET")) {
			doGet(req, res);
		} else {
			doPost(req, res);
		}
		// 요청방식이 get이면 doGet호출
		// 요청방식이 post면 doPost호출
	}

	public void destroy() {
		System.out.println("서블릿 객체 소멸 destroy()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doget()");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("dopost()");
	}
}
