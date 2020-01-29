package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	// /index.do로 요청하면 'index'라는 이름의 뷰를 forward하겠다.
	//	=> index라는 뷰는 내 스프링 설정파일에 등록된 ViewResolver에 따라 다르게 설정한다.
	
	@RequestMapping("/index.do")
	public String main() {
		return "index"; //main에 대한 정보
	}
	
/*	@RequestMapping("/emp/login.do")
	public String mybatisView() {
		return "login"; //login에 대한 정보
	}
	@RequestMapping("/menu/board.do")
	public String advancedView() {
		return "menu/board"; //board에 관한 정보
	}*/
}
