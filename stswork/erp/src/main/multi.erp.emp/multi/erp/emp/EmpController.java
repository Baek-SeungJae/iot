package multi.erp.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//emp테이블에서 작업하는 모든 내용에 대한 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpService service;

	// 로그인페이지를 보기위한 요청
	@RequestMapping(value = "/emp/login.do", method = RequestMethod.GET)
	public String mybatisView() {
		return "login"; // login에 대한 정보
	}

	// 로그인 처리를 위한 요청
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(MemberVO loginUserInfo, HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		MemberVO vo = service.login(loginUserInfo);
		// 로그인한 사용자의 정보를 세션에 저장
		// 세션을 생성
		//
		String viewName = "";
		if (vo != null) {
			HttpSession ses = request.getSession();
			ses.setAttribute("user",vo);
			// mav.addObject("user",vo);
			viewName = "login/ok";
			System.out.println(vo);
		}
		else
		{
			viewName = "login";
			System.out.println("로그인실패");
		}
		mav.setViewName(viewName);
		return mav;
	}
	@RequestMapping("/emp/logout.do")
	public String logout(HttpSession session) {
		if(session !=null)
			session.invalidate();
		return "redirect:/index.do";
	}
	@RequestMapping("/emp/insertView.do")
	public String insertView() {
		return "emp/insert";
	}
	
	// produces속성 : ajax 요청 후 클라이언트로 전송할 데이터의 타입을 정의
	//	application/text는 Ajax요청 후 클라이언트로 보내는 응답메시지의 타입이 text라는 뜻
	@RequestMapping(value="/emp/idCheck.do", method=RequestMethod.GET, produces="application/text;charset=utf-8")
	public @ResponseBody String idCheck(String id) {
		boolean state = service.idCheck(id);
		String result="";
		if(state) { //db에 이미 있다는 뜻
			result="사용 불가능한 아이디";
		}
		else {
			result="사용가능한 아이디";
		}
	
		return result;
	}
}