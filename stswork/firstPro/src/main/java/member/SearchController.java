package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController{
	@RequestMapping("search.do")
	public ModelAndView search(String search)//index.jsp에서 form안에 name=search라고 정의된 부분을 가져온것임
	{
		System.out.println("검색어: "+search);
		return new ModelAndView("test/index");
	}
}
