package jdbc.board.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
	
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
		//���ó��
		if(result>0) {
			System.out.println("�Խñ� ��� ����");
		}
		else {
			System.out.println("�Խñ� ��� ����");
		}
	}
	
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, Integer.parseInt(boardNum));
		//���ó��
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}
		else {
			System.out.println("�Խñ� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(Integer.parseInt(boardNum));
		//���ó��
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}
		else {
			System.out.println("�Խñ� ���� ����");
		}
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		for(int i=0; i<size; i++)
		{
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getId()+"\t"+board.getTitle()+"\t"+board.getPoint()+"\t");
		}
	}
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for(int i=0; i<size; i++)
		{
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getId()+"\t"+board.getTitle()+"\t"+board.getPoint()+"\t");
		}
	}
	
	public void selectDetail() {
		System.out.println("*******�Խñۻ���ȸ********");
		System.out.print("�۹�ȣ:");
		int boardNum = key.nextInt();
		BoardDTO board = dao.read(boardNum);
		if(board!=null)
			System.out.println(board.getBoardNum()+"\t"+board.getId()+"\t"+board.getTitle()+"\t"+board.getPoint()+"\t"+board.getContents()+"\t"+board.getTitle()+"\t"+board.getWriteDate());
	}
}
