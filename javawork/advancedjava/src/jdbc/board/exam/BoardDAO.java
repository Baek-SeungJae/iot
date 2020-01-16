package jdbc.board.exam;

import java.util.ArrayList;

//tb_board ���̺��� ������ �ϴ� ���
	public interface BoardDAO{
	int insert(BoardDTO board);
	int insert(String id, String title, String content);
	int update(String id, int num);	
	int delete(int num);	
	ArrayList<BoardDTO> select(); // ��ü �Խñ� ��ȸ
	BoardDTO read(int boardnum); // 
	ArrayList<BoardDTO> findByTitle(String title); // R

}