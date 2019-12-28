package front.fw;

import java.util.HashMap;

import member.customer.*;
import product.ProductList;

/*
 *  FrontServlet�� �Ѱ��� ��û path�� ������ ���� ������ Ŭ������ ��ü�� ���� �����ϴ� �۾��� ����
 *  => �̸� ��û path���� ������ ���� Ŭ������ ����� ���������� ���� ��ü�� ã�Ƽ� ����
 *  	mycommand.properties���Ͽ� ��ϵ� ��û path�� ���� ������ ��ü�� ã�´�.
 *  	xml�����̳� properties������ �Ľ��ϴ� �ڵ带 ����
 */
public class RequestMapping {
	private HashMap<String,Action> actionMap = new HashMap<String, Action>();
	public RequestMapping() {
		//������ ���ο��� ���������� �Ľ��ؼ� ��ü�� ����� �ڵ尡 �ʿ��ϴ�.
		
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
