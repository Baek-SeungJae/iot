package jdbc.exam;

import java.util.Scanner;
public class CustomerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******customer********");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		int c = key.nextInt();
		CustomerDAO dao = new CustomerDAO();
		
		switch(c) {
			case 1:{
				System.out.println("*******사원등록********");
				System.out.print("아이디:");
				String id = key.next();
				System.out.print("패스워드:");
				String pass = key.next();
				System.out.print("성명:");
				String name = key.next();
				System.out.print("점수:");
				int point = key.nextInt();
				System.out.print("주소:");
				String addr = key.next();
				CustomerDTO member = new CustomerDTO(id,pass,name,point,addr);
				int result = dao.insert(member);
				if(result>0) {
					System.out.println("등록 성공");
				}
				else {
					System.out.println("등록 실패");
				}
				break;
			}
			case 2:{
				System.out.println("*******사원수정********");
				System.out.print("아이디:");
				String id = key.next();
				System.out.print("주소:");
				String addr = key.next();
				int result = dao.update(id, addr);
				if(result>0) {
					System.out.println("사원 수정 성공");
				}
				else {
					System.out.println("사원 수정 실패");
				}
				break;
			}
			case 3:{
				System.out.println("*******사원삭제********");
				System.out.print("아이디:");
				String id = key.next();
				int result = dao.delete(id);
				if(result>0) {
					System.out.println("삭제 성공");
				}
				else {
					System.out.println("삭제 실패");
				}
				break;
			}
			
		}
	}
}
