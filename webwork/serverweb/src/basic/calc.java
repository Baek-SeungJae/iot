package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalcServlet", urlPatterns = {"/calc.do"})
public class calc extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");

		int num1 = Integer.parseInt(request.getParameter("num1"));
		String method = request.getParameter("method");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		CalcLogic  calc= new CalcLogic();
		int result= calc.calc(num1,method,num2);
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h2>계산결과("+method+"연산적용)</h2>");
		pw.print("<h2>====================</h2>");
		pw.print("<h2>num1의"+ num1+"과 "+"num2의 "+num2+"을 연산한 결과는 "+ result +"입니다. </h2>");
		pw.print("</body>");
		pw.print("</html>");
	}

}
