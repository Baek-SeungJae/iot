package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "front", urlPatterns = { "*.do", "*.jsp", "*.html" })
public class frontServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 요청 정보를 분석해서 추출 - 어떤 path로 요청할지???
		System.out.println("요청받기");
		System.out.println("request.getContextPath()=> " + request.getContextPath());
		System.out.println("request.getRequestURI()=> " + request.getRequestURI());
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length());
		System.out.println(path);

		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		action.run(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.
	}
}
