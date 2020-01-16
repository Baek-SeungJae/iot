package jdbc.board.exam;

import java.util.Scanner;


public class BoardDAOTest {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAOImpl();
		System.out.println("1:��� 2:���� 3:���� 4:��ȸ\n�Է�=>");
		int select = key.nextInt();
		
		switch(select) 
		{
			case 1 : 
			{
				System.out.println("********************�Խñ� ���***************");
				System.out.print("���̵�: ");
				String id = key.next();
				System.out.print("����: ");
				String title = key.next();
				System.out.print("����: ");
				String content = key.next();
				System.out.println(dao.insert(id,title,content)+"�� ����");
				break;
			}
			case 2 :
			{
				System.out.println("********************�Խñ� ����***************");
				System.out.print("�۹�ȣ: ");
				int num = key.nextInt();	
				System.out.println(dao.delete(num)+"�� ����");
				break;
			}
			case 3 :
			{
				System.out.println("********************�Խñ� ����***************");
				System.out.print("���̵�: ");
				String id = key.next();
				System.out.print("�۹�ȣ: ");
				int num = key.nextInt();
				System.out.println(dao.update(id, num)+"�� ����");
				break;
			}
			case 4 :
			{
				System.out.println("********************�Խñ� ��ȸ***************");
				dao.select();
				break;
			}
			default :
				break;
		}
	}
}


