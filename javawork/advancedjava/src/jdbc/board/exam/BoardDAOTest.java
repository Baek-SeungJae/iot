package jdbc.board.exam;

import java.util.Scanner;


public class BoardDAOTest {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAOImpl();
		System.out.println("1:등록 2:삭제 3:수정 4:조회\n입력=>");
		int select = key.nextInt();
		
		switch(select) 
		{
			case 1 : 
			{
				System.out.println("********************게시글 등록***************");
				System.out.print("아이디: ");
				String id = key.next();
				System.out.print("제목: ");
				String title = key.next();
				System.out.print("내용: ");
				String content = key.next();
				System.out.println(dao.insert(id,title,content)+"개 삽입");
				break;
			}
			case 2 :
			{
				System.out.println("********************게시글 삭제***************");
				System.out.print("글번호: ");
				int num = key.nextInt();	
				System.out.println(dao.delete(num)+"개 삭제");
				break;
			}
			case 3 :
			{
				System.out.println("********************게시글 수정***************");
				System.out.print("아이디: ");
				String id = key.next();
				System.out.print("글번호: ");
				int num = key.nextInt();
				System.out.println(dao.update(id, num)+"개 수정");
				break;
			}
			case 4 :
			{
				System.out.println("********************게시글 조회***************");
				dao.select();
				break;
			}
			default :
				break;
		}
	}
}


