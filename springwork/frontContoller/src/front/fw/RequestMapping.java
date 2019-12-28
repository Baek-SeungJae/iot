package front.fw;

import java.util.HashMap;

import member.customer.*;
import product.ProductList;

/*
 *  FrontServlet이 넘겨준 요청 path를 가지고 실제 실행할 클래스의 객체를 만들어서 리턴하는 작업을 수행
 *  => 미리 요청 path별로 실행할 실제 클래스를 등록한 설정파일을 보고 객체를 찾아서 생성
 *  	mycommand.properties파일에 등록된 요청 path를 보고 실행할 객체를 찾는다.
 *  	xml파일이나 properties파일을 파싱하는 코드를 정의
 */
public class RequestMapping {
	private HashMap<String,Action> actionMap = new HashMap<String, Action>();
	public RequestMapping() {
		//생성자 내부에서 설정파일을 파싱해서 객체로 만드는 코드가 필요하다.
		
	}
	public Action mapping(String path) {
		Action action = null;
		if(path.equals("/product/list.do")) {
			action = new ProductList();
		}else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		}else if(path.equals("/login.do")) {
			action = new LoginAction();
		}
		return action;
	}
}
