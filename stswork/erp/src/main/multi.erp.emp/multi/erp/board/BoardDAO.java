package multi.erp.board;

import java.util.List;

public interface BoardDAO {
	//�Խñ���ü�����ȸ
	List<BoardVO> boardList();
	//�Խñ۵���ϱ�
	int insert(BoardVO board);
	List<BoardVO> searchList(String search);
	List<BoardVO> searchList(String tag,String search);
	List<BoardVO> pageList();
	//�Խñ���ȸ
	BoardVO read(String board_no);
	//�Խñۼ���
	int update(BoardVO board);
	//�Խñۻ���
	int delete(String board_no);
	List<BoardVO> categorySearch(String category);
}
