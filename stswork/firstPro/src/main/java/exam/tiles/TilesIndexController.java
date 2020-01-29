package exam.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//메뉴 화면을 보여주는 선택한대로 보여주는 컨트롤러
@Controller
public class TilesIndexController {
	@RequestMapping("/exam/index.do")
	public String index() {
		return "index";//
	}
	
	@RequestMapping("/menu/mybatis.do")
	public String mybatisView() {
		return "menu/mybatis";
	}
	@RequestMapping("/menu/advanced.do")	
	public String advancedView() {
		return "menu/advanced";
	}
}
