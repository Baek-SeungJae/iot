package multi.erp.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@RequestMapping("/menu/board.do")
	public String advancedView() {
		return "menu/board"; //board에 관한 정보
	}
	
	@Autowired
	BoardService service;
	@RequestMapping("/board/list.do")
	public ModelAndView boardList(String category) {
		ModelAndView mav = new ModelAndView();
		// 1.요청정보추출
		// 2.비지니스메소드호출
		List<BoardVO> list = service.boardList(category);
		
		// 3. 데이터 공유 - jsp페이지에서 응답뷰 만들때 사용
		// => 기본값 : request에 저장
		mav.addObject("boardlist",list);
		mav.addObject("category",category);
		// 4. 뷰의 이름을 등록
		mav.setViewName("board/list"); //tiles에 등록하는 이름과 일치
		// 5. 기본이 foward
		
		return mav;
	}
	@RequestMapping(value="/board/write.do", method =RequestMethod.GET)
	public String insertView() {
		return "board/write";		
	}
	
	@RequestMapping(value="/board/write.do", method =RequestMethod.POST)
	public String insert(BoardVO board) {
		System.out.println(board);
		int result = service.insert(board);
		return "redirect:/board/list.do?category=all";
	}
	@RequestMapping("/board/search.do")
	public ModelAndView search(String tag, String search) {
		ModelAndView mav = new ModelAndView();
		List<BoardVO> list = service.searchList(tag, search);
		mav.addObject("boardlist",list);
		return mav;
	}
	//Ajax로 카테고리별 게시판 데이터를 요청하는 메소드
	//=>컨트롤러처럼 ModelAndView를 리턴하는게 아니라 조회한 데이터를 ArrayList로 리턴하면 jackson라이브러리가 자동으로 ArrayList<BoardVO>를 json으로 변환해서 리턴해준다.
	@RequestMapping(value="/board/ajax_boardlist.do", method=RequestMethod.GET, produces="application/json;charset=utf-8")
	public @ResponseBody ArrayList<BoardVO> CategoryList(String category) {
		ArrayList<BoardVO> boardlist = (ArrayList<BoardVO>)service.boardList(category);
		System.out.println("ajax통신:"+boardlist.size());
		return boardlist;
	}
}
