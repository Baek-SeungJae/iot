package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{

	@RequestMapping("/test.do")
	public ModelAndView test() {
		System.out.println("컨트롤러요청완료");

		ModelAndView mav = new ModelAndView();
		String data="구구단";
		mav.addObject("msg", data);
		

		mav.setViewName("test/result");
		return mav;
	}

}
