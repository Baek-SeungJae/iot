package jdbc.board.exam;

import java.util.ArrayList;

//tb_board 테이블을 엑세스 하는 기능
	public interface BoardDAO{
	int insert(BoardDTO board);
	int insert(String id, String title, String content);
	int update(String id, int num);	
	int delete(int num);	
	ArrayList<BoardDTO> select(); // 전체 게시글 조회
	BoardDTO read(int boardnum); // 
	ArrayList<BoardDTO> findByTitle(String title); // R

}